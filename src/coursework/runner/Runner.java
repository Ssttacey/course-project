package coursework.runner;

import coursework.fileDescription.Order;
import coursework.fileDescription.path.EnterThePath;
import coursework.statistics.Statistics;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) throws IOException {
        //Entrance.loginAndPassword();
        String path= EnterThePath.enterThePath();
        Statistics.sumChecks(path);
        System.out.println();
        Statistics.sumInvoices(path);
        Order.openingOrders(path);
    }
}
