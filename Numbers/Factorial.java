package Numbers;
import java.util.*;
public class Factorial {
    public static int factorialnum(int n){
        int fact=1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter n =");
        int n=sc.nextInt();
        Factorial obj=new Factorial();
        int result=obj.factorialnum(n);
        System.out.println(result);

    }
    
}
