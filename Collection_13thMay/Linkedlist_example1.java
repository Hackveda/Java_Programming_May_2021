package Akshara_Snigdha;

import java.util.*;
public class Linkedlist_example1
{
   public static void main(String args[])
   {

      LinkedList<String> list=new LinkedList<String>();

      //Adding elements to the Linked list
      list.add("Steve");
      list.add("Carl");
      list.add("Raj");
      list.add("Negan");
      list.add("Rick");

      //Removing First element
      //Same as list.remove(0);
      list.removeFirst();

      //Removing Last element
      list.removeLast();

      //Iterating LinkedList
      Iterator<String> iterator=list.iterator();
      while(iterator.hasNext())
      {
         System.out.print(iterator.next()+" ");
      }
      System.out.print("\nAfter removing second element: ");
      //Iterating LinkedList again
      
   }
}