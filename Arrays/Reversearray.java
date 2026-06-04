package Arrays;

public class Reversearray {
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,11};
        int f=0;
        int l=numbers.length-1;
        while(f<l){
            int temp=numbers[f];
            numbers[f]=numbers[l];
            numbers[l]=temp;
            f++;
            l--;
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    
}
