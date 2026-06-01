package Numbers;

public class product {
    public int multiply(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        product obj=new product();
        int ans =obj.multiply(3,5);
        System.out.println(ans);

    }
    
}
