package BitManipulation;

public class Swapping {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        //swapping
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
