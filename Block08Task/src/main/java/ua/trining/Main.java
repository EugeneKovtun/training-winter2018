package ua.trining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 34, 4, 4, 4, 4, 4, 42, 2, 2};
        System.out.println(amountOfRepeating(Arrays.asList(array)));
        MyCollection<Integer> integerMyCollection = new MyCollection<>();
        integerMyCollection.add(5);
        integerMyCollection.remove(0);//nothing happening 
        integerMyCollection.remove(new Integer(5));//nothing happening

    }

    public static Map<Integer, Integer> amountOfRepeating(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();

        for (Integer i : list) {
            result.putIfAbsent(i, 0);
            result.put(i, result.get(i) + 1);
        }
        return result;
    }
}
