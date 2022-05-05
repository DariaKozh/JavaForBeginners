package homework;

public class HW6 {

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
        System.out.println(ANSI_PURPLE + "\n****************\n  Задание № " + a + "\n****************" + ANSI_RESET);
    }

    public static double formatDouble (double number, int d) {
        int num = (int)Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);

        return number;
    }

    //10.Написать метод, который принимает на вход параметры start, end, step,
    // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
    // Точка выхода из цикла - число end.
    public static void cycle(double start, double end, double step) {

        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                print(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                print(start);
            }
        } else {
            print("Error. Invalid data");
        }
    }

    //	11.Написать метод, который принимает параметр ? и печатает последовательность четных чисел от нуля.
    //	Длина последовательности = ?.
    public static void seq(int l) {
        int end = 0;

        for (int i = 0; end < l; i += 2) {
            print(i);
            end++;
        }
    }

    //12.Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void pow(int n) {
        for (int i = 1; i <= n; i++) {
            print((int) Math.pow(2, i));
        }
    }

    //16.Написать метод, который принимает параметры n, m, l,
    //и печатает последовательность нечетных чисел начиная с числа n, с шагом m, длина последовательности l.

    public static void seq2(int n, int m, int l) {

        int end = 0;

        if ((m % 2 == 0) && l > 0) {

            if (n % 2 == 1 || n % 2 == -1) {
                for (int i = n; end < l; i += m) {
                    print(i);
                    end++;
                }
            } else {
                if (m > 0) {
                    for (int i = n; end < l; i += m) {
                        print(i + 1);
                        end++;
                    }
                } else {
                    for (int i = n; end < l; i += m) {
                        print(i - 1);
                        end++;
                    }
                }
            }
        } else{
                print("Ошибка. Число l должно быть больше 0, число m должно быть четное");
            }
        }

    //17.Сгенерируйте и распечатайте последовательность по формуле:
    //n + 1 = n + 2
    public static void seq17 (int n){
        int l = n + 5;

        for ( ; n < l; n++) {
            print("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }

    //18.Написать метод, который принимает параметры ?, n,
    // и печатает последовательность чисел, начиная с числа n, по формуле для n + 1 члена последовательности:
    //n + 1 = 2n
    //Длина последовательности  ?.
    //Тут в задаче l точка выхода видимо???
    public static void seq18 (int n, int l) {
        if (n < l) {
            print("[" + n + "]" + " = " + n);
            for (; n < l; n++) {
                print("[" + (n + 1) + "]" + " = " + (n * 2));
            }
        } else {
            print("Invalid data");
        }
    }

    //20.	Написать метод, который вычислит значение функции
    public static void metod20 (double x) {
        double y;
        if (x > 1.5) {
            y = 2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30;
        } else if (x <=1.5 && x >= 0){
            y = x + 1;
        } else {
            y = x;
        }

        print(y);
    }




        public static void main (String[]args){

            task(1);
            //1.Распечатать последовательность чисел от 0 до 9 включительно.
            for (int i = 0; i < 10; i++) {
                print(i);
            }

            task(2);
            //2.Распечатать последовательность чисел от 10 исключительно до 0 включительно.
            for (int i = 9; i > -1; i--) {
                System.out.print(i + " ");
            }

            task(3);
            //3.Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
            for (int i = 50; i < 56; i += 2) {
                System.out.print(i + " ");
            }

            task(4);
            //4.Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
            for (int i = 326; i > 300; i--) {
                if (i % 7 == 0) {
                    System.out.print(i + " ");
                }
            }

            task(5);
            //5.Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

            for (int i = 120; i < 131; i++) {
                System.out.print((i / 10.0) + " ");
            }

            task(6);
            //6.Распечатать последовательность четных чисел от 215 до 237 включительно
            for (int i = 216; i < 238; i += 2) {
                System.out.print(i + " ");
            }

            task(7);
            //7.Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
            for (int i = 8; i < 14; i += 7) {
                if (i % 7 == 0) {
                    print(i);
                }
            }

            task(8);
            //8.	Распечатать последовательность которая начинается с минимального
            // значения типа данных short и заканчивается максимальным значением short.
            // Числа в последовательности должны быть кратны 15001.
            for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
                if (i % 15001 == 0) {
                    print(i);
                }
            }

            task(9);
            //9.	Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
            // должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
            // А ноль необходимо распечатать словом ZERO.
            for (int i = -10; i < 35; i++) {

                if (i % 11 == 0 && i != 0) {
                    print(ANSI_BLUE + i + ANSI_RESET);
                } else if (i % 12 == 0 && i != 0) {
                    print(ANSI_RED + i + ANSI_RESET);
                } else if (i == 0) {
                    print("ZERO");
                }
            }

            task(10);
            //10.Написать метод, который принимает на вход параметры start, end, step,
            // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
            // Точка выхода из цикла - число end.
            cycle(12.236, 94, 24.12);
            cycle(98, 6, -4);
            cycle(98, 52,4);

            task(11);
            //	11.Написать метод, который принимает параметр ? и печатает последовательность четных чисел от нуля.
            //	Длина последовательности = ?.
            seq(8);

            task(12);
            //12.	Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
            pow(5);

            task(13);
            //13.Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i + i);
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i + i + i);
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i + i + i + i);
            }


            task(14);
            //14.Распечатайте последовательность чисел:
            //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
            for (int i = 0; i < 6; i++) {
                if (i == 0) {
                    print(i);
                } else {
                    print(i);
                    print(-i);
                }
            }

            task(15);
            //15.	Распечатать последовательность чисел:
            //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
            for (int i = 0; i < 26; i++) {
                if (i % 3 == 0) {
                    print(i);
                } else if (i % 5 == 0) {
                    print(i);
                }
            }

            task(16);
            //	16.Написать метод, который принимает параметры n, m, l,
            //	и печатает последовательность нечетных чисел начиная с числа n, с шагом m, длина последовательности l.
            seq2(3, 6, 4);
            seq2(-4, -4, 4);

            task(17);
            //17.Сгенерируйте и распечатайте последовательность по формуле:
            //n + 1 = n + 2
           seq17(7);

           task(18);
            //18.Написать метод, который принимает параметры ?, n,
            // 	и печатает последовательность чисел, начиная с числа n, по формуле для n + 1 члена последовательности:
            //n + 1 = 2n
            //Длина последовательности  ?.
            seq18(7, 13);

            task(19);
            //19.Сгенерируйте последовательность целых положительных двузначных чисел,
            // в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
            for (int i = 10; i < 100; i++) {
                int n1 = i / 10;
                int n2 = i % 10;
                if (Math.abs(n1 - n2) < 3) {
                    print(i);
                }
            }

            task(20);
            //20.	Написать метод, который вычислит значение функции
            metod20(20);
            metod20(0.1);
            metod20(-3);
            metod20(13.2589);

            print(formatDouble(13.58963257, 1));
            print(formatDouble(13.58963257, 4));







        }
    }
