package Arrays;

public class largest {
    public static int largestnum(int numbers[]){
        int largest=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,1,4,6,9};
        int ans=largestnum(numbers);
        System.out.println(ans);

    }
    
}
