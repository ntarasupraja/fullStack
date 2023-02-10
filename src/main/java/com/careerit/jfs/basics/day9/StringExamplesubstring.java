package com.careerit.jfs.basics.day9;

public class StringExamplesubstring {
    public static void main(String[] args) {
        String arr="Mom,Dad,Liril U,    john,12321";

        for (String ele:arr.split(",")) {
            System.out.println(ele.trim().substring(0,3).toUpperCase());
        }
    }
}
