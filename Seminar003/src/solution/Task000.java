package solution;

import java.util.ArrayList;
import java.util.List;

public class Task000 {

      public static void StringTest() {
            
      
            String s1 = "hello";
            String s2 = "hello";
            String s3 = s1;
            String s4 = "h" + "e" + "l" + "l" + "o";
            String s5 = new String("hello");
            String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

            if (s1 == s2) System.out.println("Test 1 ok");
            if (s3 == s4) System.out.println("Test 2 ok");
            if (s5.equals(s6)) System.out.println("Test 3 ok"); // Сравнение по значению, содержимому
            System.out.println(s5);
            System.out.println(s6);

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            s2="new value";
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);

            List<String> stringList1 = new ArrayList<>();
            stringList1.add(s1);
            stringList1.add("new value");
            List<String> stringList2 = stringList1;

            System.out.println(stringList1);
            System.out.println(stringList2);
            stringList1 = new ArrayList<>();
            stringList1.add("new value 222");
            stringList2.add("new value 333");
            System.out.println(stringList1);
            System.out.println(stringList2);


      }

}
