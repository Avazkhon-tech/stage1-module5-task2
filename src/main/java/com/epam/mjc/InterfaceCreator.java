package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        return list -> {
            List<Integer> dividedList = new LinkedList<>();
            for (Integer i : list) {
                dividedList.add(i / divider);
            }
            return dividedList;
        };
    }
}
