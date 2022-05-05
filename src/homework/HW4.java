package homework;

public class HW4 {

    public static void task(int a) {
        System.out.println("\u001B[35m" + "\n****************\n  ������� � " + a + "\n****************" + "\u001B[30m");
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void ostatok(int k, int l, int m) {
        String te = "��������� ������� " + k + " �� " + l + " = " + (k / l) + ", � ������� �� ������� = " + (k % l)
                + "\n��������� ������� " + k + " �� " + m + " = " + (k / m) + ", � ������� �� ������� = " + (k % m)
                + "\n��������� ������� " + l + " �� " + m + " = " + (l / m) + ", � ������� �� ������� = " + (l % m)
                + "\n��������� ������� " + l + " �� " + k + " = " + (l / k) + ", � ������� �� ������� = " + (l % k)
                + "\n��������� ������� " + m + " �� " + l + " = " + (m / l) + ", � ������� �� ������� = " + (m % l)
                + "\n��������� ������� " + m + " �� " + k + " = " + (m / k) + ", � ������� �� ������� = " + (m % k);
        print(te);
    }

    public static void delenie(int number1, int number2) {
        int del = number1 / number2;
        int ostatok = number1 % number2;
        print("��������� ������� " + number1 + " �� " + number2 + " = " + del + ", � ������� �� ������� = " + ostatok);
    }

    public static void delenie2(int number1, int number2, String t1, String t2) {
        print("��������� ������� " + t1 + " �� " + t2 + " = " + (number1 / number2)
                + ", � ������� �� ������� = " + (number1 % number2));
    }

    public static void kolvoyablok(int apple, int student) {
        print("���� " + apple + " �����(�) �������� �� " + student + " ��������, �� ������ ������ ������� �� "
                + (apple / student) + " �����(a), � " + (apple % student) + " �����(�) ��������� �������.");
    }

    public static String ok(int apple) {

        String ok;

        if (((apple % 100 >= 11) && (apple % 100) <= 14) || (apple % 10 == 0) || (((apple % 10) <= 9)
                && ((apple % 10) >= 5))) {
            ok = "";
        } else if (((apple % 10) <= 4) && ((apple % 10) >= 2)) {
            ok = "a";
        } else if ((apple % 10) == 1) {
            ok = "o";
        } else {
            ok = "";
        }

        return ok;
    }

    public static void yabloki(int apple, int student) {

        int delenie = apple / student;
        int ostatok = apple % student;

        print("���� " + apple + " �����" + ok(apple) + " �������� �� " + student + " ��������, �� ������ ������ ������� �� "
                + delenie + " �����" + ok(delenie) + ", � " + ostatok + " �����" + ok(ostatok) + " ��������� �������.");

    }

    public static void temp(double cel) {
        double far = (cel * 9 / 5) + 32;
        print("����������� � �������� �����  " + cel + "\n����������� � ����������� ����� " + far);
    }

    public static void tabl(double i) {
        print("-------------------------------------------------------------------\n"
                + "|  i = " + i + ", i^2            |  " + (i * i) + "                              |\n"
                + "-------------------------------------------------------------------");
    }

    public static void test1(int n, int expectedResult) {

        if (n % 2 == 0) {
            n = n * 2;
        } else {
            n = n * n;
        }
        print("\u001B[30m" + "n = " + n);

        if (expectedResult == n) {
            print("\u001B[32m" + "Pass");
        } else {
            print("\u001B[31m" + "Fail");
        }
    }

    public static void main(String[] args) {

        task(2);

        task(3);
        System.out.println("1) (2 = 2) � (7 = 7) = " + ((2 == 2) || (7 == 7)));
        System.out.println("2) ��(15 < 3) = " + (!(15 < 3)));
        System.out.println("3) (\"�����\" = \"���\") ��� (\"�����\" = \"���\") = "
                + (("�����" == "���") || ("�����" == "����")));
        System.out.println("4) ��(\"�����\" = \"���\") = " + (!("�����" == "���")));
        System.out.println("5) (��(15 < 3)) � (10 > 20) = " + (!(15 < 3) && (10 > 20)));

        String a = "����� ����, ����� ������";
        String b = "��� ������� ������ ��������� ������ ����";
        Boolean c = Boolean.valueOf(a);
        c = true;
        Boolean d = Boolean.valueOf(b);
        d = true;
        System.out.println("6) (\"����� ����, ����� ������\") � (\"��� ������� ������ ��������� ������ ����\") = "
                + (c && d));
        System.out.println("7) (6/2 = 3) ��� (7*5 = 20) = " + ((6 / 2 == 3) || (7 * 5 == 20)));

        task(4);
        String a11 = "\"� ������ 70 ������\"";
        String b11 = "\"���������� ���� ���������� �����\"";
        String con1 = "\"� ������ 60 ������\"";
        String con2 = "\"���������� ���� ���������� �����\"";
        Boolean e1 = (a11.equals(con1) || b11.equals(con2));
        System.out.println(e1);

        String a1 = "\"� ������ 70 ������\"";
        String b1 = "\"���������� ���� ���������� �����\"";
        Boolean c1 = Boolean.valueOf(a1);
        c1 = false;
        Boolean d1 = Boolean.valueOf(b1);
        d1 = true;
        System.out.println("1) " + a1 + " ��� " + b1 + " = " + (c1 || d1));

        System.out.println("2) !(28 > 7) � !(300/5 = 60) = " + (!(28 > 7) && !(300 / 5 == 60)));

        String a2 = "\"��������� - ������������� ������\"";
        String b2 = "\"������ - ������\"";
        Boolean c2 = Boolean.valueOf(a2);
        c2 = true;
        Boolean d2 = Boolean.valueOf(b2);
        d2 = false;
        System.out.println("3) " + a2 + " � " + b2 + " = " + (c2 && d2));

        //4) ��((300 < 100))  ? ("����� ����� ������� �����")
        if (!(300 < 100)) {
            print("4) ����� ����� ������� �����");
        }
        //5) (75 < 81) ? (88 = 88)
        if (75 < 81) {
            print("5) 88 = 88");
        }

        task(5);
        //�) ������ ������ �����. ������ ������ �����.
        //�) �� ����� ����� ��������, � �� ����� ����� �����������.
        //�) ������� ����� ����� � �������. ��������� - ��������.
        String a3 = "������ ������ �����.";
        String b3 = "������ ������ �����.";
        System.out.println("�) " + a3 + " || " + b3);
        System.out.println("�) �� ����� ����� �������� || �� ����� ����� �����������");
        System.out.println("�) ������� ����� ����� � ������� && ��������� - ��������");

        task(6);
        //������������� ����� ����� ��������, ������ ����� ���������� 16 ���.�
        int age = 16;
        if (age == 16) {
            String prava = "������������ ����� ����� ��������";
            System.out.println(prava);
        }

        task(7);
        //����� �� ���� � ��������, �� ��� ���� ������ ����� ��� �� ������� � ����
        print("!(���� ���� � ��������) && (������ ����� || �� ������� � ����)");

        boolean petyaEdetAvtobus = false;
        boolean petyaRead = true;
        boolean petyaLookInWindow = false;

        System.out.println(petyaEdetAvtobus && (petyaRead || petyaLookInWindow));

        task(8);
        //����� � ������ ��, ��� ������, � ����� �������� - �����
        String t1 = "�� � ������";
        if (t1 == "�� � ������") {
            String t2 = "��� ������";
            System.out.println(t1 + " - " + t2);
        } else {
            String t2 = "��� �����";
            System.out.println(t1 + " - " + t2);
        }
        task(9);
        //���� ���� ������ 18 ���, �� �� ��������. �����, �� - �������.
        int age2 = 100;
        if (age2 >= 18 && age2 < 100) {
            String t3 = "�� ��������.";
            System.out.println("���� " + age2 + " ���. " + t3);
        } else if (age2 > 0 && age2 < 18) {
            String t3 = "�� �������.";
            System.out.println("���� " + age2 + " ���. " + t3);
        } else {
            print("������� ������ �� �����.");
        }


        //���� ����� �����, ������, ��� �����. ���� ����� ������, �� ���� �����.
        String t4 = "����� ������.";
        if (t4 == "����� �����.") {
            String t5 = " ��� �����.";
            System.out.println(t4 + t5);
        }
        if (t4 == "����� ������.") {
            String t5 = " ���� �����.";
            System.out.println(t4 + t5);
        }
        //���� ����� �����, ������, ��� �����. ���� ����� ������, �� ���� �����. ����� ���� ����.
        String t6 = "����� �����.";
        if (t6 == "����� ������.") {
            String t7 = " ���� �����.";
            System.out.println(t6 + t7);
        } else if (t6 == "����� �����.") {
            String t7 = " ��� �����.";
            System.out.println(t6 + t7);
        } else {
            String t7 = " ���� ����.";
            System.out.println(t6 + t7);
        }

        //���� �� ���� ����, ���� �����, ����� ���� ������� �����.
        String sky = "�� ���� ������.";
        if (sky == "�� ���� ����.") {
            String t = " ���� �����.";
            System.out.println(sky + t);
        } else {
            String t = " ���� \"������\" �����.";
            System.out.println(sky + t);
        }

        //���� ������� �������, ������, ������ �����������.
        //���� ������� �������, ������, ����� ��� �������. ����� ����� ��� �� �������, � ������ - �� �����������
        String today = "�����";
        if (today == "�������") {
            String tomorrow = "�����������";
            print("������� " + today + ", �� ������ " + tomorrow);
        } else if (today == "�������") {
            String yesterday = "�������";
            print("������� " + today + ", �� ����� " + yesterday);
        } else {
            String tomorrow = "�� �����������";
            String yesterday = "�� �������";
            print("������� " + today + ", �� ����� " + yesterday + ", � ������ " + tomorrow);
        }

        //���� �� ���� �������� ���, ������, ������ ��������, ����� ����� ������.
        String t10 = "�� ���� �� �������� ���";
        if (t10 == "�� ���� �������� ���") {
            String t11 = ", ������, ������ ��������";
            System.out.println(t10 + t11);
        } else {
            String t11 = ", ������, ����� ������";
            System.out.println(t10 + t11);
        }

        //���� ���� 18 ��� �� �������� �����, �� �� ������ �� ���� � ����������, ����� ���� � ����������.
        int age3 = 14;
        String t12 = "�� �� �������� �����";
        if (age3 == 18 || t12 == "�� �������� �����") {
            String t13 = ", �� �� ������ �� ���� � ����������";
            print("���� " + age3 + " ��� ��� " + t12 + t13);
        } else {
            String t13 = ", �� ���� � ����������";
            print("���� " + age3 + " ��� ��� " + t12 + t13);
        }

        task(10);
        //��������� ����� �� ��������. ���� ����� ������, ������� ��� �����, ����� ��������� ����� � �������.
        //�������� ��������� ������ ��������� �� ������.
        //������� � �����������, ����� ���� ����� ������������� ��� ��������.
        int a4 = 41;
        if (a4 % 2 == 0) {
            a4 = a4 * 2;
            print("����� a4 = " + (a4 / 2) + " ������, ����� ������ ��� � ����� ����� " + a4);
        } else {
            int a5 = a4 * a4;
            print("����� a4 = " + a4 + " ��������, ����� �������� ��� � ������� � ����� ����� " + a5);
        }

        task(11);
        //�������� �������� �������� �������� �� ������������ �������� (if-else):
        //a)	���������� ����� � 18 ���
        //b)	������ ����� ������ � 16 ���
        //c)	� ����� ����� ���� � 5 ���
        int age4 = 8;
        if (age4 >= 18) {
            String t = "\n���������� �����.";
            System.out.println("���� " + age4 + " ���. " + t);
        } else {
            String t = "\n���������� ������.";
            System.out.println("���� " + age4 + " ���. " + t);
        }

        if (age4 >= 16) {
            String t = "������ ������ �����.";
            System.out.println(t);
        } else {
            String t = "������ ������ ������.";
            System.out.println(t);
        }

        if (age4 >= 5 && age4 < 18) {
            String t = "� ����� ���� �����.";
            System.out.println(t);
        } else {
            String t = "� ����� ���� ������.";
            System.out.println(t);
        }

        task(12);
        //�������� �������� ���������, ������� ��������� ������ ������� � ��������� ��������� ��������:
        //a)	5 - ������ ���������� ������� � ��������� � ��������� �����
        //b)	4 - ��������� � ��������� �����
        //c)	3 - ���� ������� �� ���� � ��������� � ��������� �����
        //d)	2 - ������� ��������� � �������� � ������� ������ �� ������ ���
        int ball = 9;
        if (ball == 2) {
            String t = "������� ��������� � �������� � ������� ������ �� ������ ���";
            print("������ ������� " + ball + ", ����� " + t);
        } else if (ball == 3) {
            String t = "���� ������� �� ���� � ��������� � ��������� �����";
            print("������ ������� " + ball + ", ����� " + t);
        } else if (ball == 4) {
            String t = "��������� � ��������� �����";
            print("������ ������� " + ball + ", ����� " + t);
        } else if (ball == 5) {
            String t = "������ ���������� ������� � ��������� � ��������� �����";
            print("������ ������� " + ball + ", ����� " + t);
        } else {
            print("������� ������ ���� �� 2 �� 5");
        }

        task(13);
        //�������� �������� ���������, ������� ��������� 2 �����.
        //��������� ���������� �����, ������� ������� �� 3 ��� �������, � �������� �����,
        //������� ������� �� 5 ��� �������. ��������� �������� �����, ������� ������� �� 2 ��� �������,
        //�� ���� ���� �� ���� ����� �������������, ��������� �������� ��������� ����������� �������� �� (-1).
        //���� ����� �� ������ �� ���� ��������, ��������� ������� �� ������ ������ � ������������� ���������� ��������.
        int x = 7;
        int y = -30;
        if ((x % 3 == 0) && (y % 3 == 0)) {
            int e = x + y;
            System.out.println(e);
        }
        if ((x % 5 == 0) && (y % 5 == 0)) {
            int e = x - y;
            System.out.println(e);
        }
        if ((x % 2 == 0) && (y % 2 == 0)) {
            int e = x * y;
            System.out.println(e);
            if ((x < 0) || (y < 0)) {
                e = e * (-1);
                System.out.println(e);
            }
        }
        if (!((x % 3 == 0) && (y % 3 == 0)) && !((x % 5 == 0) && (y % 5 == 0)) && !((x % 5 == 0) && (y % 5 == 0))) {
            print("�������� ���������� ������");
        }

        task(14);

        ostatok(3, 5, 10);
        ostatok(98, 4, 13);
        delenie(19, 2);
        delenie2(8, 3, "k", "m");
        delenie2(63, 6, "r", "t");

        task(15);
        kolvoyablok(100, 21);
        kolvoyablok(40, 6);

        task(16);
        yabloki(91, 6);
        yabloki(1,5);
        yabloki(3, 1);
        yabloki(13,2);
        yabloki(128,5);
        yabloki(1242,52);

        task(17);
        //�������� �����, ������� ������ �� ���� �������� ����������� � ��������,
        // � ����������� ��������� ����������� � �������� � � �����������.
        temp(59);

        task(18);
        tabl(13);
        tabl(1.1);

        task(19);
        //�������� ����, ������� ���������� (�������� ������������ ������) ��� ��� �� ������� �10.
        //�������� ������ - 2, 5, 0.
        /*int n = 2;
        int expectedResult = 4;

        if (n % 2 == 0) {
            n = n * 2;
        } else {
            n = n * n;
        }
        print("n = " + n);

        if (expectedResult == n) {
            print("\u001B[32m" + "Pass");
        } else {
            print("\u001B[31m" + "Fail");
        }
*/
        test1(2, 4);
        test1(5, 25);
        test1(5, 30);
        test1(0, 0);

        task(20);
        //�������� ����, ������� ���������� ��� ��� �� ������� �11. ���������� �������� ������.
        // �������� ��������� �������� �� ������.
        int age7 = 90;
        String result ="";
        if (age7 >= 18) {
            result = "���������� �����.";
            System.out.println("���� " + age7 + " ���. \n" + result);
        } else {
            result = "���������� ������.";
            System.out.println("���� " + age7 + " ���. \n" + result);
        }

        String expectedResult1 = "���������� ������.";

        if (expectedResult1.equals(result)) {
            print("\u001B[32m" + "Pass");
        } else {
            print("\u001B[31m" + "Fail");
        }


        task(21);
        //21.	�������� �������� ���������, ������� ��������� ����� ���� short �� ���������� ��������,
        // � ������� ��������� ��������.
        //( ��������, �It�s a two-digit number.�, �It�s a five-digit number.�, etc)
        //�������� ��������� �������� �� ������.
        short s = 1524;
        if (("" + Math.abs(s)).length() == 1) {
            String t = " It�s a one-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 2) {
            String t = " It�s a two-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 3) {
            String t = " It�s a tree-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 4) {
            String t = " It�s a four-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 5) {
            String t = " It�s a five-digit number.";
            print(s + t);
        }


    }
}
