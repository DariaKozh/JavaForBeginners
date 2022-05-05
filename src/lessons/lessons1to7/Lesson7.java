package lessons.lessons1to7;

public class Lesson7 {

    public static void main(String[] args) {

        //объект типа String со значением "–ыжик"
        String catName = "–ыжик";

        //€чейка пам€ти типа String-массив
        String[] catsNames;

        //объект типа String-массив,  состо€щий из 8 €чеек
        catsNames = new String[8];
        catsNames[4] = "–ыжик";
        catsNames[1] = "„ерныш";
        catsNames[6] = "–ыжик";

        //объект типа int-массив,  состо€щий из 8 €чеек
        int[] catsAges = new int[8];

        System.out.println(catName);
        System.out.println(catsNames);
        System.out.println(catsNames);
        System.out.println(catsAges);

        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsAges[2]);

        System.out.println(catsNames[4]);

        System.out.println("___________________________");
        for (int i = 0; i <= 7; i++) {
            System.out.println(catsNames[i]);
        }

        System.out.println("___________________________");
        for (int i = 0; i < 8; i ++) {
            if (catsNames[i] == "–ыжик") {
                System.out.println(catsNames[i]);
            }
        }

        System.out.println("___________________________");
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "–ыжик") {
                System.out.println(i);
            }
        }

        System.out.println("___________________________");
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "„ерныш") {
                System.out.println(i);
            }
        }

        System.out.println("___________________________");
        System.out.println(catsNames.length);
        System.out.println(catsAges.length);
    }







}
