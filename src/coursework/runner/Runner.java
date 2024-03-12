package coursework.runner;

import coursework.fileDescription.Check;
import coursework.fileDescription.path.EnterThePath;
import coursework.fileDescription.Invoice;
import coursework.fileDescription.Order;
import coursework.entrance.Entrance;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) throws IOException {
        Entrance.loginAndPassword();
        String path=EnterThePath.enterThePath();
        Invoice.openingInvoices(path);
        System.out.println("\n\n\n\n\n");
        Check.openingChecks(path);
        System.out.println("\n\n\n\n\n");
        Order.openingOrders(path);
    }
}
