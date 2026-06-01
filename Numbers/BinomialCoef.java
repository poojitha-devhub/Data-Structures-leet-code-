package Numbers;

import java.util.Scanner;

public class BinomialCoef {
    public static int Factorialof(int num){
        int f=1;
        if (num==0 || num==1){
            return 1;
        }
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;

    }
    public static int Bincoeff(int n,int r){
        int a=Factorialof(n);
        int b=Factorialof(r);
        int c=Factorialof(n-r);
        return a/(b*c);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n= ");
        int n=sc.nextInt();
        System.out.println("Enter r= ");
        int r=sc.nextInt();
        int ans=Bincoeff(n, r);
        System.out.println(ans);
    }
    
}
