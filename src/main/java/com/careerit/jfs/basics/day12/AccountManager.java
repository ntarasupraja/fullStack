package com.careerit.jfs.basics.day12;
class Account{
    public Account(){
        System.out.println("Default Constructor");
    }
}
public class AccountManager {
    public static void main(String[] args) {
        Account acc1=new Account();
        Account acc2=new Account();
        Account acc3=acc1;
    }
}

