package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkTest {
    @Test
    void TheListIsEmpty() {
        //Список пустой (тогда возвращаем 0)
        Homework homework = new Homework();
        List<Integer> ints = new ArrayList<>();

        int actual = homework.sum(ints);
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void TheListIsNotEmpty(){
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        Homework homework = new Homework();
        int actual = homework.sum(ints);
        int expected = 3;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void MatchesItemsTest(){
        Homework homework = new Homework();
        List<String>list = new ArrayList<>();
        list.add(String.valueOf(1));

        boolean a = homework.hasExactly(list, String.valueOf(1));
        boolean b = true;
        Assertions.assertEquals(b,a);
    }

    @Test
    void NotMatchesItemsTest(){
        Homework homework = new Homework();
        List<String>list = new ArrayList<>();
        list.add(String.valueOf(3));

        boolean actual = homework.hasExactly(list,String.valueOf(1));
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void SeveralElementsCoincideWithOne(){
        Homework homework =new Homework();
        List<String>list = new ArrayList<>();
        list.add(String.valueOf(1));
        list.add(String.valueOf(2));
        list.add(String.valueOf(3));

        boolean actual = homework.hasExactly(list,String.valueOf(2));
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }

}
