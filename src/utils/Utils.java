package utils;

public class Utils {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void print(String text) {

        System.out.println(text);
    }

    public static void print(int a) {

        System.out.println(a);
    }

    public static void print(double a) {

        System.out.println(a);
    }

    public static void task(int a) {
        System.out.println(ANSI_PURPLE + "\n****************\n  Задание № " + a + "\n****************" + ANSI_RESET);
    }

    public static void line() {
        System.out.println("__________________________________________________");
    }

    public static void ln() {
        System.out.println();
    }

    public static void printArray (int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray (double array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray (String array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray (boolean array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void task1(int number) {
        ln();
        line();
        System.out.println("Задача " + number);
    }

    public static double formatDouble (double number, int d) {
        int num = (int)Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);

        return number;
    }

    public static String verify(int a, int b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(double a, double b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    //Метод, который принимает на вход массив int, и возвращает среднее значение.
     public static double averageArray(int number[]){
        double average;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        average = sum / number.length;

        return average;
    }
}




