package ru.geekbrains.lesson_2;

public class HomeWorkApp {
    public static void main(String[] args) {
    }

    public static boolean methodB(int a, float b) {
        if (a + b >= 10 && a + b <= 20) {
            return false;
        }
        return true;
    }

    public static void isPostiveOrNegative(int x) {
        if (x < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i" + i);
        }
    }
}