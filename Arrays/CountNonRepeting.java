package Arrays;
public class CountNonRepeting {
    public int firstNonrepeting(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]&&i!=j){
                    found=true;
                    break;
                }
            }
            if(!found){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
    int arr[]={-1,2,-1,5,2,3,2,4,4};
    CountNonRepeting obj=new CountNonRepeting();
    int result=obj.firstNonrepeting(arr);
    System.out.println(result);
    }
    
}
