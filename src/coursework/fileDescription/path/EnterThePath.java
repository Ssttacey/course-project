package coursework.fileDescription.path;

import java.io.File;
import java.util.Scanner;

public class EnterThePath {
    public static String enterThePath(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the path to the folder: ");
        String path= scanner.nextLine();
        scanner.close();
        EnterThePath.pathChecking(path);
        return path;
    }

    private static void pathChecking(String path){
        File file=new File(path);
        if (!file.exists()){
            System.out.println("The file does not exist");
            System.exit(1);
        }
    }
}
