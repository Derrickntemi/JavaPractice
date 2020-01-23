package Algorithms;

import java.util.*;
import java.util.stream.Stream;

public class ValidArrayPairs {

    private static Integer getValidPairs(Integer[] A) {
        Map<Integer, Integer> evalMap = new HashMap<>();
        Set<Integer[]> resultSet = new HashSet<>();
        int i = 0;
            for (Integer arrayItem : A) {
                if (evalMap.containsKey(arrayItem)) {
                    if (evalMap.get(arrayItem) < i) {
                        System.out.println("(" + arrayItem + "," + arrayItem + ")");
                        Integer[] pair = new Integer[]{arrayItem, arrayItem};
                        resultSet.add(pair);
                    }
                }
                evalMap.put(arrayItem, i);
                i++;
            }
        return resultSet.size();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Stream<Integer> boxed = random.ints(1000000,1,11).boxed();
        Integer [] testArray = boxed.toArray(Integer[]::new);
        long startTime = System.currentTimeMillis();
        System.out.println(ValidArrayPairs.getValidPairs(testArray));
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken to exceute a result set of size: "+testArray.length+" is: "+timeTaken+" milliseconds");
    }
}
