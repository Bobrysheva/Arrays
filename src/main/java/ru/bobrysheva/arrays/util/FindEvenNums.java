package ru.bobrysheva.arrays.util;

public class FindEvenNums {
    public static int findEvenNums(int[] arr) {
        int quantityEvens = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                quantityEvens++;
        }
        return quantityEvens;
    }
}

