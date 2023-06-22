import java.util.HashMap;
import java.util.List;

import HashPhoneBook.Methods;

public class App {
    public static void main(String[] args) throws Exception {

        // String[] phones = { "Иванов 123456", "Васильев 321456", "Иванов 234432",
        // "Петров 654321",
        // "Иванов 345678", "Иванов 23722", "Васильев 324556", "Петров 652901",
        // "Васильев 327756",
        // "Иванов 345690", "Иванов 442432", "Петров 041321", "Иванов 345688", "Петров
        // 234561",
        // "Иванов 298752", "Петров 654729", "Иванов 345666", "Васильев 327776" };

        // HashMap<String, List<Integer>> phoneList =
        // HashPhoneBook.Methods.phoneFill(phones);
        // HashPhoneBook.Methods.printHashMap(phoneList);

        int[] numbers = { 234, 56, 78, 987, 4, 34, 56, 765, 6, 7, 8732, 978, 4, 
            32, 69, 7, 814, 5, 980, 13, 94, 76, 831, 9, 85, 74, 867, 8, 31, 94, 767, 2 };

        HeapSort.Methods.piramidSort(numbers);
        HeapSort.Methods.printArray(numbers);

    }
}
