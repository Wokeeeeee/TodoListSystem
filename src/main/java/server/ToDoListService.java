package server;


import bean.TodoListItem;
import bean.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

@WebService(name = "todolistService", portName = "todolistPort", targetNamespace = "http://www.javaedu.com")
public class ToDoListService {
    private Vector<TodoListItem> todoListItemVector;
    private Vector<User> userVector;
    private User curUser;
    private SimpleDateFormat myFmt = new SimpleDateFormat("yyyy/MM/dd/HH:mm");

    public ToDoListService() {
        todoListItemVector = new Vector<>();
        userVector = new Vector<>();
    }

    private boolean isExist(String name, String pwd) {
        for (User u : userVector) {
            if (u.getName().equals(name) && u.getPwd().equals(pwd)) {
                return true;
            }
        }
        return false;
    }

    @WebMethod
    public String register(String name, String pwd) {
        if (isExist(name, pwd)) {
            return "REGISTER FAIL: this account has been in existence, you can directly log in.";
        }
        userVector.add(new User(name, pwd));
        return "REGISTER SUCCESS.";
    }

    @WebMethod
    public String login(String name, String pwd) {
        if (!isExist(name, pwd)) {
            return "LOGIN FAIL: your account dosn't exist, please register first.";
        }
        this.curUser = new User(name, pwd);
        return "LOGIN SUCCESS.";
    }

    @WebMethod
    public String addItem(String start_time, String end_time, String dscp) throws ParseException {
        Date start, end;
        try {
            start = myFmt.parse(start_time);
            end = myFmt.parse(end_time);
        } catch (ParseException ignored) {
            return "addItem FAIL: time format is wrong, the correct augument format should be like 2021/10/25/10:20";
        }
        if (!start.before(end)) return "addItem FAIL: start time shoud be earlier than end time";
        todoListItemVector.add(new TodoListItem(start, end, dscp.trim(), curUser));
        return "addItem SUCCESS.";
    }

    @WebMethod
    public String queryItem(String start_time, String end_time) {
        Date start, end;
        try {
            start = myFmt.parse(start_time);
            end = myFmt.parse(end_time);
        } catch (ParseException ignored) {
            return "queryItem FAIL: time format is wrong, the correct augument format should be like 2021/10/25/10:20";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("----OUTPUT LIST----\n");
        for (TodoListItem item : todoListItemVector) {
            if (start.before(item.getStart_time()) && end.after(item.getEnd_time())) {
                sb.append(item).append("\n");
            }
        }
        return sb.toString();
    }

    @WebMethod
    public String deleteItem(String uuid) {
        //不是他创建的，他没有权限
        for (TodoListItem item : todoListItemVector) {
            if (item.getUuid().equals(uuid) && item.getUser().equals(curUser)) {
                todoListItemVector.remove(item);
                return "deleteItem SUCCESS.";
            }
        }
        return "deleteItem FAIL: there is no todolist with this uuid in your todoListVector.";
    }

    @WebMethod
    public String clearItem() {
        Iterator<TodoListItem> it = todoListItemVector.iterator();
        while (it.hasNext()) {
            TodoListItem item = it.next();
            if (item.getUser().equals(curUser)) it.remove();
        }
        return "clearItem SUCCESS.";
    }

    @WebMethod
    public String getItemList() {
        StringBuilder sb = new StringBuilder();
        sb.append("----OUTPUT LIST----\n");
        for (TodoListItem item : todoListItemVector) {
            if (item.getUser().equals(curUser)) {
                sb.append(item).append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8001/webservice/todolistService", new ToDoListService());
        //wsimport -keep http://127.0.0.1:8001/webservice/todolistservice?wsdl
    }
}
