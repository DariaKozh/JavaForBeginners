package homework;

import utils.Utils;

import java.util.Arrays;

import static utils.Utils.line;
import static utils.Utils.ln;

public class HW7 {

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
        System.out.println(ANSI_PURPLE + "\n****************\n  ������� � " + a + "\n****************" + ANSI_RESET);
    }

    //18.	�������� �����, ������� ��������� �� ���� ������ int, � ���������� ������� ��������.
    // ��������� ������ ������ ������, ���� �������� - ������ catsAges
    public static double averageArray(int number[]) {
        double average;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        average = sum / number.length;

        return average;

    }

    //21.	������� �����, ������� ��������� �� ���� ������ int, � ���������� ����������� ��������,
    // ������������ �������� � ������� �������� ���� ����� �������.
    // ��������� ������ ������ �� ������� �� ������� 20.
    public static double[] averageMinMaxArray(int array[]) {
        double average;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        average = sum / array.length;

        double[] result = new double[]{(double) min, (double) max, average};

        return result;
    }


    public static void main(String[] args) {

        task(1);
        String[] catsNames;
        catsNames = new String[8];
        catsNames[0] = "�����";
        catsNames[1] = "����";
        catsNames[2] = "����";
        catsNames[3] = "����";
        catsNames[4] = "�����";
        catsNames[5] = "�����";
        catsNames[6] = "��������";
        catsNames[7] = "������";
        System.out.println(catsNames);
        for (int i = 0; i <= 7; i++) {
            System.out.println(catsNames[i]);
        }

        task(2);
        //2.	� ������� catsNames �������� �������� �������� � �������� 4 �� ������,
        // � �������� �������� � �������� 1 �� ��������.
        catsNames[1] = "������";
        catsNames[4] = "�����";
        System.out.println(catsNames);
        for (int i = 0; i <= 7; i++) {
            System.out.println(catsNames[i]);
        }

        task(3);
        //3.������� ������ catsColors � ��������� ��� ����������.

        String[] catsColors = new String[8];
        catsColors[0] = "�����";
        catsColors[1] = "������";
        catsColors[2] = "�����";
        catsColors[3] = "����������";
        catsColors[4] = "�����";
        catsColors[5] = "�����";
        catsColors[6] = "�����";
        catsColors[7] = "�����";

        for (int i = 0; i <= 7; i++) {
            System.out.println(catsColors[i]);
        }

        task(4);
        //4.������� ������ catsAges � ��������� ��� ������ ����������.
        int[] catsAges = new int[]{4, 3, 4, 1, 6, 10, 3, 7};
        for (int i = 0; i <= 7; i++) {
            System.out.println(catsAges[i]);
        }

        task(5);
        //5.������� ������ isCatRed � ��������� ��� ���������������� ����������
        boolean[] isCatRed = new boolean[8];
        // ����� ��� ������ ������ {false, false, false, false, true, false, true, false};

        //����� ��� ��� ��� ����� ����
        for (int i = 0; i <= 7; i++) {
            if (catsColors[i].equals("�����")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
        }

        for (int i = 0; i <= 7; i++) {
            System.out.println(isCatRed[i]);
        }


        task(6);
        //6.	����������� ��� �������� catsNames � catsColors:
        //?	��� ���� � ������� � ������� 6
        print(catsNames[6]);
        print("----------------");

        //?	����� ����� �� ������� � ������� ���������
        for (int i = 0; i < 8; i += 2) {
            System.out.println(catsNames[i]);
        }
        print("----------------");
        //?	����� ����� �� �������, ��� ������� ������ 4
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                print(catsNames[i]);
            }
        }
        print("----------------");
        //?	���� ����� �� ������� � ��������� ���������
        for (int i = 1; i < 8; i += 2) {
            System.out.println(catsColors[i]);
        }
        print("----------------");
        //?	���� ����� �� �������, ��� ������� ������ 3
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                print(catsColors[i]);
            }
        }

        task(7);
        //7.	����������� �������� ����!� ��� ���� ����� �����
        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("�����")) {
                print("������� ����!");
            }
        }

        task(8);
        //8.	����������� ������� ���� �� ��������!�, ���� ������� ���� ������ 2 ���
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                print("������ ���� �� ��������!");
            }
        }

        task(9);
        //9.	��� ���� � ��������� ������� ����������� ���, ����, �������
        print(catsNames[7]);
        print(catsColors[7]);
        print(catsAges[7]);

        task(10);
        //10.	����������� ����� ���� �����, ��� ������� ������ 2 ���
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges.length == catsNames.length) {
                if (catsAges[i] > 2) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        task(11);
        //11.	����������� �������� ����!� ���� ��� ���� ������ � �������� isCatRed == true
        if (catsNames.length == isCatRed.length && catsNames.length != 0) {
            for (int i = 0; i < 8; i++) {
                if (catsNames[i].equals("�����") && isCatRed[i] == true) {
                    print("������� ����! ��� ����� " + catsNames[i]);
                }
            }
        }

        task(12);
        //12.	����������� ������� ������� ����� �� ������� catsAges
        double average;
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }
        average = sum / catsAges.length;
        print(average);

        //13.	����������� ������� ������ �������� ����
        task(13);
        int min = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        print(min);

        task(14);
        // 14.	����������� ������� ������ ������� ����
        int max = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        print(max);

        //������ �������
        int maxAge = 0;
        for (int i = 0; i < catsAges.length; i++) {
            if (maxAge < catsAges[i]) {
                maxAge = catsAges[i];
            }
        }
        print(maxAge);


        task(15);
        //15.	����������� ���������� ����� �����
        int counter = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("�����")) {
                counter++;
            }
        }
        print(counter);


        task(16);
        //16.	����������� ��� ����, ���� ��� ��������� � ������� � ������ �������� � ��� ������� �� ������ 3 ���
        if (catsAges.length == catsNames.length && catsAges.length != 0) {
            for (int i = 0; i < catsAges.length; i += 2) {
                if (catsAges[i] <= 3) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        task(17);
        //17.������� ������ ������ ������������� �����, �������� ������� �� ������ 10.
        // (��������� �������� � ������� ����� for)


        int counter1 = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                counter1++;
            }
        }
        int[] array17 = new int[counter1];
        int num = 0;

        for (int i = 0; i < array17.length; i++) {
            array17[i] = num;
            num += 2;
        }

        System.out.println(Arrays.toString(array17));


        task(18);
        //18.	�������� �����, ������� ��������� �� ���� ������ int, � ���������� ������� ��������.
        // ��������� ������ ������ ������, ���� �������� - ������ catsAges
        System.out.println(averageArray(catsAges));
        Utils.verify(averageArray(catsAges), 4.75);

        task(19);
        //19.	������� ������ �������� ������������� ����� � ���������� �� -1000 �� -900
        int counter2 = 0;
        for (int i = -1000; i < -899; i++) {
            if (i % 2 != 0) {
                counter2++;
            }
        }
        int[] array19 = new int[counter2];
        int num1 = -999;

        for (int i = 0; i < array19.length; i++) {
            array19[i] = num1;
            num1 += 2;
        }

        System.out.println(Arrays.toString(array19));

        task(20);
        //20.	������� ������ �� 10 ��������� ������������� ����� �����
        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++) {
            array20[i] = (int) (Math.random() * 1000);
            System.out.println(array20[i]);
        }

        task(21);
        //21.	������� �����, ������� ��������� �� ���� ������ int,  � ���������� ����������� ��������,
        // ������������ �������� � ������� �������� ���� ����� �Integer.MAX_VALUE������.
        // ��������� ������ ������ �� ������� �� ������� 20.
        System.out.println(Arrays.toString(averageMinMaxArray(catsAges)));
        Utils.ln();
        System.out.println(Arrays.toString(averageMinMaxArray(array20)));

        task(22);
        //22.	������� ������ ������ ����� � ������ �������� ����� �� ��������� ������� �� ������� 20.

        int counterCh = 0;
        int counterNch = 0;

        for (int i = 0; i < array20.length; i++) {
            if (array20[i] % 2 == 0) {
                counterCh++;
            }
            if (array20[i] % 2 != 0) {
                counterNch++;
            }
        }

        int[] array22Ch = new int[counterCh];
        int[] array22Nch = new int[counterNch];

        int countCh = 0;
        int countNch = 0;
        for (int i = 0; i < array20.length; i++) {
            if (array20[i] % 2 == 0 && countCh < array22Ch.length) {
                array22Ch[countCh] = array20[i];
                countCh++;
            } else if (array20[i] % 2 != 0 && countNch < array22Nch.length) {
                array22Nch[countNch] = array20[i];
                countNch++;
            }
        }

        System.out.println(Arrays.toString(array22Ch));
        System.out.println(Arrays.toString(array22Nch));


        //23.	������� ��������� ������, ������� ������� �� ����, ���������, ������ �����
        task(23);
        String[][] array23 = new String[3][8];
        array23[0] = catsNames;
        String[] catsAges1 = new String[8];
        for (int i = 0; i < 8; i++) {
            catsAges1[i] = Integer.toString(catsAges[i]);
        }
        array23[1] = catsAges1;
        array23[2] = catsColors;

        for (int i = 0; i < array23.length; i++) {
            for (int j = 0; j < array23[i].length; j++) {
                System.out.print(array23[i][j] + " ");
            }
        }
        ln();
        line();
        //����������� ��� ������ ����� � �������� � ������� ���������, ��������� ��������� ������.

        for (int i = 0; i < array23.length; i++) {
            for (int j = 0; j < array23[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.print(array23[i][j] + " ");
                }
            }
        }
        ln();
        line();

        String[][] array232 = {
                {"����", "����", "����", "�����", "��", "��", "���", "����"},
                {"2", "4", "3", "7", "1", "7", "3", "4"},
                {"�����", "������", "�����", "����������", "�����", "�����", "�����", "�����"}
        };

        System.out.println(Arrays.deepToString(array232));

        for (int j = 0; j < array232[0].length;j++){
            if (j % 2 ==0){
                print(array232[0][j] + " " + array232[1][j] + " " + array232[2][j]);
            }
        }

        //��� ���� ������
        String[][] array233 = new String[3][8];
        if (catsNames.length == array233[0].length && catsAges.length == array233[1].length
        && catsColors.length == array233[2].length){
            for (int i = 0; i < array233[0].length; i++){
                array233[0][i] = catsNames[i];
                array233[1][i] = String.valueOf(catsAges[i]);
                array233[2][i] = catsColors[i];
            }
        }

        System.out.println(Arrays.deepToString(array233));



        task(24);
        //24.	������� ��������� ������ ����� ��������� ����� �� 1 �� 10 ����������� 4*8.
        int[][] array24 = new int[4][8];

        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                array24[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }

            System.out.println(Arrays.deepToString(array24));

        task(25);
        //25.	������� ����� ���� ������ ����� ������� �� ������� 24.
        int summ = 0;
        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                if (array24[i][j] % 2 == 0){
                    summ += array24[i][j];
                }
            }
        }
        print(summ);


    }


}
