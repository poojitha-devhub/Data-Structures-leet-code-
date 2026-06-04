package Arrays;

public class subarray_sum {
    public static void printsum_Subarrays(int arr[]) {
        int total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+ " ");
                    sum+=arr[k];
                }
                total++;
                System.out.println();
                System.out.println("sum= "+sum);
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
            }
            System.out.println();
        }
        System.out.println("total sub arrays: "+total);   
        System.out.println("maximun: "+max);
        System.out.println("minimum: "+min); 
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printsum_Subarrays(arr);
    }
    
}
