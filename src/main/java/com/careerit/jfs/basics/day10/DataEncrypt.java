package com.careerit.jfs.basics.day10;

public class DataEncrypt {
    public static void main(String[] args) {
        String data = "Satya,2000,76564679:Naresh,7576.0,34453654678:Tara,-6578,76867576567";
        showsendAlert(data);

    }

    public static void showsendAlert(String data) {
        //Hello Tara, your account ********567 is credited with amount {}
        String[] transactionDetails = data.split(":");
        for (String transaction : transactionDetails) {
            String[] arr=transaction.split(",");
            String accNum = arr[2];
            String name = arr[0];
            String transactiontype=null;
            double amount=Double.parseDouble(arr[1]);
            if(amount>0){
                transactiontype="is Credited";
            }
            else {
                transactiontype="is Debited";
                amount=-amount;
            }
            StringBuilder sb = new StringBuilder("Hello ")
                    .append(name)
                    .append(" Your account")
                    .append(" ")
                    .append(maskaccount(accNum))
                    .append(transactiontype)
                    .append(" ")
                    .append("with amount").append(" ")
                    .append(amount)
                    .append(".");
            System.out.println(sb.toString());
            System.out.println("-".repeat(100));
        }
    }
    private static String maskaccount(String accNum){
        return "********"+accNum.substring(accNum.length()-3);
    }
}
