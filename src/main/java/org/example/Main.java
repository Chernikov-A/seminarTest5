package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        Homework homework = new Homework();
//        int sum = homework.sum(list);
//        System.out.println(sum);


        Homework homework = new Homework();
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(1));
        boolean sum = homework.hasExactly(list, String.valueOf(1));
        System.out.println(sum);
    }
}