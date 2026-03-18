package Arrays;

public class BubbleSort {
    public static void main(String args[]){
        //bubble sort
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                //after 1 iterstion last element is already in place there is n need to check
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);    
        }
    }
    
}
