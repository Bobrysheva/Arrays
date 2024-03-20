package ru.bobrysheva.arrays.util;

public class FindPrimeNums {
    public static int findPrimeNums(int[] arr) {
        int quantityPrimes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1)
                continue;
            else if (discoverPrimes(arr[i]) == true)
                quantityPrimes++;
        }
        return quantityPrimes;
    }

    private static boolean discoverPrimes(int a) {
        int сounter = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                сounter++;
        }
        if (сounter == 0)
            return true;
        else return false;
    }
}
