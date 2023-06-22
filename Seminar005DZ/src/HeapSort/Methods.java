package HeapSort;

public class Methods {

      public static void piramidSort(int[] arrey) {
            // Построение кучи, перегруппируем массив
            for (int i = arrey.length / 2 - 1; i >= 0; i--)
                  hiapFy(arrey, arrey.length, i);

            // Один за другим извлекаем элементы из кучи
            for (int i = arrey.length - 1; i >= 0; i--) {
                  // Перемещаем текущий корень в конец
                  int temp = arrey[0];
                  arrey[0] = arrey[i];
                  arrey[i] = temp;

                  hiapFy(arrey, i, 0);
            }

      }

      private static void hiapFy(int[] arrey, int heapSize, int rootIndex) {
            int largest = rootIndex; // Инициализируем больший элемент как корень
            int leftChild = 2 * rootIndex + 1;
            int rightChild = 2 * rootIndex + 2;

            // Если левый дочерний больше корня
            if (leftChild < heapSize && arrey[leftChild] > arrey[largest]) {
                  largest = leftChild;
            }
            // Если правый дочерний больше чем самый большой на данный момент
            if (rightChild < heapSize && arrey[rightChild] > arrey[largest]) {
                  largest = rightChild;
            }
            // Если самы большой элемент не корень
            if (largest != rootIndex) {
                  int temp = arrey[rootIndex];
                  arrey[rootIndex] = arrey[largest];
                  arrey[largest] = temp;

                  hiapFy(arrey, heapSize, largest);
            }

      }

      public static void printArray(int[] array) {
            for (int num : array) {
                  System.out.print(num + " ");
            }
            System.out.println();
      }

}
