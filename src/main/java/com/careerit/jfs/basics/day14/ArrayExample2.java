package com.careerit.jfs.basics.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample2 {
    public static void main(String[] args) {
        int n=100;
        List<Integer> list=generateRandomNumbers(n);
        System.out.println(list);
        System.out.println(getEvenNumbersList(generateRandomNumbers(n)));

    }
    public static List<Integer> generateRandomNumbers(int n){
        List<Integer> randomList=new ArrayList<>();
        for (int i=0;i<n;i++){
            int num= ThreadLocalRandom.current().nextInt(1000,10000);
            randomList.add(num);
        }
        return randomList;
    }
    //Get only even numbers
    public static List<Integer> getEvenNumbersList(List<Integer> list){
        List<Integer> evenlist=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if(i%2==0){
                evenlist.add(i);
            }
        }
        return evenlist;
    }
    //Search element,if present return element else return -1
    public int getIndex(List<Integer> list,int ele){
        for (int i=0;i<list.size();i++){
            if (list.get(i)==ele){
                return i;
            }
        }
        return -1;
    }
}
