package Algorithms;

public class ValidPalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x == 0) return true;
        return x == reverseInteger(x,0);
    }

    private static int reverseInteger(int x,int reversedNo) {
        if(x<1) return reversedNo;
        reversedNo = (reversedNo*10) + (x%10);
        return reverseInteger(x/10,reversedNo);
    }

    public static void main(String[] args) {
        System.out.println(ValidPalindromeNumber.isPalindrome(424));
    }
}
