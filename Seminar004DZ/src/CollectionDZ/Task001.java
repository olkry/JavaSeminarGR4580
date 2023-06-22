package CollectionDZ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task001 { //Модернезировали код, добавив реверс "REVERS"
    private static LinkedList<String> list = new LinkedList<>();

    private static String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg + " -> ");
        return in.nextLine();
    }

    public static void run() {
        boolean getIteration = true;
        while (getIteration) {
            String command = prompt("Введите команду");
            String[] cLine = command.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "LIST": 
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                    break;
                case "REVERS": //Добавили реверс
                    while (list.size() > 0) { // зациклим метод удаления и возвращения первого элемента пока в списки есть данные.
                        System.out.println(list.pollLast());
                    }
                    break;
                default:
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine, list);
                        } else {
                            list.addFirst(cLine[0]);
                        }
                    } else {
                        list.addFirst(cLine[0]);
                    }

                    break;
            }
        }
    }

    private static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static List<String> adder(String[] splited, List<String> list) {
        if (isInt(splited[1])) {
            int num = Integer.parseInt(splited[1]);
            if (num > list.size()) {
                for (int i = list.size() - 1; i < num + 1; ++i) {
                    list.add(" ");
                }
            }
            list.add(num, splited[0]);
        }
        return list;
    }
}
