package coursework.entrance;

import java.util.Objects;
import java.util.Scanner;

public class Entrance {

    private static boolean inputValidation(String login, String password) {
        if (Objects.equals(login, IInputValidation.login)) {
            return Objects.equals(password, IInputValidation.password);
        }
        return false;
    }

    public static boolean loginAndPassword(){
        Scanner scanner = new Scanner(System.in);
        byte loginAttempts=5;
        System.out.print("Login: ");
        String login = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();
        if (inputValidation(login, password)){
            return true;
        }
        while(!inputValidation(login, password)){
            loginAttempts--;
            System.out.println("wrong login or password\n");
            if (loginAttempts==0){
                System.out.println("Access closed!!!!!!!");
                break;
            }else{
                System.out.println(loginAttempts+" login attempts left");
            }
            System.out.println("enter your login again: ");
            login= scanner.next();
            System.out.println("enter your password again: ");
            password=scanner.next();
        }
        return false;
    }
}
