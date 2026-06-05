package Arrays;

public class Kadane{
    public static void kadanesalgo(int nums[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            if(currsum<0){
                currsum=0;
            }
            if(currsum>max){
                max=currsum;
            }
        }
        System.out.println("maximum of sub array: "+ max);
    }
    public static void main(String[] args) {
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        kadanesalgo(nums);
    }
    
}
