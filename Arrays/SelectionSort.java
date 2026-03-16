package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //selection sort
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
    
}
