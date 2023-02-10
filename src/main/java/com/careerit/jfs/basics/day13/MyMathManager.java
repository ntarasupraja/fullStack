package com.careerit.jfs.basics.day13;
final class MyMyth{
    private MyMyth(){

    }
    public static double power(int m,int n){
    int power=1;
    for(int i=0;i<n;i++){
        power*=m;
    }
    return power;
    }
    public static int gcd(int num1,int num2){
        if(num1==num2){
            return num1;
        }
        while (num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            else {
                num2=num2-num1;
            }
        }
        return num1;
    }
}
public class MyMathManager {
    public static void main(String[] args) {
        System.out.println(MyMyth.power(4,3));
        System.out.println(MyMyth.gcd(5,15));
    }

}
