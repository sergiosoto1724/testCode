package org.exercise;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int [] nums = {1,1,5,3,6,2,8,7,4,7,5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        Integer[] result = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(result));

    }

}
