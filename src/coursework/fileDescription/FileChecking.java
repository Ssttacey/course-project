package coursework.fileDescription;

import java.io.File;
import java.util.LinkedList;
import java.util.Objects;

public class FileChecking {

    public static LinkedList<File>fileTypeCheck(File[]files){
        LinkedList<File> txtFiles=new LinkedList<>();
        for (File oneFile: Objects.requireNonNull(files)) {
            if(oneFile.getName().endsWith(".txt")){
                txtFiles.add(oneFile);
            }
        }
        return txtFiles;
    }

    public static LinkedList<File>fileYearCheck(LinkedList<File> files){
        LinkedList<File> yearFiles=new LinkedList<>();
        for (File oneFile: Objects.requireNonNull(files)) {
            if(oneFile.getName().endsWith("2023.txt")||oneFile.getName().startsWith("2023")||oneFile.getName().endsWith("2023_realhandy.txt")){
                yearFiles.add(oneFile);
            }
        }
        return yearFiles;
    }

    public static LinkedList<File>fileStructureCheck(LinkedList<File> files){
        LinkedList<File> structureFiles=new LinkedList<>();
        for (File oneFile: Objects.requireNonNull(files)) {
            if (oneFile.getAbsolutePath().contains("invoices")){
                if (oneFile.getName().toLowerCase().startsWith("invoice")){
                    structureFiles.add(oneFile);
                }
            } else if (oneFile.getAbsolutePath().contains("checks")) {
                if (oneFile.getName().toLowerCase().contains("electric_bill")){
                    structureFiles.add(oneFile);
                }
            } else if (oneFile.getAbsolutePath().contains("orders")) {
                if (oneFile.getName().toLowerCase().contains("order")){
                    structureFiles.add(oneFile);
                }
            }
        }
        return structureFiles;
    }
}
