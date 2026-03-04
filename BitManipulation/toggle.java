package BitManipulation;
public class toggle {
    public static int toggleBits(int n){
        int k=(int)((Math.log(n)/Math.log(2)))+1;//lag(10) to the base 2 gives 3.32 and int gives 3 and +1 gives 4 digits
        //k is the num of digits
        int mask=(1<<k)-1;//mask 1=>00001,left shift of(1<<k) gives =>10000 and sub 1 gives 1111
        return n^mask;//xor function

    }

    public static void main(String args[]){
        int n=10;
        int result=toggleBits(n);
        System.out.println(result);
    }
    
}
