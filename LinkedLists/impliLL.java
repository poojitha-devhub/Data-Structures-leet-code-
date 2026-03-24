package LinkedLists;
import java.util.*;

public class impliLL {
    public static void main(String[] args) {
        LinkedList<String> List=new LinkedList<>();
        List.addFirst("a");
        List.addFirst("is");
        System.out.println(List);
        List.add("Linked");//adds last
        List.addLast("List");

        System.out.println(List);
        System.out.println(List.size());
        //iteration print
        for(int i=0;i<List.size();i++){

            System.out.print(List.get(i)+"--> ");//list.get(i) gets element at index i
        }
        System.out.println("null");
        //search
        for(int j=0;j<List.size();j++){
            if(List.get(j)=="is"){
                System.out.println("index"+j);
            }
        }


    }
    
}
