package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task002 {

      public static void arreyCliner() {
            Random random = new Random();
            List<Integer> fullList = new ArrayList<>();
            for (int i = 0; i < 25; i++) {
                  fullList.add(random.nextInt(100));
            }
            System.out.println(random);
            List<Integer> finalList = new ArrayList<>();
            for (Integer num : fullList) {
                  if (num % 2 != 0) {
                        finalList.add(num);
                  }
            }
            System.out.println(fullList);
            System.out.println(finalList);
            
      }

}
