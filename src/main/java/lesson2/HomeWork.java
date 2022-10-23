package lesson2;

public class HomeWork {
    public static void main(String[] args) {
CheckSum (4,5);
CheckNumber (-1);
TrueFalse (-20);
PrintString("Orange", 3);
    }
    private static void CheckSum(int n1, int n2) {
        int sum = n1 + n2;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        }
    private static void CheckNumber (int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    private static void TrueFalse (int number) {
        if (number < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    private static void PrintString(String content, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(content);
        }
    }



}
