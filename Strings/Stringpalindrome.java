package Strings;

public class Stringpalindrome {
    public static void main(String[] args) {
        String s="racecar";
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                System.out.println("Not a palindrome");
            }
        }
        System.out.println("palindrome");
    }
    
}
