package BitManipulation;

public class clearRangeBits {
    public static int clearIToJBits(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n=57;
        int i=2;
        int j=7;
        int ans=clearIToJBits(n, i, j);
        System.out.println(ans);

    }
    
}
