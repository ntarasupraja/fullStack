package com.careerit.jfs.basics.day10;

public class StringImmutableObjects {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" , Welcome to java world");
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("Hello");
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));

        String str="malayalam";
        StringBuilder sb2=new StringBuilder(str);
        String rev=sb2.reverse().toString();
        if(str.equals(rev)){
            System.out.println("is palindrome");
        }
    }
}
