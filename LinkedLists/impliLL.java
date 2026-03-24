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

    }
    
}
