package Numbers;

public class primeornot {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        boolean prime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                prime=false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(5));
    
        
    }
    
}
