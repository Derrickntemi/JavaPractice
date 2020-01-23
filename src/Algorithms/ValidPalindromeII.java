package Algorithms;



public class ValidPalindromeII {
    private static boolean validPalindrome(char [] s,int left,int right,int count){
        if(count > 1) return false;
        while(left < right){
            if(s[left] == s[right]){
                left++;
                right--;
            }
            else {
                return (validPalindrome(s,left+1,right,count+1) || validPalindrome(s,left,--right,count+1));

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbac";
        int left = 0;
        int right = s.length()-1;
        int count = 0;
        System.out.println(ValidPalindromeII.validPalindrome(s.toCharArray(),left,right,count));
    }
}
