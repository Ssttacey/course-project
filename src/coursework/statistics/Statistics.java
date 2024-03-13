package coursework.statistics;

import coursework.fileDescription.Check;
import coursework.fileDescription.Invoice;
import coursework.fileDescription.Order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Statistics {

    public static double sumChecks(String path) throws IOException {
        Check.openingChecks(path);
        double sum=0;
        for (int i=0; i<Check.openingChecks(path).size(); i++){
            BufferedReader reader = new BufferedReader(new FileReader(Check.openingChecks(path).get(i)));
            String str;
            while ((str=reader.readLine())!=null){
                sum+=ProcessingAStringInAFile.searchForCheckAmount(str);

            }
        }
        return sum;
    }

    public static double sumInvoices(String path) throws IOException {
        Invoice.openingInvoices(path);
        double sum=0;
        for (int i=0; i<Invoice.openingInvoices(path).size(); i++){
            BufferedReader reader = new BufferedReader(new FileReader(Invoice.openingInvoices(path).get(i)));
            String str;
            while ((str=reader.readLine())!=null){
                sum+= ProcessingAStringInAFile.searchForInvoiceAmount(str);
            }
        }
        return sum;
    }

    public static double sumOrders(String path) throws IOException {
        Order.openingOrders(path);
        double sum=0;
        for (int i=0; i<Order.openingOrders(path).size(); i++){
            BufferedReader reader = new BufferedReader(new FileReader(Order.openingOrders(path).get(i)));
            String str;
            while ((str=reader.readLine())!=null){
                sum+=ProcessingAStringInAFile.searchForOrderAmount(str);
            }
        }
        return sum;
    }
}
