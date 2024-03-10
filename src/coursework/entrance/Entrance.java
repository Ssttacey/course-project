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

    public static void loginAndPassword() {
        Scanner scanner = new Scanner(System.in);
        byte x=0;
        do {
            System.out.print("Login: ");
            String login = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();
            if (inputValidation(login, password)) {
                System.out.println("Login to the program is complete");
                x=1;
            } else {
                System.out.println("wrong login or password");
            }
        } while (x!=1);
    }
}
