package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task003 {

      public static void crossArrey() {
            List<Object> oList = new ArrayList<>();
            oList.add("a");
            oList.add(1);
            oList.add(2);
            oList.add("b");
            System.out.println(oList);
            for (int i = 0; i < oList.size(); i++) {
                  System.out.println(oList.get(i).getClass());
            }
            oList.removeAll(Arrays.asList(new Integer[]{1,2}));
            System.out.println(oList);

      }

}
