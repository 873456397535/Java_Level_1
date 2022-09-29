package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt(-9,9);
        int b = ThreadLocalRandom.current().nextInt(-9,9);
        if (a > b) {
            System.out.println("a=" + a + " b=" + b + " a>b");
        } else if (a < b) {
            System.out.println("a=" + a + " b=" + b + " a<b");
        } else if (a == b) {
            System.out.println("a=" + a + " b=" + b + " a=b");
        }
    }

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-200,200);
        if (value <= 0) {
            System.out.println(value + " Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println(value + " Желтый");
        } else if (value > 100) {
            System.out.println(value + " Зеленый");
        }
    }

    private static void checkSumSign() {
        int a = ThreadLocalRandom.current().nextInt(-9,9);
        int b = ThreadLocalRandom.current().nextInt(-9,9);
        int Sum = a+b;
        System.out.println("Сумма = " + Sum);
        if (Sum >= 0) {
            System.out.println("Сумма положительная");
        } else if (Sum <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
