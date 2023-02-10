package com.careerit.jfs.basics.day14;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1005);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("using foreach");
        for(Integer ele:list){
            System.out.println(ele);
        }
        list.remove(Integer.valueOf(1001));
        System.out.println(list);
        System.out.println(list.contains(1005));
        List<Integer> anotherlist=List.of(1,4,6);
        list.addAll(anotherlist);
        System.out.println(list);
        System.out.println(list.containsAll(anotherlist));
    }
}
