package lessons.lessons1to7;

public class Lesson7 {

    public static void main(String[] args) {

        //������ ���� String �� ��������� "�����"
        String catName = "�����";

        //������ ������ ���� String-������
        String[] catsNames;

        //������ ���� String-������,  ��������� �� 8 �����
        catsNames = new String[8];
        catsNames[4] = "�����";
        catsNames[1] = "������";
        catsNames[6] = "�����";

        //������ ���� int-������,  ��������� �� 8 �����
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
            if (catsNames[i] == "�����") {
                System.out.println(catsNames[i]);
            }
        }

        System.out.println("___________________________");
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "�����") {
                System.out.println(i);
            }
        }

        System.out.println("___________________________");
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "������") {
                System.out.println(i);
            }
        }

        System.out.println("___________________________");
        System.out.println(catsNames.length);
        System.out.println(catsAges.length);
    }







}
