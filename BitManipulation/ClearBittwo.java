package BitManipulation;

public class ClearBittwo {
    //clear bit operation 1:do bit mask 1<<positin
    //operation 2:and and not
    //perform not on the bit mask
    //perform and on ~(bitmask)&number
    public static void main(String[] args) {
        int n=6;//110
        int pos=1;
        int bitmask=1<<pos;
        System.out.println(~(bitmask)&n);
    }
    
}
