package homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        int sumKLM = k + l + m;
        String line = "-----------------------------";

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println("" + k + " " + l + " " + m);
        System.out.println("" + k + ", " + l + ", " + m);
        System.out.println("k = " + k + ", l = " + l + ", m = " + m);

        System.out.println(line);
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + multKM);
        System.out.println("�������� ���������� l � m = " + subLM);

        System.out.println(line);
        System.out.println("��������� ������� k �� l = " + (k / l) + ", � ������� �� ������� = " + (k % l));
        System.out.println("��������� ������� k �� m = " + (k / m) + ", � ������� �� ������� = " + (k % m));
        System.out.println("��������� ������� l �� m = " + (l / m) + ", � ������� �� ������� = " + (l % m));
        System.out.println("��������� ������� l �� k = " + (l / k) + ", � ������� �� ������� = " + (l % k));
        System.out.println("��������� ������� m �� k = " + (m / k) + ", � ������� �� ������� = " + (m % k));
        System.out.println("��������� ������� m �� l = " + (m / l) + ", � ������� �� ������� = " + (m % l));

        System.out.println(line);
        int apple = 100;
        int student = 21;

        System.out.println("���� " + apple + " ����� �������� �� " + student + " ��������, �� ������ ������ ������� �� "
                + (apple / student) + " �����(a), � " + (apple % student) + " �����(�) ��������� �������.");

        System.out.println(line);
        int m1;
        m1 = m;
        m1++;
        System.out.println("����� ����� k, l, m++ � sumKLM-- = " + (k + l + m1 + sumKLM - 1)
                + ", � �������� m++ �  sumLKM = " + (m1 - sumKLM));

        System.out.println(line);
        System.out.println("48 ������ 8, �.�. 48/8 = " + (48 / 8) + ", � ������� �� ������� =" + (48 % 8));
        System.out.println("48 ������ �����, �.�. ������� �� ������� 48 �� 2 = " + (48 % 2));
        System.out.println("8 ������ �����, �.�. ������� �� ������� 8 �� 2 = " + (8 % 2));
        System.out.println("47 �������� �����, �.�. ������� �� ������� 47 �� 2 = " + (47 % 2));
        System.out.println("49 �������� �����, �.�. ������� �� ������� 49 �� 2 = " + (49 % 2));

        System.out.println(line);
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);
        int result22 = ((3 + 4 * x) / 5 - 10 * (y - 5) * (a + b + c) / x + 9 * ( 4 / x + (9 + x) / y));
        int result23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) * (x + y) / (3 * x - y) / (a + b + c / d
                + (a + b / c + d) + a * b));

        System.out.println("(x+3)^2 = " + result21);
        System.out.println("2� ��������� = " + result22);
        System.out.println("3� ��������� = " + result23);

        System.out.println(
                "---------------------\n"
                        + "| task   | result   |\n"
                        + "---------------------\n"
                        + "| 21     | " + result21 + "       |\n"
                        + "---------------------\n"
                        + "| 22     | " + result22 + "      |\n"
                        + "---------------------\n"
                        + "| 23     | " + result23 + "        |\n"
                        + "---------------------\n"
        );
    }
}
