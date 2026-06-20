package Strings;

public class shortestPath {
    public static float getShortestPath(String path){
        int n=path.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)(Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        String path="WESSNNNEE";
        float ans=getShortestPath(path);
        System.out.println("the shortest path is : "+ ans);

    }
    
}
