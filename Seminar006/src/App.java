import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import CatLibrary.Cat;

public class App {
    public static void main(String[] args) throws Exception {

        int[] randomArrey = OriginNumFinder.Finder.getRandomArray(300, 25);
        Set<Integer> randomSet = OriginNumFinder.Finder.arrayToSet(randomArrey);
        System.out.println("Процент уникальных чисел: " + OriginNumFinder.Finder.percenter(randomArrey, randomSet));

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        Cat myCat = new Cat(2000, "Барсик", 245, formatter.parse("Sat, April 4, 2019"), true, 1);
        Cat motherCat = new Cat(3000, "Кеша", 245, formatter.parse("Sat, April 4, 2010"), false, 2);

        HashSet<Cat> catSet = new HashSet<Cat>();
        catSet.add(myCat);
        catSet.add(motherCat);

        System.out.println(myCat);
        System.out.println(motherCat);

        System.out.println(myCat.equals(motherCat));
        System.out.println(catSet.contains(motherCat));
    }

    public static void SetTest() {
        HashSet<Integer> numSet = new HashSet<Integer>(); // Сам сортирует,
        numSet.add(1);
        numSet.add(6);
        numSet.add(4);
        numSet.add(2);
        numSet.add(3);
        numSet.add(5);
        numSet.add(2);
        numSet.add(3);
        numSet.add(6);
        System.out.println(numSet);

        LinkedHashSet<Integer> numSetLink = new LinkedHashSet<Integer>(); // Создаёт линки для сетак, кто за кем
        numSetLink.add(1);
        numSetLink.add(6);
        numSetLink.add(4);
        numSetLink.add(2);
        numSetLink.add(3);
        numSetLink.add(5);
        numSetLink.add(2);
        numSetLink.add(3);
        numSetLink.add(6);
        System.out.println(numSetLink);

        TreeSet<Integer> numSetTree = new TreeSet<Integer>(); // Выстраивает индекса по возрастанию
        numSetTree.add(1);
        numSetTree.add(6);
        numSetTree.add(4);
        numSetTree.add(2);
        numSetTree.add(3);
        numSetTree.add(5);
        numSetTree.add(2);
        numSetTree.add(3);
        numSetTree.add(6);
        System.out.println(numSetTree);
    }
}
