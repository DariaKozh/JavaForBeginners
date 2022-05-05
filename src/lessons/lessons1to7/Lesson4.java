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
        System.out.println("������ " + number);
    }

    //�������
//    static int number = 1;
//
//    public static void task() {
//        printLine();
//        System.out.println("������ " + number);
//
//        number ++;
//    }

    public static void main(String[] args) {

        task(1);
        // �������  - ��� !����.
        String square = "�������";
        String circle = "����";

        System.out.println(square != circle);

        task(2);
        //���� ������� �������, ������, ������ �����������.

        // ������� 1
        String today = "�������";

        if(today == "�������") {
            String tomorrow = "�����������";
        }

        // ������� 2
        String tomorrow = "�����������";

        if(today == "�������") {
            System.out.println(tomorrow);
        }

        // ������� 3
        String tomorrow1;

        if(today == "�������") {
            tomorrow1 = "�����������";
        }

        task(3);
        //���� a > b ��� b < c, �� ��������� a �������� 7, � �������  b � c,
        // ����� ��������� � �������� 10

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
