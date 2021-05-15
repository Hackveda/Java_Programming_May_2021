package Akshara_Snigdha;

import java.util.*;  
public class Linkedlistdemo
{  
public static void main(String args[])
{  
LinkedList<String> al=new LinkedList<String>();  
al.add("A");  
al.add("D");  
al.add("W");  
al.add("P"); 
al.remove(3);
System.out.println(al.size());
Iterator<String> itr=al.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next()); 
}  
}  
}  
