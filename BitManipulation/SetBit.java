package BitManipulation;
public class SetBit {
    //Set bit sets the number to 1 in a certain position
    //set the 2nd postion(position=1) in a number n(n=0101)
    //first step:do bit mask=1<<i
    //Second step:use the 'or' operator
    public static void main(String[] args) {
        int n=5;//0101
        int position=1;
        int mask=1<<position;
        int ans=n|mask;
        System.out.println(ans);
        
    }

    
}
