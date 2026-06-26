package BitManipulation;

public class AddingOne {
    public static void main(String[] args) {
        int bit=1;
        int n=16;
        int i=0;
        while(bit!=0){
            int bitmask=(1<<i);
            bit=(n&bitmask);
            if(bit == 1 || bit==0){
                n=n^bitmask;
            }
            i++;
        }
        System.out.println(n);
    }
    
}
