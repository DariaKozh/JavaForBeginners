package lessons.lessons1to7;

public class PervTest {

    public static void main(String[] args) {

        //Первый тест
       //task(100);
// Проверьте число.
// Если число нечетное и кратно трем,
// то посчитайте результат деления на 3. Иначе
// посчитайте результат умножения на три.
// Если число Не нечетное, посчитайте произведение числа
// на результат деления на 2.

// Выведите результат работы алгоритма на печать.
// Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

// Напишите тест, который проверит работу вашего кода и выведет
// на печать результат проверки.
// Тестовые данные 23, 44, 21

// AAA

        int n = 3;
        int expectedResult = 1;

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println("n = " + n);

//Test
        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }



       // Коды для печати текста разными цветами
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";



    }
}
