package com.careerit.jfs.basics.day10;

public class recursiveFunctions {
    public static void main(String[] args) {
        System.out.println(factorial(5 ));
        System.out.println(gcd(10,15));
    }
    private static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        //int res=1;
        //for(int i=2;i<=n;i++){
         //   res*=i;
        //}
        //return res;
        return n*factorial(n-1);
    }
    private static int gcd(int n1,int n2){
        if(n1==n2){
            return n1;
        }
        //while (n1!=n2) {
            if (n1 > n2) {
               // n1 = n1 - n2;
                return gcd(n1-n2,n2);
            }
            else {
                //n2 = n2 - n1;
                return gcd(n1,n2-n1);
            }
        }

    }

