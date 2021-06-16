package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(30);

        for (int i = 0; i < 30; i++) {
            Random randomInt = new Random();
            list.add(i, randomInt.nextInt(10));
        }
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {//до тех пор, пока в списке есть элементы

            Integer nextInt = iterator.next();//получаем следующий элемент

            if (nextInt <= 2) {
                iterator.remove();
            }
        }
        System.out.println(list);


        // ThreadLocalRandom.current().nextInt( 1, 10);


    }

}
