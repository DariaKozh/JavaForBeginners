package homework;

import utils.Utils;

import java.util.Arrays;
import java.util.Locale;

import static utils.Utils.*;

public class HW10 {

    // Написать алгоритм CapitalizeWords, который принимает на вход предложение
    // с единичным пробелом между словами,
    // и возвращает предложение, в котором все слова написаны с большой буквы
    // "        happy birthday!  " --> "Happy Birthday!"
    // "     john jacob smith jr." --> "John Jacob Smith Jr."

    //пустой String = "";
    //String str = null;

    public static String capitalizeWords(String sentence) {
        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {
                //Character.toString(sentence.charAt(0)).toUpperCase()
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "";
        }

        return "";
    }

    //1.	 Написать метод, который принимает на вход строку.
    //Если строка не пустая, то примените метод по удалению пробелов в начале
    // строки и в конце строки.
    //Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая, вернуть сообщение “Строка пустая”.

    public static String deleteSpace(String text) {

        if (text.isEmpty() == true) {

            return "Строка пустая";
        } else {

            String t = text.trim();

            if (text.length() > t.length()) {

                return "Лишние пробелы удалены";
            } else {

                return "Пробелов не было";
            }
        }
    }

    //2.	Написать алгоритм RemoveAlla.
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    public static String removeAlla(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {
                text = text.replace("a", "");

                return text;
            }

            return "";
        } else {

            return "";
        }
    }

    //3.Написать алгоритм RemoveAllZeros.
    //С помощью методов из видео1, написать алгоритм, который принимает на вход строку, состоящую из цифр.
    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку, в которой нет нулей.
    public static String removeAllZeros(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                text = text.replace(" ", "");
                text = text.replace("0", "");

                return text;
            }

            return "";
        } else {

            return "";
        }
    }

    //4.	Написать алгоритм RemoveAllSpaces.
    //С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    public static String removeAllSpaces(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                text = text.replace(" ", "");

                return text;
            }

            return "";
        } else {

            return "";
        }
    }

    //5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    public static int countA(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                int counter = 0;
                text = text.toLowerCase();
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == 'a') {
                        counter++;
                    }
                }

                return counter;
            }

            return 0;
        } else {

            return 0;
        }
    }

    //6.Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
    public static boolean containsJava(String text) {

        if (text != null) {
            text = text.trim();

            if (text.length() != 0) {

                text = text.toLowerCase();
                boolean t = text.contains("java");

                return t;
            }

            return false;
        } else {

            return false;
        }
    }

    //7.Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
    // точку и кавычки в конце строки с помощью метода concat()
    public static String addQuotionMarks(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                String text1 = "\"";
                String text2 = "\".";
                text1 = text1.concat(text);
                text1 = text1.concat(text2);

                return text1;
            }

            return "";
        } else {

            return "";
        }
    }

    //8.Напишите метод, кoторый принимает на вход название города и исправляет написание
    public static String correctCity(String text) {

        if (text != null) {
            text = text.trim();

            if (text.length() != 0) {
                text = text.toLowerCase();
                text = text.substring(0, 1).toUpperCase() + text.substring(1);

                return text;
            }

            return "";
        } else {

            return "";
        }
    }

    //9.	Напишите метод, который принимает на вход строку, и возвращает все,
    // что находится между первой и последней буквой-параметром:
    //Test Data:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”
    public static String textBitweenIndex(String text, String letter) {

        if (text != null) {
            text = text.trim();

            if (text.length() != 0 && text.contains(letter) == true && letter.length() == 1) {

                text = text.substring(text.indexOf(letter), (text.lastIndexOf(letter) + 1));

                return text;
            }

            return "";

        } else {

            return "";
        }
    }

    //10.	Напишите метод, который принимает на вход слово, и возвращает true,
    // если слово начинается и заканчивается на одинаковую букву, и false иначе
    //Test Data:
    //	“Abracadabra” → true
    //	“Whippersnapper” → false
    public static boolean sameLetterStartAndEnd(String text) {
        if (text != null) {
            text = text.trim();

            if (text.length() != 0) {
                text = text.toLowerCase();

                if (text.charAt(0) == text.charAt(text.length() - 1)) {

                    return true;
                }

                return false;
            }

            return false;
        } else {

            return false;
        }
    }

    //11.	Напишите метод, который принимает на вход предложение и возвращает слова из этого
    // предложения в виде массива слов
    //Test Data:
    //“QA for Everyone” → {“QA”, “for”, “Everyone”}
    //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
    public static String[] arrayString(String text) {
        if (text != null) {
            text = text.trim();

            if (text.length() != 0) {

                String[] arrayString = text.split(" ");

                return arrayString;
            }

            return new String[]{};
        } else {

            return new String[]{};
        }
    }

    //12.	Написать метод, который принимает на вход предложение, которое состоит из имени,
    // фамилии, отчества и возвращает массив строк:
    //Test Data:
    //“Александр Сергеевич Пушкин” →
    //{“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
    public static String[] arrayName(String text) {
        if (text != null) {
            text = text.trim();

            if (text.length() != 0) {

                String[] arrayString = text.split(" ");
                if (arrayString.length == 3) {
                    arrayString[0] = "Имя: " + arrayString[0];
                    arrayString[1] = "Отчество: " + arrayString[1];
                    arrayString[2] = "Фамилия: " + arrayString[2];

                    return arrayString;
                }

                return new String[]{};
            }

            return new String[]{};
        } else {

            return new String[]{};
        }
    }

    //13.Написать метод, который возвращает сумму всех букв слова
    //
    //“abc” → 294
    //“ABC” → 198
    //“123” → 0 (это не буквы) 65-90 97-122
    public static int lettersSum(String text) {
        if (text != null) {
            text = text.trim();

            if (text.length() != 0) {
                int counter = 0;
                for (int i = 0; i < text.length(); i++) {
                    if ((text.charAt(i) >= 65 && text.charAt(i) <= 90) || (text.charAt(i) >= 97
                            && text.charAt(i) <= 122) || (text.charAt(i) >= 1040 && text.charAt(i) <= 1103)) {
                        counter += text.charAt(i) + 0;
                    }
                }

                return counter;
            }

            return 0;
        } else {

            return 0;
        }
    }

    //14.	Написать метод, который принимает на вход 2 буквы и возвращает true,
    // если первая буква встречается раньше второй, иначе метод возвращает false
    //method(“a”, “m”) → true
    //method(“m”, “l”) → false
    public static boolean compareLetter(String a, String b) {
        if (a != null && b != null) {
            a = a.trim();
            b = b.trim();

            if (a.length() == 1 && b.length() == 1) {

                if (a.charAt(0) < b.charAt(0)) {

                    return true;
                }

                return false;
            }

            return false;
        } else {

            return false;
        }
    }


    public static void main(String[] args) {

        task(0);
        // Написать алгоритм CapitalizeWords, который принимает на вход предложение
        // с единичным пробелом между словами,
        // и возвращает предложение, в котором все слова написаны с большой буквы
        // "        happy birthday!  " --> "Happy Birthday!"
        // "     john jacob smith jr." --> "John Jacob Smith Jr."
        //        System.out.println("        happy birthday!  ");
//        System.out.println(capitalizeWords("        happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(null));
//        System.out.println(capitalizeWords("     john jacob smith jr."));
        System.out.println(capitalizeWords(" "));


        Utils.task(1);

        //1.	 Написать метод, который принимает на вход строку.
        //Если строка не пустая, то примените метод по удалению пробелов в начале
        // строки и в конце строки.
        //Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
        //Если пробелов не было, вернуть сообщение “Пробелов не было”.
        //Если строка пустая, вернуть сообщение “Строка пустая”.
        //
        //Test Data:
        //“    QA4Everyone   “ → “Лишние пробелы удалены”
        //“QA4Everyone“ → “Пробелов не было”
        //“” → “Строка пустая”
        print(deleteSpace("    QA4Everyone   "));
        print(deleteSpace("QA4Everyone"));
        print(deleteSpace(""));

        task(2);
        //2.	Написать алгоритм RemoveAlla.
        //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
        // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
        // Метод возвращает обработанную строку.
        //Test Data:
        // “    QA4Everyone   “ →  “QA4Everyone“
        //“panda   “ → “pnd”
        print(removeAlla("    QA4Everyone   "));
        print(removeAlla("panda   "));

        task(3);
        //3.Написать алгоритм RemoveAllZeros.
        //С помощью методов из видео1, написать алгоритм, который принимает на вход строку, состоящую из цифр.
        // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
        // Метод возвращает обработанную строку, в которой нет нулей.
        //Test Data:
        // “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
        //“ 0000000111“ → “111”
        print(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        print(removeAllZeros(" 0000000111"));

        task(4);
        //4.	Написать алгоритм RemoveAllSpaces.
        //С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
        // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
        // Метод возвращает обработанную строку.
        //Test Data:
        // “    QA   4  Everyone   “ →  “QA4Everyone“
        //“p a     n d a   “ → “panda”
        print(removeAllSpaces("    QA   4  Everyone   "));
        print(removeAllSpaces("p a     n d a   "));

        task(5);
        //5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
        //Test Data:
        //“Abracadabra” → 5
        //“Homenum Revelio” → 0
        print(countA("Abracadabra"));
        print(countA("Homenum Revelio"));

        task(6);
        //6.Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
        System.out.println((containsJava("As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 "
                + "are the current long-term support (LTS) versions. Oracle released the last zero-cost public update "
                + "for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise "
                + "still support Java 8 with public updates for personal use indefinitely. Other vendors have begun"
                + " to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and "
                + "other upgrades.")));
        System.out.println(containsJava("As a decrepit father takes delight\n"
                + "To see his active child do deeds of youth,\n"
                + "So I, made lame by fortune’s dearest spite,\n"
                + "Take all my comfort of thy worth and truth.\n"
                + "For whether beauty, birth, or wealth, or wit,\n"
                + "Or any of these all, or all, or more,\n"
                + "Entitled in thy parts do crownèd sit,\n"
                + "I make my love engrafted to this store.\n"
                + "So then I am not lame, poor, nor despised,\n"
                + "Whilst that this shadow doth such substance give\n"
                + "That I in thy abundance am sufficed,\n"
                + "And by a part of all thy glory live.\n"
                + "Look what is best, that best I wish in thee.\n"
                + "This wish I have; then ten times happy me.\n"));

        task(7);
        //7.Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
        // точку и кавычки в конце строки с помощью метода concat()
        //Test Data:
        //“One” → ““One.””
        //“    TWO  “ → ““TWO.””
        print(addQuotionMarks("One"));
        print(addQuotionMarks("    TWO  "));

        task(8);
        //8.Напишите метод, кoторый принимает на вход название города и исправляет написание:
        //Test Data:
        //“ташкент” → “Ташкент”
        //“ЧикаГО” → “Чикаго”
        print(correctCity("ташкент"));
        print(correctCity("ЧикаГО"));

        task(9);
        //9.	Напишите метод, который принимает на вход строку, и возвращает все,
        // что находится между первой и последней буквой-параметром:
        //Test Data:
        //“Abracadabra”, “b” → “bracadab”
        //“Whippersnapper”, “p” → “ppersnapp”
        String c = null;
        print(textBitweenIndex("Abracadabra", "b"));
        print(textBitweenIndex("Whippersnapper", "p"));
        print(textBitweenIndex("Whippersnapper", "o"));
        print(textBitweenIndex(c, "e"));

        task(10);
        //10.	Напишите метод, который принимает на вход слово, и возвращает true,
        // если слово начинается и заканчивается на одинаковую букву, и false иначе
        //Test Data:
        //	“Abracadabra” → true
        //	“Whippersnapper” → false
        System.out.println(sameLetterStartAndEnd("Abracadabra"));
        System.out.println(sameLetterStartAndEnd("Whippersnapper"));
        System.out.println(sameLetterStartAndEnd(c));

        task(11);
        //11.	Напишите метод, который принимает на вход предложение и возвращает слова из этого
        // предложения в виде массива слов
        //Test Data:
        //“QA for Everyone” → {“QA”, “for”, “Everyone”}
        //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
        print(Arrays.toString(arrayString("QA for Everyone")));
        print(Arrays.toString(arrayString("Александр Сергеевич Пушкин")));

        task(12);
        //12.	Написать метод, который принимает на вход предложение, которое состоит из имени,
        // фамилии, отчества и возвращает массив строк:
        //Test Data:
        //“Александр Сергеевич Пушкин” →
        //{“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
        print(Arrays.toString(arrayName("Александр Сергеевич Пушкин")));
        print(Arrays.toString(arrayName("Александр Пушкин")));

        task(13);
        //13.Написать метод, который возвращает сумму всех букв слова
        //
        //“abc” → 294
        //“ABC” → 198
        //“123” → 0 (это не буквы)
        print(lettersSum("abc"));
        print(lettersSum("ABC"));
        print(lettersSum("123"));

        task(14);
        //14.	Написать метод,  который принимает на вход 2 буквы и возвращает true,
        // если первая буква встречается раньше второй, иначе метод возвращает false
        //method(“a”, “m”) → true
        //method(“m”, “l”) → false
        System.out.println(compareLetter("a", "m"));
        System.out.println(compareLetter("m", "l"));
        System.out.println(compareLetter("am", "m"));


    }


}
