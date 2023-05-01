package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Стартуем программу");
        logger.log("Просим ввести данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int listLength = scanner.nextInt();
        System.out.println("Введите верхнюю границу значений");
        int topBorder = scanner.nextInt();
        logger.log("Создаем и заполняем список");
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            source.add(random.nextInt(topBorder));
        }
        System.out.println(source.toString());
        logger.log("Просим ввести данные для фильтрации");
        System.out.println("Введите число для фильтрации списка");
        Filter filter = new Filter(scanner.nextInt());
        logger.log("Запускаем фильтрацию");
        List<Integer> answer = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.println(answer.toString());
        logger.log("Завершаем программу");
    }
}