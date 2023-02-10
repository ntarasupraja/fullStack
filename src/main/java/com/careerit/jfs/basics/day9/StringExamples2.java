package com.careerit.jfs.basics.day9;

import java.util.Locale;

public class StringExamples2 {
    public static void main(String[] args) {
        String name="LIRIL";
        System.out.println(name.charAt(0));
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        System.out.println(isPalindrome(name));

        String arr="Mom,Dad,Liril,john,12321";
        String[] arr1=arr.split(",");
        for(String names:arr1){
            if (isPalindrome(names.toLowerCase())){
                System.out.println(names);
            }

        }
    }
    public static boolean isPalindrome(String data){
        for(int i=0,j=data.length()-1; i<=j;i++,j--){
            if(data.charAt(i)==data.charAt(j)) {
                return true;
            }
        }
        return false;
    }




}
