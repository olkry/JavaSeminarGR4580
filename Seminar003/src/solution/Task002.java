package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.print.Collation;

public class Task002 {
      public static void planetList() {
            String[] planet = { "Сатурн", "Юпитер", "Меркурий", "Венера", "Венера", "Марс", "Марс", "Земля", "Меркурий",
                        "Юпитер", "Меркурий", "Меркурий", "Сатурн", "Уран", "Юпитер", "Нептун", "Сатурн" };
            List<String> plList = Arrays.asList(planet);
            System.out.println(plList);
            Set<String> plSet = new HashSet<>(plList);
            for (String plan : plSet) {
                  System.out.println(plan + " " + Collections.frequency(plList, plan));
            }
            System.out.println(plSet);

      }

}
