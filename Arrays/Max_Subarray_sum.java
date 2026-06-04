package Arrays;

public class Max_Subarray_sum {
    public static int maxsubarr_sum(int numbers[]){
        int n=numbers.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=numbers[k];
                }
                System.out.println(sum);
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int ans=maxsubarr_sum(arr);
        System.out.println(ans);

    }
    
}
