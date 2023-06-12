

public class Task001 {
      // Дана строка sql-запроса "select * from students where ". Сформируйте часть
      // WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
      // ниже в виде json-строки.
      // Если значение null, то параметр не должен попадать в запрос.
      // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
      // "city":"Moscow", "age":"null"}

      public static String[] stringParsing(String unputString) {
            String[] firstSplit = unputString.split(",");
            String middleSplit = "";
            String outline = "";
            for (int i = 0; i < firstSplit.length; i++) {
                  middleSplit = middleSplit + firstSplit[i];
            }
            String[] secondSplit = middleSplit.split(":");
            for (int i = 0; i < secondSplit.length; i++) {
                  outline = outline + secondSplit[i] + " ";
            }
            String[] finaal = outline.split(" ");
            return finaal;
      }

      public static String stringCompelator(String[] parametr) {
            StringBuilder sb = new StringBuilder();
            int num = parametr.length;
            sb.append("select * from students where ");
            for (int i = 0; i < num - 3; i++) {
                  if (parametr[i] != "null") {
                        if (i % 2 == 0) {
                              sb.append(parametr[i] + " = ");
                        } else {
                              sb.append(parametr[i] + ", ");
                        }
                  }
                  else{
                        break;
                  }
            
            }
            sb.append(parametr[num-3]);
            return sb.toString();

      }

}
