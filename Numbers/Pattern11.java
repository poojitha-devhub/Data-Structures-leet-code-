package Numbers;
// Solid Rhombus
public class Pattern11 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
