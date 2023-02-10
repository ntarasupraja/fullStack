package com.careerit.jfs.basics.day9;

public class StringExampleIndexOf {
    public static void main(String[] args) {
        String email="deepu@gmail.com,srinika@gmail.com,suppu@gmail.com";
        String[] arr=email.split(",");
        for (String ele:arr){
            if(isValidemail(ele)){
                String name=ele.substring(0,ele.indexOf("@"));
                name=name.substring(0,1).toUpperCase()+name.substring(1);
                System.out.println(name);
            }

        }
    }
    public static boolean isValidemail(String mail){
        if(mail.indexOf("@")!=-1 && mail.indexOf(".")!=-1){
            return true;
        }
        else {
            return false;
        }
    }
}
