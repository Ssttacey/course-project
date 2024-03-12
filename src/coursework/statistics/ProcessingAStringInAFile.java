package coursework.statistics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessingAStringInAFile {

    public static double searchForCheckAmount(String str){
        double num=currencyTransfer(str);
        if (str.contains("Bill total amount")){
            Pattern pattern = Pattern.compile("[0-9]*[.,][0-9]+$");
            Matcher numStr = pattern.matcher(str);
            while(numStr.find()){
                String newNumStr=numStr.group().replace(",",".");
                num=num*Double.parseDouble(newNumStr);

            }
        }
        return num;
    }

    public static double searchForInvoiceAmount(String str){
        double num=currencyTransfer(str);
        if (str.toLowerCase().contains("total amount")||str.toLowerCase().contains("total")){
            Pattern pattern = Pattern.compile("[0-9]*[.,][0-9]+$");
            Matcher numStr = pattern.matcher(str);
            while(numStr.find()){
                String newNumStr=numStr.group().replace(",",".");
                num=num*Double.parseDouble(newNumStr);

            }
        }
        return num;
    }

    private static double currencyTransfer(String str){
        double trueAmount=0;
        if (str.contains("GBR")){
            trueAmount=ICurrency.GBR_USD;
        } else if (str.contains("EURO")) {
            trueAmount=ICurrency.EURO_USD;
        } else if (str.contains("$")){
            trueAmount=ICurrency.USD;
        }
        return trueAmount;
    }
}
