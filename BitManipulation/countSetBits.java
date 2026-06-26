package BitManipulation;

public class countSetBits {
    public static int setBits(int n){
        int bitmask=1;
        int count=0;
        while(n!=0){
            if((n & bitmask) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(setBits(10));
    }
    
}
