package coursework.statistics;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class FileWithStatistic {

    public static void fileWithStatistic(String path) throws IOException {
        double sum1=Statistics.sumChecks(path);
        double sum2=Statistics.sumInvoices(path);
        double sum3=Statistics.sumOrders(path);
        double finalSum=sum1+sum2+sum3;
        FileWriter finalWriter = new FileWriter(IFinalPath.finalPath, true);

        String sum1STR=new DecimalFormat("#0.00").format(sum1);
        String sum2STR=new DecimalFormat("#0.00").format(sum2);
        String sum3STR=new DecimalFormat("#0.00").format(sum3);
        String finalSumSTR=new DecimalFormat("#0.00").format(finalSum);

        finalWriter.write("checks sum: "+sum1STR+"\n");
        finalWriter.write("invoices sum: "+sum2STR+"\n");
        finalWriter.write("orders sum: "+ sum3STR+"\n");
        finalWriter.write("total turnover: "+finalSumSTR);
        finalWriter.close();
    }
}
