package coursework.fileDescription.path;

import java.io.File;

public class CheckingPath {

    public static boolean checkingForFolders(File file1, String massage){
        if (!file1.exists()) {
            System.out.println(massage+ " not found!");
            return false;
        }
        return true;
    }
}
