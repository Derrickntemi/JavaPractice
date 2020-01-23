package Algorithms;

public class LongestPalindromeSubString {
        public static String longestPalindrome(String s) {
            int start=0,end = 0;
            int length = s.length();

            for(int i = 0;i<length;i++){
                int length1 = mirrorStringFromCentre(i,i,s);
                int length2 = mirrorStringFromCentre(i,i+1,s);

                int lengthMax = Math.max(length1,length2);

                if(lengthMax > end -start){
                    start = i - ((lengthMax - 1)/2);
                    end = i+(lengthMax/2);
                }

            }
            return s.substring(start,end+1);

        }

        private static int mirrorStringFromCentre(int left,int right,String s){
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            return right -left -1;
        }

    public static void main(String[] args) {
        String input = "cabbad";
        System.out.println(LongestPalindromeSubString.longestPalindrome(input));
    }
}

