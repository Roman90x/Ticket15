import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача из билета 15");
/**
 * Необходимо реализовать следующий метод:
 * Получаем на входе массив чисел.
 * Все четные числа увеличиваем на единицу.
 * Возвращаем кусок списка с 3-го по 7-й элемент.
 */
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        IntStream.range(0, 10)
                .forEach(index -> array[index] = random.nextInt(100));
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] newArray = Arrays
                .copyOfRange(array, 2, 7);
        System.out.println(Arrays.toString(newArray));
    }
}