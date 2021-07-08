package ds.linkedList.concepts;

import java.util.ArrayList;
public class _JavaArrayList {
 public static void main(String[] args) {
     ArrayList<Object> list = new ArrayList<>();
     list.add("Gautam");
     list.add("Raj");
     list.add("Sonu");
     list.removeIf( x -> x.equals("Sonu"));
     System.out.println(list);
 }   
}