package CollectionDZ;

import java.util.LinkedList;
import java.util.Queue;

public class Task002 {
    
    private static Queue<Integer> queue = new LinkedList<Integer>();

    public static void name() {
        queue.add(4);
        queue.add(16);
        queue.add(2);
        queue.add(8);
        queue.add(22);
        System.out.println("Миеем очередь: " + queue);
        System.out.println("Добовляем в конец очереди число 33: " + enqueue(queue, 33));
        System.out.println("Удаляем число "+ dequeue(queue) +", первое в очереди.");
        System.out.println("Теперь первое число: " + first(queue));
        System.out.println("Получаем очередь: " + queue);
        
    }

    private static Queue<Integer> enqueue(Queue<Integer> queue, int num) {
        queue.offer(num);
        return queue;
    }

    private static Integer dequeue(Queue<Integer> queue) {
        return queue.remove();
    }

    private static Integer first(Queue<Integer> queue) {
        return queue.element();
    }

}
