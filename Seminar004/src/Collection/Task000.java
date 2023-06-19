package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task000 {

      public static void timeTest(int size) {
            // Подмена родителем своих потомков - полиморфизм
            List<Integer> simpleList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();
            // // Без полиморфизма
            // ArrayList<Integer> simpleList1 = new ArrayList<>();
            // LinkedList<Integer> linkedList1 = new LinkedList<>();

            Random rnd = new Random();

            long curTime = System.currentTimeMillis();
            System.out.println(curTime);

            curTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                  simpleList.add(1);
            }
            System.out.println("Простой список конец: " + (System.currentTimeMillis() - curTime));

            curTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                  linkedList.add(1);
            }
            System.out.println("Связанный список конец: " + (System.currentTimeMillis() - curTime));

            simpleList.clear();
            linkedList.clear();

            curTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                  simpleList.add(0,1);
            }
            System.out.println("Простой список начало: " + (System.currentTimeMillis() - curTime));

            curTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                  linkedList.add(0,1);
            }
            System.out.println("Связанный список начало: " + (System.currentTimeMillis() - curTime));

            curTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                  simpleList.add(rnd.nextInt(10000),1);
            }
            System.out.println("Простой список середина: " + (System.currentTimeMillis() - curTime));

            curTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                  linkedList.add(rnd.nextInt(10000),1);
            }
            System.out.println("Связанный список середина: " + (System.currentTimeMillis() - curTime));            
      }

}
