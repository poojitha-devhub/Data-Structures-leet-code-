package BitManipulation;

public class powerOfTwo {
    public static boolean isPowerTwo(int n){
        return ((n & (n-1))==0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerTwo(8));
        System.out.println(isPowerTwo(5));
        System.out.println(isPowerTwo(16));
    }
    
}
