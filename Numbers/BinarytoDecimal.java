package Numbers;

public class BinarytoDecimal {
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastdigit=binNum%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("binary : " + myNum + " to " + "decimal : " + decNum);
    }
    public static void main(String[] args) {
        int binary=1001011;
        binToDec(binary);
    }
    
}
