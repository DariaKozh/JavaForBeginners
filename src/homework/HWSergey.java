package homework;

import java.util.Arrays;
import java.util.Locale;

import static utils.Utils.*;

public class HWSergey {

    //метод принимает 2 строки и возращает true, усли первые и последние буквы совпадают
    public static boolean isSameLetters(String str1, String str2) {
        if (str1 != null && str2 != null) {
            str1 = str1.trim();
            str2 = str2.trim();
            if (str1.length() > 0 && str2.length() > 0) {
                if (str1.charAt(0) == str2.charAt(0) && str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) {

                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }


    //Напишите метод для преобразования имени в инициалы
    public static String getShortName(String name) {
        if (name != null) {
            name = name.trim();
            if (name.length() > 0) {
                String result = name.substring(0, 1) + ".";

                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == ' ') {
                        result = result + name.substring(i + 1, i + 2) + ".";
                    }
                }

                return result;
            }

            return "";
        }

        return "";
    }

    //принимает букву, возращает позицию в алфавите
    public static String position(char alphabet) {
        if (alphabet == 'a') {
            return "Position of alphabet: 1";
        } else {
            return "Position of alphabet: " + Integer.toString(alphabet - 'a' + 1);
        }
    }

    public static int basicMath(String op, int v1, int v2) {
        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/")) {
            return v1 / v2;
        } else if (op.equals("%")) {
            return v1 % v2;
        }
        return Integer.MIN_VALUE;
    }

    //Build a function that returns an array of integers from n to 1 where n>0.
    //Example : n=5 --> [5,4,3,2,1]
    public static int[] reverse(int n) {
        if (n > 0) {
            int[] reverse = new int[n];
            for (int i = 0; i < n; i++) {
                reverse[i] = n - i;
            }

            return reverse;
        }
        return new int[]{};
    }


    //Given a non-negative integer, 3 for example, return a string with a murmur:
    // "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
    public static String countingSheep(int num) {
        String countingSheep = "";

        for (int i = 1; i <= num; i++) {
            countingSheep += i + " sheep...";
        }
        return countingSheep;
    }

    public static void main(String[] args) {

        //цикл while (или же while do)
        int c = 0;
        while (c < 5) {
            System.out.println(c);
            c++;
        }

        line();

        //цикл do while
        int d = 0;
        do {
            System.out.println(d);
            d++;
        } while (d < 5);

        line();

        int a = 10;
        while (a < 105) {
            System.out.println(a);
            a += 18;
        }

        line();

        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        String str1 = "Привет!";
        System.out.println(str1.substring(1, 4));

        line();

        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        print(sum);

        //необходимо вывести среднее арифметическое всех значений массива.
        double avg = sum * 1.0 / array.length;
        print(avg);

        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
            }
        }

        print(sum2);

        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести максимальное значение массива.
        int max1 = Integer.MIN_VALUE;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max1) {
                    max1 = array2[i][j];
                }
            }
        }

        print(max1);

        line();

        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
        ln();
        line();

        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        String str = "Посмотрите как Рите нравится ритм";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'р' && str.charAt(i + 1) == 'и' && str.charAt(i + 2) == 'т') {
                System.out.print(i + " ");
            }
        }
        ln();
        //2й вариант
        int index = str.indexOf("рит");
        while (index != -1) {
            print(index);

            index = str.indexOf("рит", index + 1);
        }

        ln();
        line();
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        String[][] array3 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int counter = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (!array3[i][j].contains("е")) {
                    counter++;
                }
            }
        }
        print(counter);
        line();

        //Given a non-negative integer, 3 for example, return a string with a murmur:
        // "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
        System.out.println(countingSheep(7));
        line();

        //Задача №1
        //
        //0  1  2  3  4  5  6  7  8  9
        //0  1  2  3  4  5  6  7  8
        //0  1  2  3  4  5  6  7
        //0  1  2  3  4  5  6
        //0  1  2  3  4  5
        //0  1  2  3  4
        //0  1  2  3
        //0  1  2
        //0  1
        //0
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        //Задача №2
        //
        //0  1  2  3  4  5  6  7  8  9
        //   0  1  2  3  4  5  6  7  8
        //      0  1  2  3  4  5  6  7
        //         0  1  2  3  4  5  6
        //            0  1  2  3  4  5
        //               0  1  2  3  4
        //                  0  1  2  3
        //                     0  1  2
        //                        0  1
        //                           0

        for (int i = 10; i >= 0; i--) {

            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        //Задача №3
        //
        //9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
        //  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
        //    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
        //      6 5 4 3 2 1 0 1 2 3 4 5 6
        //        5 4 3 2 1 0 1 2 3 4 5
        //          4 3 2 1 0 1 2 3 4
        //            3 2 1 0 1 2 3
        //              2 1 0 1 2
        //                1 0 1
        //                  0
        for (int i = 9; i >= 0; i--) {

            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        //Напишите метод для преобразования имени в инициалы
        System.out.println(getShortName("Круглова Лариса Петровна"));

        //метод принииает 2 строки и возращает true, усли первые и последние буквы совпадают
        System.out.println(isSameLetters("great blue heron", "garlic nann"));
        System.out.println(isSameLetters("brown bear", "bear claw"));

        //принимает букву, возращает позицию в алфавите
        System.out.println(position('a'));
        System.out.println(position('c'));

        System.out.println(basicMath("+", 4, 7));

        System.out.println(Arrays.toString(reverse(8)));


    }
}
