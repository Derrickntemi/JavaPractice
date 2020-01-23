package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeriesWithMemoization {
    private static int fibonacciSeries(int input){
        Map<Integer,Integer> fibMap = new HashMap<>();
        if(input < 2){
            return input;
        }
        else{
            if(fibMap.containsKey(input)){
                return fibMap.get(input);
            }
            else {
                int fib = fibonacciSeries(input-1) + fibonacciSeries(input-2);
                fibMap.put(input,fib);
            }

        }
        return fibMap.get(input);
    }

    public static void main(String[] args) {
        for(int i =0;i<=20;i++){
            System.out.println(FibonacciSeriesWithMemoization.fibonacciSeries(i));
        }
    }
}
