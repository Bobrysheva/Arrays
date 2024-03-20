package ru.bobrysheva.arrays.util;

public class CalcDiffer {
    public static int calcDiffer(int[] arr) {
        return (calcEvenIndex(arr) - calcOddIndex(arr));

    }

    private static int calcEvenIndex(int[] arr) {
        int evenIndexSum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            evenIndexSum += arr[i];
        }
        return evenIndexSum;
    }

    private static int calcOddIndex(int[] arr) {
        int oddIndexSum = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            oddIndexSum += arr[i];
        }
        return oddIndexSum;
    }
}
