package com.ngocvm.example.Day74.SortedMap;

import java.util.*;

public class SortedMapTest {
    public static void main(String[] args) {
        SortedMap mapDomains = new TreeMap<>();
        mapDomains.put(".com", "International");
        mapDomains.put(".us", "United States");
        mapDomains.put(".uk", "United Kingdom");
        mapDomains.put(".jp", "Japan");
        mapDomains.put(".au", "Australia");
        mapDomains.put(".vn", "Viet Nam");
        System.out.println(mapDomains);

        SortedMap<Integer, String> mapHttpStatus = new TreeMap<>();
        mapHttpStatus.put(100, "Continue");
        mapHttpStatus.put(200, "OK");
        mapHttpStatus.put(300, "Multiple Choices");
        mapHttpStatus.put(400, "Bad Request");
        mapHttpStatus.put(401, "Unauthorized");
        mapHttpStatus.put(402, "Payment Required");
        mapHttpStatus.put(403, "Forbidden");
        mapHttpStatus.put(404, "Not Found");
        mapHttpStatus.put(500, "Internal Server Error");
        mapHttpStatus.put(501, "Not Implemented");
        mapHttpStatus.put(502, "Bad Gateway");

        System.out.println("All key-value pairs:");
        for (Integer code : mapHttpStatus.keySet()) {
            System.out.println(code + " -> " + mapHttpStatus.get(code));
        }
        System.out.println();

        Integer firstKey = mapHttpStatus.firstKey();
        String firstValue = mapHttpStatus.get(firstKey);
        System.out.println("First status: " + firstKey + " -> " + firstValue);

        System.out.println();
        Integer lastKey = mapHttpStatus.lastKey();
        String lastValue = mapHttpStatus.get(lastKey);
        System.out.println("Last status: " + lastKey + " -> " + lastValue);

        System.out.println();
        SortedMap<Integer, String> map4xxStatus = mapHttpStatus.subMap(400, 500);
        System.out.println("4xx Statuses: ");
        for (Integer code : map4xxStatus.keySet()) {
            System.out.println(code + " -> " + map4xxStatus.get(code));
        }

        System.out.println();
        SortedMap<Integer, String> mapUnder300Status = mapHttpStatus.headMap(300);
        System.out.println("Statuses < 300: ");
        for (Integer code : mapUnder300Status.keySet()) {
            System.out.println(code + " -> " + mapUnder300Status.get(code));
        }

        System.out.println();
        SortedMap<Integer, String> mapAbove500Status = mapHttpStatus.tailMap(500);
        System.out.println("Statuses >= 500: ");
        for (Integer code : mapAbove500Status.keySet()) {
            System.out.println(code + " -> " + mapAbove500Status.get(code));
        }

        Comparator comparator = mapHttpStatus.comparator();
        System.out.println("Sorted by natural ordering? " + (comparator==null));

        System.out.println();
        SortedMap<Integer, String> mapHttpStatusReverse = new TreeMap<>(new ReverseComparator());
        mapHttpStatusReverse.put(100, "Continue");
        mapHttpStatusReverse.put(200, "OK");
        mapHttpStatusReverse.put(300, "Multiple Choices");
        mapHttpStatusReverse.put(400, "Bad Request");
        mapHttpStatusReverse.put(401, "Unauthorized");
        mapHttpStatusReverse.put(402, "Payment Required");
        mapHttpStatusReverse.put(403, "Forbidden");
        mapHttpStatusReverse.put(404, "Not Found");
        mapHttpStatusReverse.put(500, "Internal Server Error");
        mapHttpStatusReverse.put(501, "Not Implemented");
        mapHttpStatusReverse.put(502, "Bad Gateway");

        System.out.println("All key-value pairs:");
        for (Integer code : mapHttpStatusReverse.keySet()) {
            System.out.println(code + " -> " + mapHttpStatusReverse.get(code));
        }
    }
}
