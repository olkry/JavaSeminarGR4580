package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task003 {

      public static void numFinder() {
            Random rnd = new Random();
            List<Integer> numList = new ArrayList<>();
            for (int index = 0; index < 25; index++) {
                  numList.add(rnd.nextInt(100)); // В скобках пишем ограничитель
            }
            // double mean = getAverage(numList);
            System.out.println(numList);
            System.out.printf("Maximum number in the list = %d%n", Collections.max(numList));
            System.out.printf("Minimum number in the list = %d%n", Collections.min(numList));
            System.out.printf("Arithmetic mean in the list = %.1f", getAverage(numList));

      }

      private static double getAverage(List<Integer> list) {
            long sum = 0;
            for (int i : list) {
                  sum += i;
            }
            return list.size() > 0 ? (double) sum / list.size() : 0;
      }
}
