package Strings;

public class SubString {
    public static void main(String[] args) {
        String str="Hello World";
        String substr=str.substring(0,5);
        System.out.println("using substring function : "+substr);
        String substr2="";
        for(int i=0;i<5;i++){
            substr2+=str.charAt(i);
        }
        System.out.println("using for loop : "+substr2);
    }
    
}
