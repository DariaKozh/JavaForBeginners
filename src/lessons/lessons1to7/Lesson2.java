package lessons.lessons1to7;

public class Lesson2 {

    public static void main(String [] args){

        String line = "_______________________";
        int a = +5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        System.out.println("����� ���������� a � b = " + (a + b));
        System.out.println("����� ���������� a � b = " + sumAB);
        System.out.println(a + b);
        System.out.println(sumAB);
        System.out.println(sumABC);
        System.out.println(line);
        System.out.println(a + b + " " + a + b);
        System.out.println(line);
        System.out.println("" + a + b + c);
        System.out.println("" + a + " " + b + " " + c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        System.out.print("������� ");
        System.out.println("�������");

        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);

        System.out.println("�������\n�������");
        System.out.println("\"�������\"\t�������");

        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);
        System.out.println(devAB);

        ///������� �� �������
        System.out.println(b % a);
        System.out.println(a % b);

        //���������������� ++ --
        a++;
        System.out.println(a);
        System.out.println(a + 1);












    }
}
