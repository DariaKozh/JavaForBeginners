package homework;

import java.util.ArrayList;
import java.util.List;

public class HW13Sergey {

    public static void main(String[] args) {

        //������� ����
        //����� ������� �� ����� ������ ��� ����� � ������� ����������� ����� �L�
        List<String> list = new ArrayList<>();

        list.add("White.");
        list.add("Tan.");
        list.add("Yellow.");
        list.add("Orange.");
        list.add("Red.");
        list.add("Pink.");
        list.add("Purple.");
        list.add("Blue.");

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("l")) {
                list.remove(i);
            }
        }

        System.out.println(list);

        //������� ���� �� ���������� �� 100 �� 1000.
        List<Integer> listInt = new ArrayList<>();

        for (int i = 100; i < 1001; i++) {
            listInt.add(i);
        }

        //������� �� �����, ���������� � ���������� ������, ��� ������ ��������.
        for (int i = listInt.size(); i-- > 0; ) {    //��� ������� ������,��� � 1� �������
            if (listInt.get(i) % 2 == 0) {
                listInt.remove(i);
            }
        }

        System.out.println(listInt);
    }
}
