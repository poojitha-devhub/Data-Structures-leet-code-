package Numbers;

import java.util.LinkedList;

public class sortedPairSum {
    public static LinkedList pairSum(int arr[],int target){
        LinkedList<Integer> list=new LinkedList<>();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
            else{
                list.add(i);
                list.add(j);
                return list;//returning here also braks the loop
            }
        }
        return list;//incase of no target is matched
    }
    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        int target=9;
        LinkedList<Integer> list1=new LinkedList<>();
        list1=pairSum(arr,target);
        System.out.println(list1);    
    }
}
