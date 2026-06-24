package BitManipulation;

public class clearIBits {
    public static int clearInumBits(int n,int i){
        int bitMask=((~0)<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n=15;
        int i=3;
        int ans=clearInumBits(n, i);
        System.out.println(ans);

    }
    
}
