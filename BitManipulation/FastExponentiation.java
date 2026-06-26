package BitManipulation;

public class FastExponentiation {
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){//we are taking power as binary
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=5;
        int b=3;//5 power 3
        System.out.println(fastExpo(a, b));
    }
    
}
