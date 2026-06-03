public class Pattern14 {
    //Palindromic pattern with numbers
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            //descending
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
