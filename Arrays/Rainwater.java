package Arrays;
//Trapping Rain water
public class Rainwater {
    public static int volume(int nums[]){
        int n=nums.length;
        int left_max[]=new int[n];
        int right_max[]=new int[n];
        left_max[0]=nums[0];
        right_max[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(left_max[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],nums[i]);
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.print(left_max[i]+" ");   
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(right_max[i]+" ");  
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int min=Math.min(left_max[i],right_max[i]);
            sum+= (min-nums[i])*1;//width=1
        }
        return sum;
    }
    public static void main(String[] args) {
        int bars[]={4,2,0,6,3,2,5};
        int ans=volume(bars);
        System.out.println("Volume of trapped water: "+ans);
    }
}
