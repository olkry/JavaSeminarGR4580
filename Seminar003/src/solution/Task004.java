package solution;

import java.util.ArrayList;
import java.util.List;

public class Task004 {

      public static void biblioList() {

            List<List<String>> library = new ArrayList<>();
            List<String> gList = new ArrayList<>();
            gList.add("Проза:");
            gList.add("Стругацкие");
            gList.add("Толстой");
            library.add(gList);
            List<String> gList2 = new ArrayList<>();
            gList2.add("Поэзия:");
            gList2.add("Пушкин");
            gList2.add("Бородино");
            library.add(gList2);
            System.out.println(library);

      }
}
