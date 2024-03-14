package coursework.entrance;

import coursework.util.constant.IInputValidation;
import coursework.logger.LogRecorder;
import coursework.runner.Runner;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import static coursework.util.constant.ILogMessages.*;

/**
 *The entrance class contains two methods required for the user to enter login and password.
 * The inputValidation method compares the entered login and password with what is stored in the program and is considered correct.
 *
 * The loginAndPassword method asks the user for a password and login using the scanner class.
 * To compare them, the inputValidation method is called.
 */
public class Entrance extends Runner implements IInputValidation {

    private static boolean inputValidation(String login, String password) {
        if (Objects.equals(login, IInputValidation.login)) {
            return Objects.equals(password, IInputValidation.password);
        }
        return false;
    }

    public static boolean loginAndPassword() throws IOException {
        LogRecorder.logInfo(START_INFO_MESSAGES_LOGS);
        Scanner scanner = new Scanner(System.in);
        byte loginAttempts = 5;
        System.out.print("Login: ");
        String login = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();
        if (inputValidation(login, password)) {
            LogRecorder.logCompl(COMPLETE_INFO_MES_LOGS + "Login done");
            return true;
        }
        while (!inputValidation(login, password)) {
            loginAttempts--;
            System.out.println("wrong login or password\n");
            if (loginAttempts == 0) {
                System.out.println("Access closed!!!!!!!");
                LogRecorder.logCompl(COMPLETE_INFO_MES_LOGS + "Program closed");
                break;
            } else {
                System.out.println(loginAttempts + " login attempts left");
            }
            System.out.println("enter your login again: ");
            login = scanner.next();
            System.out.println("enter your password again: ");
            password = scanner.next();
            while (inputValidation(login, password)) {
                return true;
            }
        }
        scanner.close();
        return false;
    }
}
