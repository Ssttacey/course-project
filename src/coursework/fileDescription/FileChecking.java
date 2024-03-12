package coursework.fileDescription;

import java.io.File;

public class FileChecking {

    public static boolean fileTypeCheck(File file){
        return file.getName().endsWith(".txt");
    }

    public static boolean fileYearCheck(File file){
        return file.getName().endsWith("2023.txt") || file.getName().startsWith("2023") || file.getName().endsWith("2023_realhandy.txt");
    }

    public static boolean fileStructureCheck(File file){
            if (file.getAbsolutePath().contains("invoices")){
                return file.getName().toLowerCase().startsWith("invoice");
            } else if (file.getAbsolutePath().contains("checks")) {
                return file.getName().toLowerCase().contains("electric_bill");
            } else if (file.getAbsolutePath().contains("orders")) {
                return file.getName().toLowerCase().contains("order");
            }
        return false;
    }

    public static boolean fileIsTrue(File file){
        return fileTypeCheck(file) && fileYearCheck(file) && fileStructureCheck(file);
    }
}
