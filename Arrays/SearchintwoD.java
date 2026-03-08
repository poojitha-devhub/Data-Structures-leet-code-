package Arrays;
import java.util.*;
public class SearchintwoD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] numbers=new int[rows][cols];
        //input
        for(int i=0;i<rows;i++){//rows
            for(int j=0;j<cols;j++){//cols
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){//rows
            for(int j=0;j<cols;j++){//cols
                if(numbers[i][j]==5)
                System.out.print(i+" "+j);;
            }
            
        }

    }
    
}

    

