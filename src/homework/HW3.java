package homework;

public class HW3 {

    public static void main(String[] args) {

        System.out.println("Task 2");
        String line = "--------------------------------";
        byte a = 7;
        byte b = -11;
        System.out.println("byte a = " + a);
        System.out.println("byte b = " + b);
        System.out.println(line);

        System.out.println("Task 3");
        short s = -30000;
        short t = 30000;
        System.out.println("short s = " + s);
        System.out.println("short t = " + t);
        System.out.println(line);

        System.out.println("Task 4");
        int i;
        i = Integer.MIN_VALUE;
        System.out.println(
                "------------------------------------------\n"
                + "| int min          |  " + i + "        |");
        i = Integer.MAX_VALUE;
        System.out.println(
                "------------------------------------------\n"
                + "| int max          |  " + i + "         |\n"
                + "------------------------------------------\n"
        );
        System.out.println(line);

        System.out.println("Task 5");
        long phoneNumber = 79516895236L;

        System.out.println("Телефон " + phoneNumber);
        System.out.println(line);

        System.out.println("Task 6");
        float f = 100.101101F;
        double d;
        d = 100.101101;
        Double dd;
        dd = 10.09999 + 20.099999;
        Float ff;
        ff = 10.09999F + 20.099999F;

        System.out.println(
                "_________________________________________________________\n"
                + "| float f = 100.101101            |  " + f + "         |\n"
                + "_________________________________________________________\n"
                + "| double d = 100.101101           |  " + d + "         |\n"
                + "_________________________________________________________\n"
                + "| double dd = " + dd + "  |  " + dd + " |\n"
                + "_________________________________________________________\n"
                + "| double ff = " + ff + "            |  " + ff + "           |\n"
                + "_________________________________________________________\n"
        );
        System.out.println(line);

        System.out.println("Task 7");

        System.out.println(dd);
        System.out.println(ff);
        System.out.println(line);

        System.out.println("Task 8");
        double result;
        double r1 = 10;
        double r2 = 3;
        result = r1 / r2;
        System.out.println(result);
        System.out.println(line);

        System.out.println("Task 9");
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println("sum f и d = " + sum);
        System.out.println("product f и d = " + product);
        System.out.println("quotient f на d = " + quotient);
        System.out.println("remainder f на d = " + remainder);
        System.out.println(line);

        System.out.println("Task 10");
        System.out.println(
                           ".  . .... .    .    ....\n"
                         + ".  . .    .    .    .  .\n"
                         + ".... .... .    .    .  .\n"
                         + ".  . .    .    .    .  .\n"
                         + ".  . .... .... .... ....\n"
                        );
        System.out.println(line);

        System.out.println("Task 11");
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println("Byte t1 = " + t1 + ";\nShort t2 = " + t2 + ";\nByte t3 = " + t3 + ";\nFloat t4 = " + t4
                + ";\nInteger t5 = " + t5 + ";\nLong t6 = " + t6 + ";\nDouble t7 = " +t7 + ";\nDouble t8 = " + t8
                + ";\nShort t9 = "+ t9 + ";");

        System.out.println(line);

        System.out.println("Task 12");
        System.out.println(
                "----------------------------------------------------------------------------\n"
                + "| Type        | Size in bits  | min                  | max                 |\n"
                        + "----------------------------------------------------------------------------\n"
                        + "| byte        | " + Byte.SIZE + "             | " + Byte.MIN_VALUE + "                 | "
                        + Byte.MAX_VALUE + "                 |\n"
                        + "----------------------------------------------------------------------------\n"
                        + "| short       | " + Short.SIZE + "            | " + Short.MIN_VALUE + "               | "
                        + Short.MAX_VALUE + "               |\n"
                        + "----------------------------------------------------------------------------\n"
                        + "| int         | " + Integer.SIZE + "            | " + Integer.MIN_VALUE + "          | "
                        + Integer.MAX_VALUE + "          |\n"
                        + "----------------------------------------------------------------------------\n"
                        + "| long        | " + Long.SIZE + "            | " + Long.MIN_VALUE + " | "
                        + Long.MAX_VALUE + " |\n"
                        + "----------------------------------------------------------------------------\n"
                        + "| flout       | " + Float.SIZE + "            | " + Float.MIN_VALUE + "              | "
                        + Float.MAX_VALUE + "        |\n"
                        + "----------------------------------------------------------------------------\n"
                        + "| double      | " + Double.SIZE + "            | " + Double.MIN_VALUE + "             | "
                        + Double.MAX_VALUE + "|\n"
                        + "----------------------------------------------------------------------------\n"
        );
        System.out.println(line);

        System.out.println("Task 13");

        Integer Num1 = 30;
        Integer Num2 = 30;
        Num1.equals(Num2);
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + Num1.equals(Num2));
        Num1 = 38;
        Num2 = 36;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + Num1.equals(Num2));
        System.out.println(line);

        System.out.println("Task 14");
        int number1;
        int number2;
        number1 = 10;
        number2 = 10;
        System.out.println("Если number1 = number2, то результат сравнения методом compareTo = "
                + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));
        System.out.println("Если number1 = number2, то результат сравнения методом Integer.compare = "
                + Integer.compare (number1, number2));
        number1 = 1;
        number2 = 10;
        System.out.println("Если number1 < number2, то результат сравнения методом compareTo = "
                + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));
        System.out.println("Если number1 < number2, то результат сравнения методом Integer.compare = "
                + Integer.compare (number1, number2));
        number1 = 15;
        number2 = 10;
        System.out.println("Если number1 > number2, то результат сравнения методом compareTo = "
                + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));
        System.out.println("Если number1 > number2, то результат сравнения методом Integer.compare = "
                + Integer.compare (number1, number2));
        System.out.println(line);

        System.out.println("Task 15");
        Float NN = 234.9999F;
        System.out.println(NN.intValue());
        System.out.println(line);

        System.out.println("Task 16");
        double aa = 1.123456;
        double bb = 2.34567;
        System.out.println(Double.sum(aa, bb));
        System.out.println(line);

        System.out.println("Task 17");
        Float N1 = 4.578F;
        Float N2 = 2.5785F;
        System.out.println(Integer.sum(N1.intValue(), N2.intValue()));
        System.out.println(line);

        System.out.println("Task 18");
        Short a1 = 12000;
        Short a2 = 12300;
        System.out.println("" + a1 + "-" + a2 + "=" + Short.compare(a1, a2));
        System.out.println("" + a1 + "-" + a2 + "=" + a1.compareTo(a2));
        a1 = 12500;
        System.out.println("" + a1 + "-" + a2 + "=" + Short.compare(a1, a2));
        System.out.println("" + a1 + "-" + a2 + "=" + a1.compareTo(a2));
        System.out.println(line);

        System.out.println("Task 19");
        String Str1 = "123.56";
        String Str2 = "123.55";
        Double Doub1 = 123.56;
        Double Doub2 = 123.55;
        System.out.println(Doub1-Doub2);
        Double.valueOf(Str1);
        Double.valueOf(Str2);
        System.out.println(Double.valueOf(Str1)-Double.valueOf(Str2));
        System.out.println(line);

        System.out.println("Task 20");
        Double tempcat;
        tempcat = 37.8;
        Double avr = tempcat/2;
        tempcat = 39.9;
        avr = avr + tempcat/2;
        System.out.println("Средняя температура кота = " + Math.round(avr));
        System.out.println(line);

        System.out.println("Task 21");
        Number N;
        N = Double.MAX_VALUE;
        System.out.println("Переменная n может принимать значения: \n"
                + "n = " + N);
        N = 10;
        System.out.println("n = " + N);
        N = 10.9999999999;
        System.out.println("n = " + N + "\n"
                + "Это возможно, потому что переменная N типа Number.");


        System.out.println(line);

        System.out.println("Task 22");
        Integer NumberInteger = 100;
        System.out.println("NumberInteger тип = " + NumberInteger.getClass());
        System.out.println("NumberInteger.toString() тип = " + NumberInteger.toString().getClass());
        System.out.println(line);

        System.out.println("Task 23");
        double cel = 36.6;
        String text1 = " градусов по Цельсию = ";
        String text2 = " градусов по Фаренгейту";
        double far = (cel * 9 / 5) + 32;
        System.out.println(cel + text1 + far + text2);

        String text3 = "50 kilogram = ";
        double kg = 50 * 2.205;
        String text4 = " lbs,  50 lb = ";
        double lbs = 50 * 0.454;
        String text5 = " kg";
        System.out.println(text3 + kg + text4 + lbs + text5);



















    }
}
