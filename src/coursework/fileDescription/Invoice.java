package coursework.fileDescription;

import coursework.fileDescription.path.CheckingPath;

import java.io.File;
import java.util.LinkedList;

public class Invoice{

    public static void openingInvoices(String path) {
        String wayInvoices = path + "//invoices";
        File invoice = new File(wayInvoices);
        if (CheckingPath.checkingForFolders(invoice, "invoices")) {

            File[] invoices = invoice.listFiles();
            LinkedList<File> fileCheck = FileChecking.fileTypeCheck(invoices);
            LinkedList<File> fileCheck1 = FileChecking.fileYearCheck(fileCheck);
            LinkedList<File>fileCheck2=FileChecking.fileStructureCheck(fileCheck1);
            System.out.println(fileCheck2);
        }
    }
}
