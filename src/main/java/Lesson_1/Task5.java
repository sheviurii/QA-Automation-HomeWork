package Lesson_1;

public class Task5 {

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

//        int result = (((d / c) * b) + a) * 2;

        int result = d - ((a + b)+(c / b));

        System.out.println(result);
    }
}