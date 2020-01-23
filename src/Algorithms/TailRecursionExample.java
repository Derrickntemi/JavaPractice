package Algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TailRecursionExample {
    private static int factorial(int input,int fact){

        if(input == 1){
            return fact;
        }
        else{
            fact *=input;
            return factorial(input-1,fact);
        }
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String no = br.readLine();
        int fact=1;
        int input = Integer.parseInt(no);

        System.out.println(TailRecursionExample.factorial(input,fact));

    }
}
