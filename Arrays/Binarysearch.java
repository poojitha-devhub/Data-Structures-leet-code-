package Arrays;

public class Binarysearch {
    public static int binary(int[] numbers,int key){
        int i=0;
        int j=numbers.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]>key){
                j=mid-1;
            }
            else if(numbers[mid]<key){
                i=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={2,5,6,7,8,9};
        int key=2;
        int ans=binary(numbers, key);
        System.out.println(ans);
    } 
  
}
