package homework.hw8;

import static utils.Utils.*;

public class HW8 {

    //7.Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел
    public static int[] arrayOf5(int num1, int num2, int num3, int num4, int num5) {
        int[] arrayOf5 = new int[5];
        arrayOf5[0] = num1;
        arrayOf5[1] = num2;
        arrayOf5[2] = num3;
        arrayOf5[3] = num4;
        arrayOf5[4] = num5;

        return arrayOf5;
    }

    //8.Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
    public static double[] arrayOf5(double num1, double num2, double num3, double num4, double num5) {
        double[] arrayOf5 = new double[5];
        arrayOf5[0] = num1;
        arrayOf5[1] = num2;
        arrayOf5[2] = num3;
        arrayOf5[3] = num4;
        arrayOf5[4] = num5;

        return arrayOf5;
    }

    //9.Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] arrayOf5(String num1, String num2, String num3, String num4, String num5) {
        String[] arrayOf5 = new String[5];
        arrayOf5[0] = num1;
        arrayOf5[1] = num2;
        arrayOf5[2] = num3;
        arrayOf5[3] = num4;
        arrayOf5[4] = num5;

        return arrayOf5;
    }

    //10.	Написать метод, который принимает на вход массив целых чисел,
    // и возвращает массив тех же чисел, умноженных на 2.5
    public static double[] array10(int array[]) {

        double array2[] = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = 2.5 * array[i];
        }

        return array2;
    }

    //Метод, проверяет, что в массиве нет отрицательных чисел
    public static boolean containsNegativeNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return true;
            }
        }

        return false;
    }

    //11.Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество четных чисел в этом массиве
    public static int array11(int array[]) {
        if (containsNegativeNumbers(array) == false && array.length > 0) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    counter++;
                }
            }
            return Integer.MIN_VALUE;
        }

        return 0;
    }

    //12.	Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив нечетных чисел
    public static int array12(int array[]) {
        if (containsNegativeNumbers(array) == false && array.length > 0) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    counter++;
                }
            }
            return counter;
        }

        return Integer.MIN_VALUE;
    }

    //13.Написать метод, который принимает на вход массив целых чисел,
    // и возвращает массив значений true или false, если числа больше 10
    public static boolean[] array13(int array[]) {
        boolean[] array13 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                array13[i] = true;
            } else {
                array13[i] = false;
            }
        }

        return array13;
    }

    //14.Написать метод, который принимает на вход массив слов, и возвращает строку, состоящую из этих слов
    public static String metod14(String array[]) {
        String metod14 = "";
        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                metod14 = metod14 + " " + array[i];
            }
        }
        return metod14;
    }

    //15.Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
    public static int metod15(int array[]) {
        int counter = 0;

        if (array.length > 0) {
            for (int i = array.length / 2; i < array.length; i++) {
                counter += array[i];
            }
            return counter;
        }
        return counter;
    }

    //16.	Написать метод, который принимает на вход целое положительные число
    // в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
    //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    public static int[] array16(int n) {
        if (n > 1 && n < 10) {
            int[] array16 = new int[11];
            for (int i = 0; i < array16.length; i++) {
                array16[i] = n * i;
            }
            return array16;
        } else {
            return new int[]{};
        }
    }

    //17.Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
    // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
    public static int[] array17(int array[]) {
        int counterCh = 0;
        int counterNch = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterCh++;
            } else {
                counterNch++;
            }
        }
        int[] arrayCh = new int[counterCh];
        int[] arrayNch = new int[counterNch];
        int newCounterCh = 0;
        int newCounterNch = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayCh[newCounterCh] = array[i];
                newCounterCh++;
            } else {
                arrayNch[newCounterNch] = array[i];
                newCounterNch++;
            }
        }

        if (counterCh > counterNch) {
            return arrayCh;
        } else if (counterCh < counterNch) {
            return arrayNch;
        } else {
            return new int[]{};
        }

    }

    //18.Написать метод, который принимает на вход длину массива и генерирует массив случайных
    // положительных чисел от 0 до 100 исключительно.
    public static int[] array18(int l) {
        if (l > 0) {
            int[] array18 = new int[l];
            for (int i = 0; i < l; i++) {
                array18[i] = (int) ((Math.random() * 99) + 1);
            }
            return array18;

        } else {

            return new int[]{};
        }
    }

    //19.Написать метод, который принимает на вход длину массива l и количество знаков d
    // (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных
    // целых положительных чисел длины l, в котором все числа имеют количество знаков d
    public static int[] array19(int l, int d) {
        if (l > 0 && d > 0) {
            int[] array19 = new int[l];
            for (int i = 0; i < l; i++) {
                array19[i] = (int) (Math.random() * 9 * Math.pow(10, d - 1) + Math.pow(10, d - 1));
            }
            return array19;
        } else {
            return new int[]{};
        }
    }


    //20.	Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
    public static int[] array20(int array[]) {

        if (array.length > 0) {
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    counter++;
                }
            }

            int[] array20 = new int[counter];
            int counter2 = 0;

            for (int i = 0; i < counter; i++) {
                array20[counter2] = array[i];
                counter2++;
            }

            return array20;
        } else {

        }
        return new int[]{};
    }

    //21.Написать метод, который принимает на вход массив целых положительных двузначных чисел,
    // и возвращает массив разниц между десятками и единицами
    public static int[] array21(int[] array) {
        int[] array21 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array21[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }

        return array21;
    }

    //Метод, проверяет, что в массиве числа от 0 до 9
    public static boolean containsLagger10(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9) {
                return true;
            }
        }

        return false;
        }



    //22.	Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
    // и возвращает массив, который содержит номер телефона,
    // состоящий из этих чисел, и название страны, которой номер принадлежит.
    //Например:
    //({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
    public static String[] phone(int[] array) {
        if (array.length == 11 && containsLagger10(array) == false && containsNegativeNumbers(array) == false) {
            String[] phone = new String[2];

            phone[0] = array[0] + "(" + array[1] + array[2] + array[3] + ")" + array[4] + array[5] + array[6]
                    + "-" + array[7] + array[8] + "-" + array[9] + array[10];
            phone[1] = "RUS";

            return phone;

        } else {
            return new String[]{};
        }
    }

    // 25.	Написать метод, который принимает на вход массив целых положительных чисел,
    // и 2 целых положительных числа (значения индексов).
    // Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
    //Например:
    // method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}

    public static int[] array25(int[] array, int indexStart, int indexEnd) {


        if (indexStart > 0 && indexEnd > 0 && indexStart <= array.length - 1 && indexEnd <= array.length - 1
                && indexStart <= indexEnd) {
            int index = 0;
            int[] array25 = new int[indexEnd-indexStart + 1];
            for (int i = indexStart; i < indexEnd + 1; i++) {
                if (array[i] > 0) {
                    array25[index] = array[i];
                    index++;

                } else {
                    return new int[]{};
                }
            }
            return array25;
        } else {
            return new int[]{};
        }

    }



    public static void main(String[] args) {

        Integer a = new Integer(7);
        Double b = new Double(1.15);
        String c = new String("Ку-ку!");

        task(6);
        //6.	Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и
        // распечатать результат сравнения в виде таблички:
        //HW8	 		|HW8_1			|areEquals?
        //____________________________________________
        //Double d = …	|Double d_1 = …		| true or false

        print("-------------------------------------------------------\n"
                + " HW8                | HW8_1              | areEquals?     \n"
                + "-------------------------------------------------------\n"
                + "Double b = " + b + "    	| Double b_1 = " + HW8_1.b1 + "  | " + b.equals(HW8_1.b1) + "\n"
                + "-------------------------------------------------------\n"
                + "Integer a = " + a + "    	| Integer a_1 = " + HW8_1.a1 + "    | " + a.equals(HW8_1.a1) + "\n"
                + "-------------------------------------------------------\n"
                + "String c = " + c + "   | String c_1 = " + HW8_1.c1 + "| " + c.equals(HW8_1.c1) + "\n"
                + "-------------------------------------------------------");

        task(7);
        //7.Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел
        printArray(arrayOf5(1, 3, 2, 5, 8));

        task(8);
        //8.	Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
        printArray(arrayOf5(1.12, 3.74, 2.147, 5.7, 8.789));

        task(9);
        //9.	Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        printArray(arrayOf5("da", "te", "ke", "ttt", "iy"));

        task(10);
        //10.	Написать метод, который принимает на вход массив целых чисел,
        // и возвращает массив тех же чисел, умноженных на 2.5
        printArray(array10(arrayOf5(3, 2, 1, 4, 6)));

        task(11);
        //11.	Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество четных чисел в этом массиве
        int[] ar1 = {1, 3, 4, 6, 8, 14, 3};
        print(array11(ar1));

        task(12);
        //12.	Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив нечетных чисел
        print(array12(ar1));

        task(13);
        //13.Написать метод, который принимает на вход массив целых чисел,
        // и возвращает массив значений true или false, если числа больше 10
        printArray(array13(ar1));

        task(14);
        //14.	Написать метод, который принимает на вход массив слов, и возвращает строку, состоящую из этих слов
        String[] ar2 = {"Мама", "мыла", "раму"};
        print(metod14(ar2));

        task(15);
        //15.	Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
        print(metod15(ar1));

        task(16);
        //16.	Написать метод, который принимает на вход целое положительные число
        // в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
        printArray(array16(2));
        ln();
        printArray(array16(6));
        ln();
        printArray(array16(-4));

        task(17);
        //17.	Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
        // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
        int[] ar3 = {1, 2, 4, 5, 8, 14, 3, 6, 15};
        printArray(array17(ar3));

        task(18);
        //18.	Написать метод, который принимает на вход длину массива и генерирует массив случайных
        // положительных чисел от 0 до 100 исключительно.
        printArray(array18(9));
        ln();
        printArray(array18(3));

        task(19);
        //19.Написать метод, который принимает на вход длину массива l и количество знаков d
        // (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных
        // целых положительных чисел длины l, в котором все числа имеют количество знаков d
        printArray(array19(32, 3));
        ln();
        printArray(array19(4, 4));

        task(20);
        //20.	Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив только двузначных чисел. Проверить работу метода на массиве из задания 18.
        printArray(array20(array18(21)));

        task(21);
        //21.	Написать метод, который принимает на вход массив целых положительных двузначных чисел,
        // и возвращает массив разниц между десятками и единицами
        int[] ar4 = {12, 22, 4, 51, 88, 14, 31, 6, 15};
        printArray(array21(ar4));

        task(22);
        //22.	Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
        // и возвращает массив, который содержит номер телефона,
        // состоящий из этих чисел,  и название страны, которой номер принадлежит.
        //Например:
        //({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
        int[] ar5 = {1, 3, 4, 2, 8, 4, 1, 6, 5, 5, 1};
        int[] ar6 = {1, 13, 4};
        System.out.println((containsLagger10(ar6)));
        printArray(phone(ar5));

        //23.	Написать метод, который принимает массив целых положительных чисел больше 0,
        // и возвращает массив уникальных чисел.

        //24.	Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество уникальных и неуникальных элементов в этом массиве


        task(25);
        // 25.	Написать метод, который принимает на вход массив целых положительных чисел,
        // и 2 целых положительных числа (значения индексов).
        // Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
        //Например:
        // method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
        printArray(array25(ar5, 6, 8));

        //26.	Написать метод, который принимает на вход 2 массива int[]
        // и возвращает объединенный массив уникальных неповторяющихся элементов


    }


}
