package Arrays;

public class prefix {
    public static int prefix_sum(int arr[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        //calculate prefix
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                if(start==0){
                    currsum=prefix[end];
                }
                else{
                    currsum=prefix[end]-prefix[start-1];
                }
                if(currsum>max){
                    max=currsum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int ans=prefix_sum(arr);
        System.out.println("max prefix sum: "+ans);
    }
    
}
