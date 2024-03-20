package ru.bobrysheva.arrays1._main;
import ru.bobrysheva.arrays1.util.*;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        System.out.println(FindEvenNums.findEvenNums(arr));
        System.out.println(FindOddNums.findOddNums(arr));
        System.out.println(FindPrimeNums.findPrimeNums(arr));
        System.out.println(SumAllNums.sum(arr));
        System.out.println(CalcDiffer.calcDiffer(arr));
        System.out.println(FindNulls.calculateNulls(arr));
    }
}