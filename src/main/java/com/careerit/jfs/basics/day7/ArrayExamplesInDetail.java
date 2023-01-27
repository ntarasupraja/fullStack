package com.careerit.jfs.basics.day7;

public class ArrayExamplesInDetail {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 9;
        System.out.println(arr[1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
        public static int biggest(int[] arr){
            int big=arr[0];
            for(int i=1;i<arr.length;i++){
                if(big<arr[i]){
                    big=arr[i];
                }
            }
            return big;
        }
    public static int smallest(int[] arr){
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small ;
    }
    public static boolean isPalindrome(int[] arr){
        boolean flag=true;
        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            while (arr[i]!=arr[j]){
                flag=false;
                break;
            }
        }
        return flag;
    }
    //if element present return index else return -1
    public static int indexOf(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    //If all elements present return true else return false
    public static boolean search(int[] arr,int a,int b,int c){
        return indexOf(arr,a)!=-1 && indexOf(arr,b)!=-1 && indexOf(arr,c)!=-1;
    }

}
