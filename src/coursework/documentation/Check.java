package coursework.documentation;

import coursework.path.CheckingPath;

import java.io.File;
import java.util.LinkedList;


public class Check {

    public static void openingChecks(String path){
        String wayChecks =path+"//checks";
        File check = new File(wayChecks);
        if(CheckingPath.checkingForFolders(check, "checks")){

            File[]checks=check.listFiles();
            LinkedList<File>fileCheck=FileChecking.fileTypeCheck(checks);
            LinkedList<File>fileCheck1=FileChecking.fileYearCheck(fileCheck);
            LinkedList<File>fileCheck2=FileChecking.fileStructureCheck(fileCheck1);
            System.out.println(fileCheck2);
        }
    }
}