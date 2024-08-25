package task1;
//Задание 1 :Сгенерировать список из 500 целочисленных элементов
//Достаточно создать объект Random random = new Random();
//И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);
//Имея данный список и знания полученный об интерфейсе Set ,
//вывести в консоль:
// 1)отсортированный набор уникальных элементов
// 2)набор только уникальных элементов

import java.util.*;

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