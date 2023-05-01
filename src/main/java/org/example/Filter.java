package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();

        List<Integer> answer =
                source.stream()
                        .filter(value -> filt(value))
                        .collect(Collectors.toList());
        logger.log("Прошло фильтр " + answer.size() + " элементов из " + source.size());
        return answer;
    }

    public boolean filt(int a) {
        Logger logger = Logger.getInstance();
        if (a < treshold) {
            logger.log("Объект " + a + " не подходит");
        } else {
            logger.log("Объект " + a + " подходит");
        }
        return a >= treshold;
    }
}