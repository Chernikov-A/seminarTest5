package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Homework {
    public int sum(List<Integer> ints){
        int sum = 0;
        for (int i = 0; i<ints.size(); i++){
            sum += ints.get(i);
        }
        if (ints.size() == 0){
            return 0;
        }
        return sum;
    }

    public boolean hasExactly(List<String> items, String item){
        boolean empty = false;
        for(String t : items){
            if (t != null){
                empty = true;
                break;
            }

        }
        for (String i : items){
            if (Objects.equals(i, item)){
                System.out.println("Совпадают");
            }else {
                System.out.println("несовпадают");
            }
        }
        return empty;
    }
}
