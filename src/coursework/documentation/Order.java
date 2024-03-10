package coursework.documentation;

import coursework.path.CheckingPath;

import java.io.File;
import java.util.LinkedList;

public class Order{

    public static void openingOrders(String path) {
        String wayOrders = path + "//orders";
        File order = new File(wayOrders);
        if (CheckingPath.checkingForFolders(order, "Orders")) {

            File[] orders = order.listFiles();
            LinkedList<File> fileCheck=FileChecking.fileTypeCheck(orders);
            LinkedList<File>fileCheck1=FileChecking.fileYearCheck(fileCheck);
            LinkedList<File>fileCheck2=FileChecking.fileStructureCheck(fileCheck1);
            System.out.println(fileCheck2);
        }
    }
}
