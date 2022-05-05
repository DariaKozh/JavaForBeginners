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
        System.out.println(ANSI_CYAN + "\n****************\n  Задание № " + a + "\n****************" + ANSI_RESET);
    }

    //2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
    public static String dayOfWeek(int number) {

        String dayOfWeek;

        if (number == 1) {
            dayOfWeek = "Понедельник";
        } else if (number == 2) {
            dayOfWeek = "Вторник";
        } else if (number == 3) {
            dayOfWeek = "Среда";
        } else if (number == 4) {
            dayOfWeek = "Четверг";
        } else if (number == 5) {
            dayOfWeek = "Пятница";
        } else if (number == 6) {
            dayOfWeek = "Суббота";
        } else if (number == 7) {
            dayOfWeek = "Воскресенье";
        } else {
            dayOfWeek = "Ошибка. Введите число от 1 до 7";
        }

        print(dayOfWeek);

        return dayOfWeek;

    }

    //3. дано 3 значения, найти большее и присвоить его переменной largest
    public static int maxValue(int x, int y, int z) {
        int largest = Math.max((Math.max(x, y)), z);

        System.out.println(largest);
        return largest;
    }

    //4. Используя if, написать код, который выводит наименьшее значение из a, b и с
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

    //5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    public static double averageOfFive(double number1, double number2, double number3, double number4,
                                       double number5) {
        double average = (number1 + number2 + number3 + number4 + number5) / 5;

        print("Средняя темпаратура кота = " + average);

        return average;
    }

    //6.Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.
    public static String money(double number) {

        String money;

        if (number < 0) {
            money = "Ошибка. Введите положительное число.";
            print(money);
        } else {
            int money1 = (int) number;
            int money2 = (int) (number * 100) % 100;
            money = "" + money1 + " руб " + money2 + " коп";
            print(money);
        }

        return money;
    }

    public static String money2(double number) {

        String money;

        if (number < 0) {
            money = "Ошибка. Введите положительное число.";
            print(money);
        } else {
            int money1 = (int) number;
            int money2 = (int) (number * 100) % 100;
            money = "" + money1 + " руб " + money2 + " коп";
        }

        return money;
    }

    //7.Написать метод, который принимает на вход десятичное число и возвращает строку 10 кг 750 гр
    public static String weight(double number) {

        String weight;

        if (number < 0) {
            weight = "Ошибка. Введите положительное число.";
            print(weight);
        } else {
            int weight1 = (int) number;
            int weight2 = (int) (number * 1000) % 1000;
            weight = "" + weight1 + " кг " + weight2 + " гр";
            print(weight);
        }

        return weight;
    }

    public static String weight2(double number) {

        String weight;

        if (number < 0) {
            weight = "Ошибка. Введите положительное число.";
            print(weight);
        } else {
            int weight1 = (int) number;
            int weight2 = (int) (number * 1000) % 1000;
            weight = "" + weight1 + " кг " + weight2 + " гр";
        }

        return weight;
    }


    //8.Написать метод, который принимает на вход 2 параметра -  цену и количество товара
    // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
    public static double summaPokypki(double value, double amount) {

        double summaPokypki;

        if (value < 0 || amount < 0) {
            print("Ошибка. Введите положительное число.");
            return Double.MIN_VALUE;
        } else {
            summaPokypki = value * amount;
            System.out.println(summaPokypki);
            return summaPokypki;
        }
    }


            /*9.	Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        Например:

        Яблоки
        Цена за 1 кг			50 руб 13 коп
        Количество товара	         3 кг 400 гр
                _______________________________________
        Сумма к оплате		170 руб 44 коп

                или

        Хлеб
        Цена за 1 шт		30 руб 50 коп
        Количество товара	5 шт
                _______________________________________
        Сумма к оплате		152 руб 50 коп

*/

    public static void chek(String name, double value, double amount, String kgOrPiece) {

        double summaPokypki;

        if (value < 0 || amount < 0) {
            print("Ошибка. Введите положительное число.");
        } else if (!(kgOrPiece.equals("кг") || kgOrPiece.equals("шт"))) {
            print("Ошибка. Введите значение кг или шт.");
        } else {
            summaPokypki = value * amount;
            if (kgOrPiece.equals("шт")) {
                print(name + "\nЦена за 1 " + kgOrPiece + "             " + money2(value)
                        + "\nКоличество товара        " + (int) amount + " " + kgOrPiece
                        + "\n          ------------------------------------------------------\nСумма к оплате           "
                        + money2(summaPokypki));
            } else {
                print(name + "\nЦена за 1 " + kgOrPiece + "             " + money2(value)
                        + "\nКоличество товара        " + weight2(amount) + " "
                        + "\n          ------------------------------------------------------\nСумма к оплате           "
                        + money2(summaPokypki));
            }
        }
    }

    //10.	Написать метод, который принимает на вход количество часов работы в день
    // и стоимость одного часа работы, и возвращает заработную плату в месяц.
    public static double zarplata(double hour, double value) {

        double zarplata;

        if (hour < 0 || value < 0) {
            print("Ошибка. Введите положительное число.");
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
            print("Ошибка. Введите положительное число.");
            return Double.MIN_VALUE;
        } else {
            zarplata = hour * value;
            return zarplata;
        }
    }


    //11.	Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости
    // выдачи зарплаты сотрудникам.
    //Например:
    //Смирнова Мария Ивановна 		70000 руб 00 коп

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

    //13.	Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
    // Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
    // снова считается сумма всех чисел.
    //Например:
    //год рождения 1999
    //1 + 9 + 9 + 9 = 28
    //2 + 8 = 10
    //1 + 0 = 1
    //Счастливое число - 1

    public static int sumNumberOfNumber(int number) {

        int summa;

        if (number < 0 || number > 9999) {
            print("Ошибка. Введите год рождения от 0 до 9999");
            return (int) Double.MIN_VALUE;
        } else {
            int number1 = number / 1000;
            int number2 = (number / 100) % 10;
            int number3 = ((number / 10) % 100) % 10;
            int number4 = ((number % 1000) % 100) % 10;
            System.out.println("Год рождения " + number1 + number2 + number3 + number4);
            summa = number1 + number2 + number3 + number4;

            if (summa > 10) {
                summa = summa / 10 + summa % 10;
                System.out.println("Счастливое число - " + summa);

            } else {
            System.out.println("Счастливое число - " + summa);
            }

            return summa;
        }
    }

    //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

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
            print("Среднее значение " + average + " отличается от медианы " + mediana + " на " + razn);
        } else {
            print("Среднее значение =  " + average + ", медиана = " + mediana);
        }
    }

    //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
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
            print("Среднее значение " + average + " отличается от медианы " + mediana + " на " + razn);
        } else {
            print("Среднее значение =  " + average + ", медиана = " + mediana);
        }
    }

    //15.Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
    // например “10 руб 00 коп”.
    public static String okruglSumma(double value) {

        double okruglSum = Math.floor(value);
        String itog = money(okruglSum);

        return itog;
    }

    //17.1)написать метод, который присваивать х 1, если y > 0
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

    //19Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

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
        //Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
        dayOfWeek(1);
        dayOfWeek(7);
        dayOfWeek(-523);
        verifyEquals("Среда", dayOfWeek(3));
        verifyEquals("Суббота", dayOfWeek(5));

        task(3);
        //дано 3 значения, найти большее и присвоить его переменной largest
        maxValue(59, -412, 4);
        verifyEquals(maxValue(45, 789521, -79143), 78);
        verifyEquals(maxValue(45, 789521, -79143), 789521);

        task(4);
        //4. Используя if, написать код, который выводит наименьшее значение из a, b и с
        minValueOfThree(12, 47, 4);
        verifyEquals(minValueOfThree(-78, -795213, 46325), 457);
        verifyEquals(minValueOfThree(1, 2, 30), 1);

        task(5);
        //5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
        averageOfFive(37.52, 39.1, 40, 38.8, 37.999);
        verifyEquals(averageOfFive(37.52, 39.1, 40, 38.8, 37.999), 38.5);

        task(6);
        //6.Написать метод, который принимает на вход десятичное число (например, 10.75),
        // и возвращает строку “10 руб 75 коп”
        money(158.74);
        money(1487825.7859536);
        money(-11.258);
        verifyEquals(money(12.789), "125 руб 10 коп");
        verifyEquals(money(14.92), "14 руб 92 коп");

        task(7);
        //7.Написать метод, который принимает на вход десятичное число и возвращает строку 10 кг 750 гр
        weight(125.1478);
        weight(-4598);
        weight(102);
        verifyEquals(weight(14895.1228), "14895 кг 122 гр");
        verifyEquals(weight(-159), "125 кг");

        task(8);
        //8.Написать метод, который принимает на вход 2 параметра -  цену и количество товара
        // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
        summaPokypki(105.123, 52);
        summaPokypki(12, -1);
        summaPokypki(147.12, 1.5896);
        verifyEquals(summaPokypki(12.236, 1), 123);
        verifyEquals(summaPokypki(10, 2.1), 21);

        task(9);
        /*9.	Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        Например:

        Яблоки
        Цена за 1 кг			50 руб 13 коп
        Количество товара	         3 кг 400 гр
                _______________________________________
        Сумма к оплате		170 руб 44 коп

                или

        Хлеб
        Цена за 1 шт		30 руб 50 коп
        Количество товара	5 шт
                _______________________________________
        Сумма к оплате		152 руб 50 коп

*/
        chek("Яблоки", 123.26, 5.85, "шт");
        print("***");
        chek("Ягоды", 1456.785, 235.8963, "кг");
        print("***");
        chek("Коты", -456.1, 4, "шт");
        print("***");
        chek("Клеенка", 30.52, 30, "шт");
        print("***");
        chek("Карандаш", 100, 90, "шт");

        task(10);
        //10.	Написать метод, который принимает на вход количество часов работы в день
        // и стоимость одного часа работы, и возвращает заработную плату в месяц.
        zarplata(5.5, 123.52);
        verifyEquals(zarplata(88, 152), 280896);
        verifyEquals(zarplata(-88, 12), 289);
        verifyEquals(zarplata(0, 1782), 0);

        task(11);
        //11.	Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости
        // выдачи зарплаты сотрудникам.
        //Например:
        //Смирнова Мария Ивановна 		70000 руб 00 коп
        vedomostZp("Иванова Ольга", 48, 145.62);
        vedomostZp("Сидорова Мария", -8, 12);
        vedomostZp("Петрова Нина", 45, 256.48);

        task(12);
        pozitivOrNegativ(12);
        pozitivOrNegativ(-89);
        pozitivOrNegativ(0);
        verifyEquals(pozitivOrNegativ(14), "x is positive");
        verifyEquals(pozitivOrNegativ(-8), "x is positive");

        task(13);
        //13.	Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
        // Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
        // снова считается сумма всех чисел.
        //Например:
        //год рождения 1999
        //1 + 9 + 9 + 9 = 28
        //2 + 8 = 10
        //1 + 0 = 1
        //Счастливое число - 1

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

        //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
        //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
        //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

        raznMedianaAndAverage(3, 5, 9);
        raznMedianaAndAverage(-895, 12, 1258);
        raznMedianaAndAverage(8563, -0.4569, -85.12);
        raznMedianaAndAverage(5, -78, -251);

        //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
        raznMedianaAndAverage2(2, 6, 7);
        raznMedianaAndAverage2(-185, 8569, 14);
        raznMedianaAndAverage2(5, -78, -251);

        task(15);
        //15.Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
        // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
        // например “10 руб 00 коп”.
        okruglSumma(10.75);
        okruglSumma(14785.785);
        verifyEquals("10 руб 75 коп", okruglSumma(10.75));
        verifyEquals("10 руб 0 коп", okruglSumma(10.75));

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
        //1)написать утверждение, который присваивать х 1, если y > 0
        int x;
        int y = 16;
        if (y > 0) {
            x = 1;
            System.out.println(x);
        }

        System.out.println(met1(12, -9));
        System.out.println(met1(-8, -7));

        print("------");
        //2) Оценка score переменная double, написать утверждение, который увеличивает score на 5 баллов,
        // если score между 80 и 90

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
        //4) Написать утверждение, которое печатает true, если х нечетное число и положительное
        int x1 = 13;
        if (x1 % 2 == 1 && x1 > 0) {
            print("true");
        }

        print("------");
        //5) Написать утверждение, которое печатает true, если х и y оба положительные
        int x2 = -3;
        int y2 = -4;
        if (y2 > 0 && x2 > 0) {
            print("true");
        }

        true11(12, 4);
        true11(4, -7);


        print("------");
        //6) Написать утверждение, которое печатает true, если х и y имеют одинаковые знаки + и -

        if ((y2 > 0 && x2 > 0) || (y2 < 0 && x2 < 0)) {
            print("true");
        }

        task(18);
        //18.	Написать метод, который с помощью методов класса Math высчитывает любую степень
        // сгенерированного случайного числа.
        // Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”
        //Число может быть в пределах от 0 до 1 исключительно.
        //Степень числа может быть от 0 до 10 включительно

        double n = Math.random();
        double pow1 = Math.random() * 11;
        double nInPow = Math.round(Math.pow(n, pow1));
        print("Число " + n + " в степени " + pow1 + " = " + nInPow);

        System.out.println(getPow(2));
        System.out.println(getPow(-2));

        task(19);
        //19.Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
        double n1 = (Math.random() * 99) + 1;
        System.out.println(n1);

        getRandom1to99();
        getRandom1to99();

        task(20);

        year(1989);


    }
}