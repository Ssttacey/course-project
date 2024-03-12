package coursework.statistics;

import coursework.fileDescription.Check;
import coursework.fileDescription.Invoice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Statistics {

    public static void sumChecks(String path) throws IOException {
        Check.openingChecks(path);
        double sum=0;
        for (int i=0; i<Check.openingChecks(path).size(); i++){
            BufferedReader reader = new BufferedReader(new FileReader(Check.openingChecks(path).get(i)));
            String str;
            while ((str=reader.readLine())!=null){
                sum+=ProcessingAStringInAFile.searchForCheckAmount(str);

            }
        }
        String trueSum = new DecimalFormat("#0.00").format(sum);
        System.out.println(trueSum);
    }

    public static void sumInvoices(String path) throws IOException {
        Invoice.openingInvoices(path);
        double sum=0;
        for (int i=0; i<Invoice.openingInvoices(path).size(); i++){
            BufferedReader reader = new BufferedReader(new FileReader(Invoice.openingInvoices(path).get(i)));
            String str;
            while ((str=reader.readLine())!=null){
                sum+=ProcessingAStringInAFile.searchForInvoiceAmount(str);
            }
        }
        String trueSum = new DecimalFormat("#0.00").format(sum);
        System.out.println(trueSum);
    }
}
