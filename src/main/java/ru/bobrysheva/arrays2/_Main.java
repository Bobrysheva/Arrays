package ru.bobrysheva.arrays2;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 3234, 29, 7, 234, 563, 123, 982, 198, 579, -234};
        int move = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    move = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = move;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}