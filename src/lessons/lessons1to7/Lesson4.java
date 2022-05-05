package lessons.lessons1to7;

public class Lesson4 {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printLine() {
        System.out.println("____________________");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task(int number) {
        printEmptyLine();
        printLine();
        System.out.println("Задача " + number);
    }

    //сложный
//    static int number = 1;
//
//    public static void task() {
//        printLine();
//        System.out.println("Задача " + number);
//
//        number ++;
//    }

    public static void main(String[] args) {

        task(1);
        // Квадрат  - это !круг.
        String square = "Квадрат";
        String circle = "Круг";

        System.out.println(square != circle);

        task(2);
        //Если сегодня суббота, значит, завтра воскресенье.

        // вариант 1
        String today = "Суббота";

        if(today == "Суббота") {
            String tomorrow = "Воскресенье";
        }

        // вариант 2
        String tomorrow = "Воскресенье";

        if(today == "Суббота") {
            System.out.println(tomorrow);
        }

        // вариант 3
        String tomorrow1;

        if(today == "Суббота") {
            tomorrow1 = "Воскресенье";
        }

        task(3);
        //Если a > b или b < c, то присвоить a значание 7, и сложить  b и c,
        // иначе присвоить а значение 10

        int a = 9;
        int b = 12;
        int c = 2;

        if (a > b || b < c) {
            a = 7;
            int sum = b + c;

            System.out.println(a + " " + sum);
        } else {
            a = 10;
            System.out.println(a);
        }

        task(4);
        print("Hello!");
        print(tomorrow);

        //task(13);
        //task();
    }
}
