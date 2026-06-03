package Arrays;

public class smallest {
    public static int smallestNum(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={2,6,7,8,1,0,9,-2,-3};
        int ans=smallestNum(numbers);
        System.out.println(ans);
    }
    
}
