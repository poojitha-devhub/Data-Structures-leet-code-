package Strings;
// You are given an integer n.

// Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.

// Let sum be the sum of digits in x.

// Return an integer representing the value of x * sum.
class Concatenatenonzero {
    public long sumAndMultiply(int n) {
        StringBuilder s=new StringBuilder();
        String num=Integer.toString(n);
        long sum=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)!='0'){
                char c=num.charAt(i);
                s.append(c);
            }
        }
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'0';
            sum+=a;
        }
        long x=Long.parseLong(s.toString());
        long ans=x*sum;
        return ans;     
    }
    public static void main(String args[]){
        int n = 10203004;
        Concatenatenonzero obj=new Concatenatenonzero();
        long result=obj.sumAndMultiply(n);
        System.out.println(result);


    }
}