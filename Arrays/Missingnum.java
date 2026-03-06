package Arrays;
//268.Missing Number
//Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.
//Input: nums = [3,0,1]
//Output: 2
// Explanation:
// n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
// 2 is the missing number in the range since it does not appear in nums.
public class Missingnum {
    public int missingPositiveNumber(int nums[]){
        int n=nums.length;
        int expectedsum=(n*(n+1))/2;
        int actualsum=0;
        for(int i=0;i<n;i++){
            actualsum+=nums[i];
        }
        int missing=(expectedsum-actualsum);
        return missing;
    }
    public static void main(String args[]){
        int nums[]={0,1,3,4,5};
        Missingnum obj=new Missingnum();
        int result=obj.missingPositiveNumber(nums);
        System.out.println(result);


    }
    
}
