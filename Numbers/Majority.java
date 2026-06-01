package Numbers;

public class Majority {
    public static int majorityElement(int[] arr){
        int n=arr.length;
        int freq=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(freq==0){
                ans=arr[i];
            }
            if(ans==arr[i]){
                freq++;
            }
            else{
                freq--;
            }
            if(freq>(n/2)){
                return ans;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,13};
        int result=majorityElement(nums);
        System.out.println(result);
    }

    
}
