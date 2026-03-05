package Numbers;
import java.util.*;
public class Abundantnum {
    //abundant num is a number that the sum of proper divisors is greater than the number
    //abundance is total sum-number
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter num:");
        int num =sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.println(num+" is abundance num");
            System.out.println("abundace is :"+(sum-num));
        }
        else{
            System.out.println("not an abundance number");
        }
        
    }
    
}
