package server;


import bean.TodoListItem;
import bean.User;
import com.sun.xml.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Date;
import java.util.Vector;

@WebService(name = "todolistService", portName = "todolistPort", targetNamespace = "http://www.javaedu.com")
public class ToDoListService {
    private Vector<TodoListItem> todoListItemVector;
    private Vector<User> userVector;
    private String name;
    private String pwd;

    public ToDoListService() {
        todoListItemVector = new Vector<>();
        userVector = new Vector<>();
    }

    private boolean isExist(String name, String pwd) {
        for (User u : userVector) {
            System.out.println(u);
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
        this.name = name;
        this.pwd = pwd;
        return "LOGIN SUCCESS.";
    }

    @WebMethod
    public String addItem(Date start_time, Date end_time, String dscp) {
        if (!start_time.before(end_time)) return "add FAIL: start_time should be earlier than end_time.";
        todoListItemVector.add(new TodoListItem(start_time, end_time, dscp));
        return "addItem SUCCESS.";
    }

    @WebMethod
    public String queryItem(Date start_time, Date end_time) {
        return "query";
    }

    @WebMethod
    public String deleteItem(String uuid) {
        return "delete";
    }

    @WebMethod
    public String clearItem() {
        return "clear";
    }

    @WebMethod
    public String getItemList() {
        StringBuilder sb = new StringBuilder();
        for (TodoListItem item : todoListItemVector) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8001/webservice/todolistService", new ToDoListService());
        //wsimport -keep http://127.0.0.1:8001/webservice/todolistservice?wsdjl
    }
}
