package Arrays;

public class Diagnol {
    public static void diagnolSum(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        //left
        int j=0;
        int leftsum=0;
        for(int i=0;i<n;i++){
            if(i==j){
                leftsum+=matrix[i][j];
            }
            j++;
        }
        //right
        int s=m-1;
        int rightsum=0;
        int p=0;
        while(s>=0){
            rightsum+=matrix[p][s];
            s--;
            p++;
        }
        System.out.println("my version of diagnol sum");
        System.out.println("left sum: "+ leftsum);
        System.out.println("right sum: "+ rightsum);
        System.out.println("total sum: " + (leftsum+rightsum));

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagnolSum(matrix);
    }
    
}
