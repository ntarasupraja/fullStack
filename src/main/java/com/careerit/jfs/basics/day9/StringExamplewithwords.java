package com.careerit.jfs.basics.day9;

public class StringExamplewithwords {
    public static void main(String[] args) {
        String name="spring";
        int n=4 ;
        for(int i=0;i<name.length()-n+1;i++){
            System.out.println(name.substring(i,i+n));
        }
    }
}
