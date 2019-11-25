package com.ngocvm.example.Day74.NavigableMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<Integer, String> mapHttpStatus = new TreeMap<>();
        mapHttpStatus.put(100, "Continue");
        mapHttpStatus.put(200, "OK");
        mapHttpStatus.put(400, "Bad Request");
        mapHttpStatus.put(401, "Unauthorized");
        mapHttpStatus.put(500, "Internal Server Error");
        mapHttpStatus.put(501, "Not Implemented");

        Set ascendingKeys = mapHttpStatus.keySet();
        System.out.println("Ascending Keys: " + ascendingKeys);
        Set descendingKeys = mapHttpStatus.descendingKeySet();
        System.out.println("Descending Keys: " + descendingKeys);

        NavigableMap<Integer, String> descendingMap = mapHttpStatus.descendingMap();
        for(Integer key : descendingMap.keySet()) {
            System.out.println(key + " -> " + descendingMap.get(key));
        }

        System.out.println();
        Integer lowerKey = mapHttpStatus.lowerKey(401);
        System.out.println("Lower key: " + lowerKey);
        Integer floorKey = mapHttpStatus.floorKey(401);
        System.out.println("Floor key: " + floorKey);
        Integer higherKey = mapHttpStatus.higherKey(500);
        System.out.println("Higher key: " + higherKey);
        Integer ceilingKey = mapHttpStatus.ceilingKey(500);
        System.out.println("Ceiling key: " + ceilingKey);

        System.out.println();
        Map.Entry firstEntry = mapHttpStatus.firstEntry();
        System.out.println("First entry: " + firstEntry.getKey() + " => " + firstEntry.getValue());
        Map.Entry lastEntry = mapHttpStatus.lastEntry();
        System.out.println("Last entry: " + lastEntry.getKey() + " => " + lastEntry.getValue());
        Map.Entry lowerEntry = mapHttpStatus.lowerEntry(401);
        System.out.println("Lower entry: " + lowerEntry.getKey() + " => " + lowerEntry.getValue());
        Map.Entry floorEntry = mapHttpStatus.floorEntry(401);
        System.out.println("Floor entry: " + floorEntry.getKey() + " => " + floorEntry.getValue());
        Map.Entry higherEntry = mapHttpStatus.higherEntry(500);
        System.out.println("Higher entry: " + higherEntry.getKey() + " => " + higherEntry.getValue());
        Map.Entry ceilingEntry = mapHttpStatus.ceilingEntry(500);
        System.out.println("Ceiling entry: " + ceilingEntry.getKey() + " => " + ceilingEntry.getValue());


        mapHttpStatus.pollFirstEntry();
        mapHttpStatus.pollLastEntry();

        System.out.println("\nMap after first and last entries were polled:");
        for (Integer key : mapHttpStatus.keySet()) {
            System.out.println(key + " => " + mapHttpStatus.get(key));
        }
    }
}
