package ru.bobrysheva.multplications;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки А");
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        System.out.println("Введите координаты точки В");
        int bx = sc.nextInt();
        int by = sc.nextInt();
        double length = Math.sqrt((Math.pow((ax - bx), 2)) + (Math.pow((ay - by), 2)));
        System.out.println("Длина отрезка составляет " + length + " сантиметров");
    }
}