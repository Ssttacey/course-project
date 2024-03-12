package coursework.fileDescription;

import coursework.fileDescription.path.CheckingPath;
import coursework.invalidFiles.InvalidFiles;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;

public class Order{

    public static LinkedList<File> openingOrders(String path) throws IOException {
        String wayOrders = path + "//orders";
        File order = new File(wayOrders);
        LinkedList<File>trueOrders=new LinkedList<>();
        if (CheckingPath.checkingForFolders(order, "Orders")) {

            File[] orders = order.listFiles();
            for (File oneOrder: Objects.requireNonNull(orders)){
                if (FileChecking.fileIsTrue(oneOrder)){
                    trueOrders.add(oneOrder);
                }else {
                    InvalidFiles.invalidFiles(oneOrder);
                }
            }
        }
        return trueOrders;
    }
}
