package com.javaCourse.collections;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsDemo {
    public static void main(String[] args) {
        //setExample();

        //listExample();

        //queueExample();

        mapExample();
    }

    public static void setExample() {
        String [] stringArr = {"hi", "test"};

        Set<String> stringSet = new HashSet<>();
        stringSet.add("hi");
        stringSet.add("test");

        stringSet.size();
        if (!stringSet.isEmpty()) {
            System.out.println("Set is not empty...");
        }

        //Iterating using for each.
        for (String str : stringSet) {
            System.out.println(str);
        }

        //iterating using iterator with while loop.
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void listExample() {
        // Lists

        List<String> listOfString = new ArrayList<>();
        listOfString.add("Hello String");
        listOfString.add("Hello String test");
        listOfString.add(0, "Elementi i 3-te");

        System.out.println(listOfString.get(0));
        System.out.println(listOfString.get(1));
        System.out.println(listOfString.size());
        listOfString.add("test");
        System.out.println(listOfString.size());
        listOfString.remove("test");
        System.out.println(listOfString.size());
        List<String> list2 = List.of("plus", "minus");
        listOfString.addAll(list2);

        /*
        //Iterating using for each.
        for (String str : listOfString) {
            System.out.println(str);
        }*/

        listOfString = listOfString.stream()
                .filter(str -> str.length() > 4)
                .collect(Collectors.toList());

        listOfString.forEach(System.out::println);

        Collections.sort(listOfString);
    }

    public static void queueExample() {
        Queue<Integer> intQueue = new LinkedList<>();
        intQueue.add(1);
        intQueue.add(2);

        System.out.println(intQueue.remove());
        intQueue.add(10);
        System.out.println(intQueue.element());

        intQueue.add(100);
        intQueue.offer(55);
        for (Integer i : intQueue) {
            System.out.println(i);
        }
    }

    public static void mapExample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(123, "Filani");
        map.put(223, "Fistek");
        map.put(224, "Fistek 2");
        map.put(2256, "Filani");

        System.out.println(map.get(224));

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //map.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println(map.getOrDefault(3213123, "nuk ka element!"));

        map.remove(224);
    }
}
