package RomNumConv;

import java.util.List;

public class Converter {

      public static int romanToArab(String num) {
            num = num.toUpperCase();
            int result = 0;
            List<RomanNum> romNum = RomanNum.getRevSortValue();
            int i = 0;
            while (num.length() > 0 && romNum.size() > i) {
                  RomanNum symbol = romNum.get(i);
                  if (num.startsWith(symbol.name())) {
                        result += symbol.getValue();
                        num = num.substring(symbol.name().length());
                  } else {
                        i++;
                  }
            }

            return result;
      }

      public static String arabicToRoman(int num) {
            List<RomanNum> romNum = RomanNum.getRevSortValue();
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (num > 0 && romNum.size() > i) {
                  RomanNum symbol = romNum.get(i);
                  if (symbol.getValue() <= num) {
                        sb.append(symbol.name());
                        num -= symbol.getValue();
                  } else {

                        i++;
                  }
            }
            return sb.toString();
      }
}
