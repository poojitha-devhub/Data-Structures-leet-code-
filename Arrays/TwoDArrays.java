package Arrays;
import java.util.*;

//2=D arrays are the matrix.It has rows and columns(row,column)
// type[][] arrayname=new type[row][column]

public class TwoDArrays {
    public static void largest(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                } 
            }
        }
        System.out.println("largest number in matrix: "+ max);
    }
    public static void smallest(int matrix[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                } 
            }
        }
        System.out.println("smallest number in matrix: "+ min);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter cols: ");
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
                System.out.print(numbers[i][j]+" ");;
            }
            System.out.println();
        }
        largest(numbers);
        smallest(numbers);

    }
    
}
