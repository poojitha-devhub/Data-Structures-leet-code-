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
        List.addLast("Practice");
        List.addLast("from");
        List.addLast("Apna");
        List.addLast("College");

        System.out.println(List);
        System.out.println(List.size());
        //iteration print
        for(int i=0;i<List.size();i++){

            System.out.print(List.get(i)+"--> ");//list.get(i) gets element at index i
        }
        System.out.println("null");
        System.out.println(List);
        //search
        for(int j=0;j<List.size();j++){
            if(List.get(j)=="is"){
                System.out.println("index:"+j);
            }
        }
        List.removeFirst();//removes first
        System.out.println(List);
        List.removeLast();//removes last
        System.out.println(List);
        List.remove(3);//removes data at index 3
        System.out.println(List);



    }
    
}
