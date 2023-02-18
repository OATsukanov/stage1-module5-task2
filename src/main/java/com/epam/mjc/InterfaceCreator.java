package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        return list -> {

            List<Integer> dividedIntegerList = new ArrayList<>();

            for (int element : list) {

                dividedIntegerList.add(element/divider);
            }

            return dividedIntegerList;
        };
    }
}
