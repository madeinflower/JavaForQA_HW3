package task2;

import java.util.*;

//Задание 2:
//Взять две строки случайных символов ,длина каждой строки от 20 до 50 символов.
//Вывести в консоль список символов которые встречаются только один раз на все две строки.
public class Main {
    public static void main(String[] args) {
        // Генерация списка из 500 случайных целых чисел от 0 до 9
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(10);  // Случайное число от 0 до 9
            randomNumbers.add(element);
        }

        // Используем TreeSet для получения отсортированного набора уникальных элементов
        Set<Integer> sortedUniqueNumbers = new TreeSet<>(randomNumbers);
        System.out.println("Отсортированный набор уникальных элементов: " + sortedUniqueNumbers);

        // Используем HashSet для получения набора только уникальных элементов
        Set<Integer> uniqueNumbers = new HashSet<>(randomNumbers);
        System.out.println("Набор только уникальных элементов: " + uniqueNumbers);
    }
}
