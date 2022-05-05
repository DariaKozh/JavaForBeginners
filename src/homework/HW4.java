package homework;

public class HW4 {

    public static void task(int a) {
        System.out.println("\u001B[35m" + "\n****************\n  Задание № " + a + "\n****************" + "\u001B[30m");
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void ostatok(int k, int l, int m) {
        String te = "Результат деления " + k + " на " + l + " = " + (k / l) + ", а остаток от деления = " + (k % l)
                + "\nРезультат деления " + k + " на " + m + " = " + (k / m) + ", а остаток от деления = " + (k % m)
                + "\nРезультат деления " + l + " на " + m + " = " + (l / m) + ", а остаток от деления = " + (l % m)
                + "\nРезультат деления " + l + " на " + k + " = " + (l / k) + ", а остаток от деления = " + (l % k)
                + "\nРезультат деления " + m + " на " + l + " = " + (m / l) + ", а остаток от деления = " + (m % l)
                + "\nРезультат деления " + m + " на " + k + " = " + (m / k) + ", а остаток от деления = " + (m % k);
        print(te);
    }

    public static void delenie(int number1, int number2) {
        int del = number1 / number2;
        int ostatok = number1 % number2;
        print("Результат деления " + number1 + " на " + number2 + " = " + del + ", а остаток от деления = " + ostatok);
    }

    public static void delenie2(int number1, int number2, String t1, String t2) {
        print("Результат деления " + t1 + " на " + t2 + " = " + (number1 / number2)
                + ", а остаток от деления = " + (number1 % number2));
    }

    public static void kolvoyablok(int apple, int student) {
        print("Если " + apple + " яблок(а) поделить на " + student + " учеников, то каждый ученик получит по "
                + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");
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

        print("Если " + apple + " яблок" + ok(apple) + " поделить на " + student + " учеников, то каждый ученик получит по "
                + delenie + " яблок" + ok(delenie) + ", и " + ostatok + " яблок" + ok(ostatok) + " останется учителю.");

    }

    public static void temp(double cel) {
        double far = (cel * 9 / 5) + 32;
        print("Температура в Цельсиях равна  " + cel + "\nТемпература в Фаренгейтах равна " + far);
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
        System.out.println("1) (2 = 2) И (7 = 7) = " + ((2 == 2) || (7 == 7)));
        System.out.println("2) Не(15 < 3) = " + (!(15 < 3)));
        System.out.println("3) (\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = \"Клён\") = "
                + (("Сосна" == "Дуб") || ("Вишня" == "Клен")));
        System.out.println("4) Не(\"Сосна\" = \"Дуб\") = " + (!("Сосна" == "Дуб")));
        System.out.println("5) (Не(15 < 3)) И (10 > 20) = " + (!(15 < 3) && (10 > 20)));

        String a = "Глаза даны, чтобы видеть";
        String b = "Под третьим этажом находится второй этаж";
        Boolean c = Boolean.valueOf(a);
        c = true;
        Boolean d = Boolean.valueOf(b);
        d = true;
        System.out.println("6) (\"Глаза даны, чтобы видеть\") И (\"Под третьим этажом находится второй этаж\") = "
                + (c && d));
        System.out.println("7) (6/2 = 3) ИЛИ (7*5 = 20) = " + ((6 / 2 == 3) || (7 * 5 == 20)));

        task(4);
        String a11 = "\"В минуте 70 секунд\"";
        String b11 = "\"Работающие часы показывают время\"";
        String con1 = "\"В минуте 60 секунд\"";
        String con2 = "\"Работающие часы показывают время\"";
        Boolean e1 = (a11.equals(con1) || b11.equals(con2));
        System.out.println(e1);

        String a1 = "\"В минуте 70 секунд\"";
        String b1 = "\"Работающие часы показывают время\"";
        Boolean c1 = Boolean.valueOf(a1);
        c1 = false;
        Boolean d1 = Boolean.valueOf(b1);
        d1 = true;
        System.out.println("1) " + a1 + " ИЛИ " + b1 + " = " + (c1 || d1));

        System.out.println("2) !(28 > 7) И !(300/5 = 60) = " + (!(28 > 7) && !(300 / 5 == 60)));

        String a2 = "\"Телевизор - электрический прибор\"";
        String b2 = "\"Стекло - дерево\"";
        Boolean c2 = Boolean.valueOf(a2);
        c2 = true;
        Boolean d2 = Boolean.valueOf(b2);
        d2 = false;
        System.out.println("3) " + a2 + " И " + b2 + " = " + (c2 && d2));

        //4) Не((300 < 100))  ? ("Жажду можно утолить водой")
        if (!(300 < 100)) {
            print("4) Жажду можно утолить водой");
        }
        //5) (75 < 81) ? (88 = 88)
        if (75 < 81) {
            print("5) 88 = 88");
        }

        task(5);
        //а) Андрей старше Светы. Наташа старше Светы.
        //б) На полке стоят учебники, а на столе лежат справочники.
        //в) БОльшая часть детей — девочки. Остальные - мальчики.
        String a3 = "Андрей старше Светы.";
        String b3 = "Наташа старше Светы.";
        System.out.println("а) " + a3 + " || " + b3);
        System.out.println("б) На полке стоят учебники || на столе лежат справочники");
        System.out.println("в) БОльшая часть детей — девочки && Остальные - мальчики");

        task(6);
        //“Водительские права можно получить, только когда исполнится 16 лет.”
        int age = 16;
        if (age == 16) {
            String prava = "Водительские права можно получить";
            System.out.println(prava);
        }

        task(7);
        //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
        print("!(Петя едет в автобусе) && (читает книгу || не смотрит в окно)");

        boolean petyaEdetAvtobus = false;
        boolean petyaRead = true;
        boolean petyaLookInWindow = false;

        System.out.println(petyaEdetAvtobus && (petyaRead || petyaLookInWindow));

        task(8);
        //“Если с другом ты, это хорошо, а когда наоборот - плохо”
        String t1 = "Ты с другом";
        if (t1 == "Ты с другом") {
            String t2 = "Это хорошо";
            System.out.println(t1 + " - " + t2);
        } else {
            String t2 = "Это плохо";
            System.out.println(t1 + " - " + t2);
        }
        task(9);
        //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age2 = 100;
        if (age2 >= 18 && age2 < 100) {
            String t3 = "Ты взрослый.";
            System.out.println("Тебе " + age2 + " лет. " + t3);
        } else if (age2 > 0 && age2 < 18) {
            String t3 = "Ты ребенок.";
            System.out.println("Тебе " + age2 + " лет. " + t3);
        } else {
            print("Возраст указан не верно.");
        }


        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String t4 = "Земля мокрая.";
        if (t4 == "Земля сухая.") {
            String t5 = " Нет дождя.";
            System.out.println(t4 + t5);
        }
        if (t4 == "Земля мокрая.") {
            String t5 = " Идет дождь.";
            System.out.println(t4 + t5);
        }
        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String t6 = "Земля сырая.";
        if (t6 == "Земля мокрая.") {
            String t7 = " Идет дождь.";
            System.out.println(t6 + t7);
        } else if (t6 == "Земля сухая.") {
            String t7 = " Нет дождя.";
            System.out.println(t6 + t7);
        } else {
            String t7 = " Идет снег.";
            System.out.println(t6 + t7);
        }

        //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String sky = "На небе солнце.";
        if (sky == "На небе тучи.") {
            String t = " Идет дождь.";
            System.out.println(sky + t);
        } else {
            String t = " Идет \"слепой\" дождь.";
            System.out.println(sky + t);
        }

        //Если сегодня суббота, значит, завтра воскресенье.
        //Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье
        String today = "Среда";
        if (today == "Суббота") {
            String tomorrow = "Воскресенье";
            print("Сегодня " + today + ", то завтра " + tomorrow);
        } else if (today == "Пятница") {
            String yesterday = "Четверг";
            print("Сегодня " + today + ", то вчера " + yesterday);
        } else {
            String tomorrow = "Не воскресенье";
            String yesterday = "Не Четверг";
            print("Сегодня " + today + ", то вчера " + yesterday + ", а завтра " + tomorrow);
        }

        //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String t10 = "На горе не свистнул рак";
        if (t10 == "На горе свистнул рак") {
            String t11 = ", значит, прошла вечность";
            System.out.println(t10 + t11);
        } else {
            String t11 = ", значит, ждите дальше";
            System.out.println(t10 + t11);
        }

        //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        int age3 = 14;
        String t12 = "ты не закончил школу";
        if (age3 == 18 || t12 == "ты закончил школу") {
            String t13 = ", то ты можешь не жить с родителями";
            print("Тебе " + age3 + " лет или " + t12 + t13);
        } else {
            String t13 = ", то живи с родителями";
            print("Тебе " + age3 + " лет или " + t12 + t13);
        }

        task(10);
        //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        //Выведите результат работы алгоритма на печать.
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        int a4 = 41;
        if (a4 % 2 == 0) {
            a4 = a4 * 2;
            print("Число a4 = " + (a4 / 2) + " четное, тогда удвоим его и будет равно " + a4);
        } else {
            int a5 = a4 * a4;
            print("Число a4 = " + a4 + " нечетное, тогда возведем его в квадрат и будет равно " + a5);
        }

        task(11);
        //Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //a)	Голосовать можно с 18 лет
        //b)	Машину можно водить с 16 лет
        //c)	В школу можно идти с 5 лет
        int age4 = 8;
        if (age4 >= 18) {
            String t = "\nГолосовать можно.";
            System.out.println("Тебе " + age4 + " лет. " + t);
        } else {
            String t = "\nГолосовать нельзя.";
            System.out.println("Тебе " + age4 + " лет. " + t);
        }

        if (age4 >= 16) {
            String t = "Машину водить можно.";
            System.out.println(t);
        } else {
            String t = "Машину водить нельзя.";
            System.out.println(t);
        }

        if (age4 >= 5 && age4 < 18) {
            String t = "В школу идти можно.";
            System.out.println(t);
        } else {
            String t = "В школу идти нельзя.";
            System.out.println(t);
        }

        task(12);
        //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //a)	5 - выдать похвальную грамоту и перевести в следующий класс
        //b)	4 - перевести в следующий класс
        //c)	3 - дать задание на лето и перевести в следующий класс
        //d)	2 - вызвать родителей и оставить в текущем классе на второй год
        int ball = 9;
        if (ball == 2) {
            String t = "вызвать родителей и оставить в текущем классе на второй год";
            print("Оценка ученика " + ball + ", нужно " + t);
        } else if (ball == 3) {
            String t = "дать задание на лето и перевести в следующий класс";
            print("Оценка ученика " + ball + ", нужно " + t);
        } else if (ball == 4) {
            String t = "перевести в следующий класс";
            print("Оценка ученика " + ball + ", нужно " + t);
        } else if (ball == 5) {
            String t = "выдать похвальную грамоту и перевести в следующий класс";
            print("Оценка ученика " + ball + ", нужно " + t);
        } else {
            print("Укажите верный балл от 2 до 5");
        }

        task(13);
        //Напишите алгоритм программы, которая проверяет 2 числа.
        //Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа,
        //которые делятся на 5 без остатка. Программа умножает числа, которые делятся на 2 без остатка,
        //но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
        //Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
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
            print("Действия произвести нельзя");
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
        //Напишите метод, который примет на вход параметр температуры в Цельсиях,
        // и распечатает результат температуры в Цельсиях и в Фаренгейтах.
        temp(59);

        task(18);
        tabl(13);
        tabl(1.1);

        task(19);
        //Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
        //Тестовые данные - 2, 5, 0.
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
        //Напишите тест, который валидирует ваш код из задания №11. Придумайте тестовые данные.
        // Выведите результат проверки на печать.
        int age7 = 90;
        String result ="";
        if (age7 >= 18) {
            result = "Голосовать можно.";
            System.out.println("Тебе " + age7 + " лет. \n" + result);
        } else {
            result = "Голосовать нельзя.";
            System.out.println("Тебе " + age7 + " лет. \n" + result);
        }

        String expectedResult1 = "Голосовать нельзя.";

        if (expectedResult1.equals(result)) {
            print("\u001B[32m" + "Pass");
        } else {
            print("\u001B[31m" + "Fail");
        }


        task(21);
        //21.	Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
        // и выводит результат проверки.
        //( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
        //Выведите результат проверки на печать.
        short s = 1524;
        if (("" + Math.abs(s)).length() == 1) {
            String t = " It’s a one-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 2) {
            String t = " It’s a two-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 3) {
            String t = " It’s a tree-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 4) {
            String t = " It’s a four-digit number.";
            print(s + t);
        }
        if (("" + Math.abs(s)).length() == 5) {
            String t = " It’s a five-digit number.";
            print(s + t);
        }


    }
}
