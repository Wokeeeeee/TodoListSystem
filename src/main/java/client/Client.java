package client;

import com.javaedu.TodoListService;
import com.javaedu.TodoListServiceService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private TodoListService todoListService;
    private SimpleDateFormat myFmt = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
    private String name;
    private String pwd;


    public Client() {
        todoListService = new TodoListServiceService().getTodolistServicePort();
        name = null;
        pwd = null;
    }


    public void run() throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            printMenu();
            String cmd[] = bufferedReader.readLine().split(" ");
            if (!isLogin()) {//非登录状态
                if (cmd[0].equals("register")) {
                    if (cmd.length != 3) {
                        System.out.println("REGISTER ERROR: arguments wrong, correct arguments should be like register [name] [password]");
                        continue;
                    }
                    System.out.println(todoListService.register(cmd[1], cmd[2]));
                }
                else if (cmd[0].equals("login")) {
                    if (cmd.length != 3) {
                        System.out.println("LOGIN ERROR: arguments wrong, correct arguments should be like login [name] [password]");
                        continue;
                    }
                    this.name = cmd[1];
                    this.pwd = cmd[2];
                    System.out.println(todoListService.login(cmd[1], cmd[2]));
                }
                else if (cmd[0].equals("quit")) {
                    break;
                }
                else {
                    System.out.println("please login first.");
                }
            }
            else {//登录状态
                /*add item*/
                if (cmd[0].equals("add")) {
                    if (cmd.length < 4) {
                        System.out.println("AddItem ERROR: arguments wrong, correct arguments should be like add [start_time] [end_time] [descriptions]");
                        continue;
                    }
                    Date start, end;
                    try {
                        start = myFmt.parse(cmd[1]);
                        end = myFmt.parse(cmd[2]);
                    } catch (ParseException ignored) {
                        System.out.println("AddItem ERROR: date format should be like YY/MM/DD/HH:mm");
                        continue;
                    }
                    String desp = "";
                    for (int i = 3; i < cmd.length; i++) {
                        desp += cmd[i] + " ";
                    }
                    System.out.println(todoListService.addItem(start, end, desp));

                }
                else if (cmd[0].equals("getItemList")){
                    System.out.println(todoListService.getItemList());
                }

            }

        }
    }

    public static void main(String[] args) {
        try {
            new Client().run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private boolean isLogin() {
        return name != null && pwd != null;
    }

    private void logout() {
        name = null;
        pwd = null;
    }

    private void printMenu() {
        if (isLogin()) {
            System.out.print(SystemMenu());
        }
        else {
            System.out.print(welcomeMenu());
        }
    }

    private String welcomeMenu() {
        return new StringBuilder().append("welcome to TodoListSystem,\n")
                .append("before you use this system, you must register and login,\n")
                .append("here is some helps:\n")
                .append("1. register [name] [password]\n")
                .append("2. login [name] [password]\n")
                .append("3. quit\n")
                .append("please enter your command: >").toString();
    }

    private String SystemMenu() {
        return new StringBuilder().append("TodoListSystem provides the following operations for users:\n")
                .append("1.add todoList Item :  add [start_time] [end_time] [descriptions]\n")
                .append("2.delete todoListItem : delete [item_id]\n")
                .append("3.query todoListItem : query [start_time] [end_time]\n")
                .append("4.clear todoListItem : clear")
                .append("5.getItemList : getItemList\n")
                .append("6.logout\n")
                .append("notes: time data formation should be like YYYY/MM/DD/HH:mm\n")
                .append("notes: make sure you make the arguments correct for each command\n")
                .append("please enter your command: >").toString();
    }
}
