package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task001 {

      public static void randomListSort() {
            Random rnd = new Random();
            List<Integer> numL = new ArrayList<>();
            for (int index = 0; index < 10; index++) {
                  numL.add(rnd.nextInt(100)); // В скобках пишем ограничитель
            }
            System.out.println(numL);
            Collections.sort(numL);
            System.out.println(numL);

      }

      // public static void variantBalabola() { // Чушь не используем
      //       static Random random = new Random();
            
      // }
      
}
