package coursework.runner;

import coursework.documentation.Check;
import coursework.path.EnterThePath;
import coursework.documentation.Invoice;
import coursework.documentation.Order;
import coursework.entrance.Entrance;


public class Runner {
    public static void main(String[] args){
        Entrance.loginAndPassword();
        String path=EnterThePath.enterThePath();
        Invoice.openingInvoices(path);
        System.out.println("\n\n\n\n\n");
        Check.openingChecks(path);
        System.out.println("\n\n\n\n\n");
        Order.openingOrders(path);
    }
}
