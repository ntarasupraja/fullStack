package com.careerit.jfs.basics.day8;

public class MyContainer {

    public static void main(String[] args) {


    }
    public static int[] generatePrimes(int lb, int ub) {
        int count = countPrime(lb, ub);
        int[] arr = new int[count];
        int c = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                arr[c++] = i;
            }
        }
        return arr;
    }

    public static int countPrime(int lb, int ub) {
        // 1001 10000 => 2,3,5,7 => 4
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num < 0 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
