package ru.bobrysheva.arrays1.util;

public class FindOddNums {
    public static int findOddNums(int[] arr) {
        int quantityOdds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                quantityOdds++;
        }
        return quantityOdds;
    }
}
