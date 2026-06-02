package Numbers;
//reverse inverted pyramid
public class Pattern6 {
    public static void rev_pyramid(int rows,int cols){
        for (int i=1;i<=rows;i++){
            //spaces
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows=5;
        int cols=5;
        rev_pyramid(rows, cols);
    }
    
}
