package homework;

public class HW5 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void print(String text) {

        System.out.println(text);
    }

    public static void task(int a) {
        System.out.println(ANSI_CYAN + "\n****************\n  ������� � " + a + "\n****************" + ANSI_RESET);
    }

    //2. �������� �����, ������� ��������� �� ���� ����� �� 1 �� 7  � ���������� ���� ������.
    public static String dayOfWeek(int number) {

        String dayOfWeek;

        if (number == 1) {
            dayOfWeek = "�����������";
        } else if (number == 2) {
            dayOfWeek = "�������";
        } else if (number == 3) {
            dayOfWeek = "�����";
        } else if (number == 4) {
            dayOfWeek = "�������";
        } else if (number == 5) {
            dayOfWeek = "�������";
        } else if (number == 6) {
            dayOfWeek = "�������";
        } else if (number == 7) {
            dayOfWeek = "�����������";
        } else {
            dayOfWeek = "������. ������� ����� �� 1 �� 7";
        }

        print(dayOfWeek);

        return dayOfWeek;

    }

    //3. ���� 3 ��������, ����� ������� � ��������� ��� ���������� largest
    public static int maxValue(int x, int y, int z) {
        int largest = Math.max((Math.max(x, y)), z);

        System.out.println(largest);
        return largest;
    }

    //4. ��������� if, �������� ���, ������� ������� ���������� �������� �� a, b � �
    public static int minValueOfThree(int a, int b, int c) {

        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println(min);

        return min;
    }

    //5.�������� �������� ���������� �������� �������� �� 5 ����������� ����������� ���� ����.
    public static double averageOfFive(double number1, double number2, double number3, double number4,
                                       double number5) {
        double average = (number1 + number2 + number3 + number4 + number5) / 5;

        print("������� ����������� ���� = " + average);

        return average;
    }

    //6.�������� �����, ������� ��������� �� ���� ���������� ����� (��������, 10.75),
    // � ���������� ������ �10 ��� 75 ���.
    public static String money(double number) {

        String money;

        if (number < 0) {
            money = "������. ������� ������������� �����.";
            print(money);
        } else {
            int money1 = (int) number;
            int money2 = (int) (number * 100) % 100;
            money = "" + money1 + " ��� " + money2 + " ���";
            print(money);
        }

        return money;
    }

    public static String money2(double number) {

        String money;

        if (number < 0) {
            money = "������. ������� ������������� �����.";
            print(money);
        } else {
            int money1 = (int) number;
            int money2 = (int) (number * 100) % 100;
            money = "" + money1 + " ��� " + money2 + " ���";
        }

        return money;
    }

    //7.�������� �����, ������� ��������� �� ���� ���������� ����� � ���������� ������ 10 �� 750 ��
    public static String weight(double number) {

        String weight;

        if (number < 0) {
            weight = "������. ������� ������������� �����.";
            print(weight);
        } else {
            int weight1 = (int) number;
            int weight2 = (int) (number * 1000) % 1000;
            weight = "" + weight1 + " �� " + weight2 + " ��";
            print(weight);
        }

        return weight;
    }

    public static String weight2(double number) {

        String weight;

        if (number < 0) {
            weight = "������. ������� ������������� �����.";
            print(weight);
        } else {
            int weight1 = (int) number;
            int weight2 = (int) (number * 1000) % 1000;
            weight = "" + weight1 + " �� " + weight2 + " ��";
        }

        return weight;
    }


    //8.�������� �����, ������� ��������� �� ���� 2 ��������� -  ���� � ���������� ������
    // (����� ���� ��� ������, ��� ���������� � ������). �������� ���������� ����� ������� � ���� ����������� �����.
    public static double summaPokypki(double value, double amount) {

        double summaPokypki;

        if (value < 0 || amount < 0) {
            print("������. ������� ������������� �����.");
            return Double.MIN_VALUE;
        } else {
            summaPokypki = value * amount;
            System.out.println(summaPokypki);
            return summaPokypki;
        }
    }


            /*9.	�������� �����, ������� ��������� �� ���� ����������� ���������, � �������� ���.
        ��������:

        ������
        ���� �� 1 ��			50 ��� 13 ���
        ���������� ������	         3 �� 400 ��
                _______________________________________
        ����� � ������		170 ��� 44 ���

                ���

        ����
        ���� �� 1 ��		30 ��� 50 ���
        ���������� ������	5 ��
                _______________________________________
        ����� � ������		152 ��� 50 ���

*/

    public static void chek(String name, double value, double amount, String kgOrPiece) {

        double summaPokypki;

        if (value < 0 || amount < 0) {
            print("������. ������� ������������� �����.");
        } else if (!(kgOrPiece.equals("��") || kgOrPiece.equals("��"))) {
            print("������. ������� �������� �� ��� ��.");
        } else {
            summaPokypki = value * amount;
            if (kgOrPiece.equals("��")) {
                print(name + "\n���� �� 1 " + kgOrPiece + "             " + money2(value)
                        + "\n���������� ������        " + (int) amount + " " + kgOrPiece
                        + "\n          ------------------------------------------------------\n����� � ������           "
                        + money2(summaPokypki));
            } else {
                print(name + "\n���� �� 1 " + kgOrPiece + "             " + money2(value)
                        + "\n���������� ������        " + weight2(amount) + " "
                        + "\n          ------------------------------------------------------\n����� � ������           "
                        + money2(summaPokypki));
            }
        }
    }

    //10.	�������� �����, ������� ��������� �� ���� ���������� ����� ������ � ����
    // � ��������� ������ ���� ������, � ���������� ���������� ����� � �����.
    public static double zarplata(double hour, double value) {

        double zarplata;

        if (hour < 0 || value < 0) {
            print("������. ������� ������������� �����.");
            return Double.MIN_VALUE;
        } else {
            zarplata = hour * value * 21;
            print(money2(zarplata));

            return zarplata;
        }

    }

    public static double zarplata2(double hour, double value) {

        double zarplata;

        if (hour < 0 || value < 0) {
            print("������. ������� ������������� �����.");
            return Double.MIN_VALUE;
        } else {
            zarplata = hour * value;
            return zarplata;
        }
    }


    //11.	�������� �����, ������� ��������� �� ���� ����������� ��������� � �������� ������ ���������
    // ������ �������� �����������.
    //��������:
    //�������� ����� �������� 		70000 ��� 00 ���

    public static void vedomostZp(String name, double hour, double value) {

        double zarplata = zarplata2(hour, value);
        print(name + "             " + money2(zarplata));
    }

    //12
    public static String pozitivOrNegativ(double x) {

        String text;

        if (x < 0) {
            text = "x is negative";
        } else {
            if (x > 0) {
                text = "x is positive";
            } else {
                text = "x is zero";
            }
        }

        print(text);
        return text;
    }

    //13.	�������� �����, ������� ��������� �� ���� ��� �������� � ���������� ���� ���������� �����.
    // ���������� ����� �������������� �� �������: ����� ���� �����, ���� ��������� ������ 9,
    // ����� ��������� ����� ���� �����.
    //��������:
    //��� �������� 1999
    //1 + 9 + 9 + 9 = 28
    //2 + 8 = 10
    //1 + 0 = 1
    //���������� ����� - 1

    public static int sumNumberOfNumber(int number) {

        int summa;

        if (number < 0 || number > 9999) {
            print("������. ������� ��� �������� �� 0 �� 9999");
            return (int) Double.MIN_VALUE;
        } else {
            int number1 = number / 1000;
            int number2 = (number / 100) % 10;
            int number3 = ((number / 10) % 100) % 10;
            int number4 = ((number % 1000) % 100) % 10;
            System.out.println("��� �������� " + number1 + number2 + number3 + number4);
            summa = number1 + number2 + number3 + number4;

            if (summa > 10) {
                summa = summa / 10 + summa % 10;
                System.out.println("���������� ����� - " + summa);

            } else {
            System.out.println("���������� ����� - " + summa);
            }

            return summa;
        }
    }

    //�) ���� 3 �����. ���������� ���������� ������� ����� ������� ��������� � �������� (median) ���������.
    //���� ������� ������ 2, ���������� �������� ���������: �������� �������� � ���������� �� ������� � �� � �.
    //����� �������� ���������: �������� �������� =  �, ������� =  � �.

    public static void raznMedianaAndAverage(double a, double b, double c) {

        double average = (a + b + c) / 3;
        double mediana;

        if ((a < b && b < c) || (c < b && b < a)) {
            mediana = b;
        } else if ((b < a && a < c) || (c < a && a < b)) {
            mediana = a;
        } else {
            mediana = c;
        }

        double razn = Math.abs(average - mediana);

        if (razn > 2) {
            print("������� �������� " + average + " ���������� �� ������� " + mediana + " �� " + razn);
        } else {
            print("������� �������� =  " + average + ", ������� = " + mediana);
        }
    }

    //b) ��������� ��� �� �� ����� � ������� ������� ������ Math, ��� �������� �� ������������
    public static void raznMedianaAndAverage2(int a, int b, int c) {

        int average = Math.addExact(Math.addExact(a, b), c) / 3;
        int mediana;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        if (min < b && b < max) {
            mediana = b;
        } else if (min < a && a < max) {
            mediana = a;
        } else {
            mediana = c;
        }

        int razn = Math.abs(Math.subtractExact(average, mediana));

        if (razn > 2) {
            print("������� �������� " + average + " ���������� �� ������� " + mediana + " �� " + razn);
        } else {
            print("������� �������� =  " + average + ", ������� = " + mediana);
        }
    }

    //15.�������� �����, ������� ���������� ������ ������ Math, ��������� �� ���� ����� � ������ (��������, 10.75)
    // � ��������� ����� � ������ ����������. ����� ���������� ����� ����� � ������ � ���� ������,
    // �������� �10 ��� 00 ���.
    public static String okruglSumma(double value) {

        double okruglSum = Math.floor(value);
        String itog = money(okruglSum);

        return itog;
    }

    //17.1)�������� �����, ������� ����������� � 1, ���� y > 0
    public static int met1(int y, int x) {
        if (y > 0) {
            x = 1;
        }
        return x;
    }

    ///2)
    public static double score1(double score) {

        if (score < 90 && score > 80) {
            score = score + 5;
        }
        return score;
    }

    ///
    public static boolean true11(int a, int b) {
        boolean c;
        if (a > 0 && b > 0) {
            c = true;
            System.out.println(c);
        } else {
            c = false;
        }

        return c;
    }

    //18
    public static double getPow(int pow) {
        if (pow >= 0 && pow <= 10) {
            return Math.pow(Math.random(), pow);
        } else {
            System.out.println("Error");
            return Double.MIN_VALUE;
        }
    }

    //19�������� �����, ������� ���������� ��������� ����� � �������� �� 1 �� 99 ������������.

    public static int getRandom1to99(){
        int n = (int)(Math.random() * 99) + 1;
        System.out.println(n);

        return n;
    }


    //20
    public static boolean year(int year) {

        boolean isLaepYear;

        if (year % 4 == 0) {
            isLaepYear = true;
        } else {
            isLaepYear = false;
        }
        System.out.println(isLaepYear);

        return isLaepYear;
    }


    public static void main(String[] args) {

        task(1);
        verifyEquals(2, 6);
        verifyEquals(5, 5);
        verifyEquals("Da", "Da");

        task(2);
        //�������� �����, ������� ��������� �� ���� ����� �� 1 �� 7  � ���������� ���� ������.
        dayOfWeek(1);
        dayOfWeek(7);
        dayOfWeek(-523);
        verifyEquals("�����", dayOfWeek(3));
        verifyEquals("�������", dayOfWeek(5));

        task(3);
        //���� 3 ��������, ����� ������� � ��������� ��� ���������� largest
        maxValue(59, -412, 4);
        verifyEquals(maxValue(45, 789521, -79143), 78);
        verifyEquals(maxValue(45, 789521, -79143), 789521);

        task(4);
        //4. ��������� if, �������� ���, ������� ������� ���������� �������� �� a, b � �
        minValueOfThree(12, 47, 4);
        verifyEquals(minValueOfThree(-78, -795213, 46325), 457);
        verifyEquals(minValueOfThree(1, 2, 30), 1);

        task(5);
        //5.�������� �������� ���������� �������� �������� �� 5 ����������� ����������� ���� ����.
        averageOfFive(37.52, 39.1, 40, 38.8, 37.999);
        verifyEquals(averageOfFive(37.52, 39.1, 40, 38.8, 37.999), 38.5);

        task(6);
        //6.�������� �����, ������� ��������� �� ���� ���������� ����� (��������, 10.75),
        // � ���������� ������ �10 ��� 75 ���
        money(158.74);
        money(1487825.7859536);
        money(-11.258);
        verifyEquals(money(12.789), "125 ��� 10 ���");
        verifyEquals(money(14.92), "14 ��� 92 ���");

        task(7);
        //7.�������� �����, ������� ��������� �� ���� ���������� ����� � ���������� ������ 10 �� 750 ��
        weight(125.1478);
        weight(-4598);
        weight(102);
        verifyEquals(weight(14895.1228), "14895 �� 122 ��");
        verifyEquals(weight(-159), "125 ��");

        task(8);
        //8.�������� �����, ������� ��������� �� ���� 2 ��������� -  ���� � ���������� ������
        // (����� ���� ��� ������, ��� ���������� � ������). �������� ���������� ����� ������� � ���� ����������� �����.
        summaPokypki(105.123, 52);
        summaPokypki(12, -1);
        summaPokypki(147.12, 1.5896);
        verifyEquals(summaPokypki(12.236, 1), 123);
        verifyEquals(summaPokypki(10, 2.1), 21);

        task(9);
        /*9.	�������� �����, ������� ��������� �� ���� ����������� ���������, � �������� ���.
        ��������:

        ������
        ���� �� 1 ��			50 ��� 13 ���
        ���������� ������	         3 �� 400 ��
                _______________________________________
        ����� � ������		170 ��� 44 ���

                ���

        ����
        ���� �� 1 ��		30 ��� 50 ���
        ���������� ������	5 ��
                _______________________________________
        ����� � ������		152 ��� 50 ���

*/
        chek("������", 123.26, 5.85, "��");
        print("***");
        chek("�����", 1456.785, 235.8963, "��");
        print("***");
        chek("����", -456.1, 4, "��");
        print("***");
        chek("�������", 30.52, 30, "��");
        print("***");
        chek("��������", 100, 90, "��");

        task(10);
        //10.	�������� �����, ������� ��������� �� ���� ���������� ����� ������ � ����
        // � ��������� ������ ���� ������, � ���������� ���������� ����� � �����.
        zarplata(5.5, 123.52);
        verifyEquals(zarplata(88, 152), 280896);
        verifyEquals(zarplata(-88, 12), 289);
        verifyEquals(zarplata(0, 1782), 0);

        task(11);
        //11.	�������� �����, ������� ��������� �� ���� ����������� ��������� � �������� ������ ���������
        // ������ �������� �����������.
        //��������:
        //�������� ����� �������� 		70000 ��� 00 ���
        vedomostZp("������� �����", 48, 145.62);
        vedomostZp("�������� �����", -8, 12);
        vedomostZp("������� ����", 45, 256.48);

        task(12);
        pozitivOrNegativ(12);
        pozitivOrNegativ(-89);
        pozitivOrNegativ(0);
        verifyEquals(pozitivOrNegativ(14), "x is positive");
        verifyEquals(pozitivOrNegativ(-8), "x is positive");

        task(13);
        //13.	�������� �����, ������� ��������� �� ���� ��� �������� � ���������� ���� ���������� �����.
        // ���������� ����� �������������� �� �������: ����� ���� �����, ���� ��������� ������ 9,
        // ����� ��������� ����� ���� �����.
        //��������:
        //��� �������� 1999
        //1 + 9 + 9 + 9 = 28
        //2 + 8 = 10
        //1 + 0 = 1
        //���������� ����� - 1

        sumNumberOfNumber(1458);
        sumNumberOfNumber(1259);
        sumNumberOfNumber(589);
        sumNumberOfNumber(52);
        sumNumberOfNumber(8);
        sumNumberOfNumber(123456);
        sumNumberOfNumber(1957);
        sumNumberOfNumber(1989);
        sumNumberOfNumber(2019);
        sumNumberOfNumber(1123);
        sumNumberOfNumber(2015);
        verifyEquals(8, sumNumberOfNumber(2015));
        verifyEquals(5, sumNumberOfNumber(2011));

        task(14);

        //�) ���� 3 �����. ���������� ���������� ������� ����� ������� ��������� � �������� (median) ���������.
        //���� ������� ������ 2, ���������� �������� ���������: �������� �������� � ���������� �� ������� � �� � �.
        //����� �������� ���������: �������� �������� =  �, ������� =  � �.

        raznMedianaAndAverage(3, 5, 9);
        raznMedianaAndAverage(-895, 12, 1258);
        raznMedianaAndAverage(8563, -0.4569, -85.12);
        raznMedianaAndAverage(5, -78, -251);

        //b) ��������� ��� �� �� ����� � ������� ������� ������ Math, ��� �������� �� ������������
        raznMedianaAndAverage2(2, 6, 7);
        raznMedianaAndAverage2(-185, 8569, 14);
        raznMedianaAndAverage2(5, -78, -251);

        task(15);
        //15.�������� �����, ������� ���������� ������ ������ Math, ��������� �� ���� ����� � ������ (��������, 10.75)
        // � ��������� ����� � ������ ����������. ����� ���������� ����� ����� � ������ � ���� ������,
        // �������� �10 ��� 00 ���.
        okruglSumma(10.75);
        okruglSumma(14785.785);
        verifyEquals("10 ��� 75 ���", okruglSumma(10.75));
        verifyEquals("10 ��� 0 ���", okruglSumma(10.75));

        task(16);
        double a = 3;
        double b = 4;
        double c = 20;
        int mult = Math.multiplyExact((int) a, (int) b);
        int sum = Math.addExact(mult, (int) c);
        int pow = (int) Math.pow(a, b);
        int mult2 = Math.multiplyExact(sum, pow);
        double sqrt = Math.sqrt(1.0 * mult2);
        double itogo = Math.ceil(sqrt / Math.PI);
        System.out.println(itogo);

        task(17);
        //1)�������� �����������, ������� ����������� � 1, ���� y > 0
        int x;
        int y = 16;
        if (y > 0) {
            x = 1;
            System.out.println(x);
        }

        System.out.println(met1(12, -9));
        System.out.println(met1(-8, -7));

        print("------");
        //2) ������ score ���������� double, �������� �����������, ������� ����������� score �� 5 ������,
        // ���� score ����� 80 � 90

        double score = 82.91;
        if (score < 90 && score > 80) {
            score = score + 5;
            System.out.println(score);
        }
        System.out.println(score1(86.12));
        System.out.println(score1(41));


        //3)
        // item = (i >=10) && (v < 50)

        print("------");
        //4) �������� �����������, ������� �������� true, ���� � �������� ����� � �������������
        int x1 = 13;
        if (x1 % 2 == 1 && x1 > 0) {
            print("true");
        }

        print("------");
        //5) �������� �����������, ������� �������� true, ���� � � y ��� �������������
        int x2 = -3;
        int y2 = -4;
        if (y2 > 0 && x2 > 0) {
            print("true");
        }

        true11(12, 4);
        true11(4, -7);


        print("------");
        //6) �������� �����������, ������� �������� true, ���� � � y ����� ���������� ����� + � -

        if ((y2 > 0 && x2 > 0) || (y2 < 0 && x2 < 0)) {
            print("true");
        }

        task(18);
        //18.	�������� �����, ������� � ������� ������� ������ Math ����������� ����� �������
        // ���������������� ���������� �����.
        // ����� ���������� ������������� ����������� ����� �������� � ������� �� �����:
        //������ � � ������� � = ��
        //����� ����� ���� � �������� �� 0 �� 1 �������������.
        //������� ����� ����� ���� �� 0 �� 10 ������������

        double n = Math.random();
        double pow1 = Math.random() * 11;
        double nInPow = Math.round(Math.pow(n, pow1));
        print("����� " + n + " � ������� " + pow1 + " = " + nInPow);

        System.out.println(getPow(2));
        System.out.println(getPow(-2));

        task(19);
        //19.�������� �����, ������� ���������� ��������� ����� � �������� �� 1 �� 99 ������������.
        double n1 = (Math.random() * 99) + 1;
        System.out.println(n1);

        getRandom1to99();
        getRandom1to99();

        task(20);

        year(1989);


    }
}