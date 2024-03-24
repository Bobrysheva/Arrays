package ru.bobrysheva.multplications;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 2; i <= 5; ++i) {
            for (int j = 2; j <= 5; ++j) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
