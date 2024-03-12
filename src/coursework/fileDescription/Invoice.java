package coursework.fileDescription;

import coursework.fileDescription.path.CheckingPath;
import coursework.invalidFiles.InvalidFiles;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;

public class Invoice{

    public static LinkedList<File> openingInvoices(String path) throws IOException {
        String wayInvoices = path + "//invoices";
        File invoice = new File(wayInvoices);
        LinkedList<File>trueInvoices=new LinkedList<>();
        if (CheckingPath.checkingForFolders(invoice, "invoices")) {

            File[] invoices = invoice.listFiles();
            for (File oneInvoice: Objects.requireNonNull(invoices)){
                if (FileChecking.fileIsTrue(oneInvoice)){
                    trueInvoices.add(oneInvoice);
                }else {
                    InvalidFiles.invalidFiles(oneInvoice);
                }
            }
        }
        return trueInvoices;
    }
}
