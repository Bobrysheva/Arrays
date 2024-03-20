package ru.bobrysheva.arrays.util;

public class FindNulls {
    public static int calculateNulls (int [] arr) {
        int nullsQuantity = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] == 0){
                nullsQuantity ++;
            }
        }
        return nullsQuantity;
    }
}
