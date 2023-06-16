import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import solution.Task000;
import solution.Task001;
import solution.Task002;
import solution.Task003;
import solution.Task004;

public class App {
    public static void main(String[] args) throws Exception {
        // Task000.StringTest();
        // Task001.randomListSort();
        // Task002.planetList();
        // Task003.crossArrey();
        Task004.biblioList();

        // // Для дз 2
        Random rnd = new Random();
        List<Integer> iList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            iList.add(rnd.nextInt(1000));
        }
        List<Integer> delList = new ArrayList<>();
        for (Integer num : iList) {
            if (num%2==0) {
                delList.add(num);
            }
        }
        iList.removeAll(delList);
        System.out.println(iList);

        // // Для дз 3
        // Random rnd = new Random();
        // List<Integer> iList = new ArrayList<>();
        // for (int i = 0; i < 100; i++) {
        //     iList.add(rnd.nextInt(1000));
        // }

    }
}
