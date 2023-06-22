package HashPhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Methods {
      
      public static HashMap<String, List<Integer>> phoneFill(String[] phones) {
            HashMap<String, List<Integer>> outerMap = new HashMap<>();
            for (String string : phones) {
                  String[] splitedPhone = string.split(" ");
                  if (!outerMap.containsKey(splitedPhone[0])) {
                        List<Integer> phoneList = new ArrayList<>();
                        phoneList.add(Integer.parseInt(splitedPhone[1]));
                        outerMap.put(splitedPhone[0], phoneList);
                  } else {
                        outerMap.get(splitedPhone[0]).add(Integer.parseInt(splitedPhone[1]));
                        
                  }
            }
            return outerMap;
      }

      public static void printHashMap(HashMap<String, List<Integer>> phoneList) {
            for (Map.Entry<String, List<Integer>> item : phoneList.entrySet()) {
                  System.out.println(item.getKey() + " - " + item.getValue());
            }
            
      }
}
