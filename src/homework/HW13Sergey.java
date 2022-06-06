package homework;

import java.util.ArrayList;
import java.util.List;

public class HW13Sergey {

    public static void main(String[] args) {

        //—оздать лист
        //«атем удалить из этого списка все цвета в которых встречаетс€ буква УLФ
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

        //—оздать лист со значени€ми от 100 до 1000.
        List<Integer> listInt = new ArrayList<>();

        for (int i = 100; i < 1001; i++) {
            listInt.add(i);
        }

        //”далить из листа, созданного в предыдущей задаче, все четные элементы.
        for (int i = listInt.size(); i-- > 0; ) {    //это така€же запись,как в 1м задании
            if (listInt.get(i) % 2 == 0) {
                listInt.remove(i);
            }
        }

        System.out.println(listInt);
    }
}
