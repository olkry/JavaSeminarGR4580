package TreeMapTest;

import java.util.*;


public class Test {

      public static TreeMap<String, Integer> sortHashMap(HashMap<String, Integer> notSortedMap) {
            TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(
                        new Comparator<String>() {
                              @Override
                              public int compare(String s1, String s2) {
                                    return Integer.compare(s1.length(), s2.length());
                              }
                        });
            sortedMap.putAll(notSortedMap);
            return sortedMap;
      }
}
