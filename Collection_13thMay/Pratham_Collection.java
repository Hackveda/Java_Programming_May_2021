package Akshara_Snigdha;

import java.util.*;  
class Pratham_Collection
{  
public static void main(String args[])
{  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
// list is variable of arraylist type
list.add("HackVeda");
list.add("Bhavesh");//Adding object in arraylist 
list.add("bradon");  
list.add("david");  
list.add("shiven");
list.add("1");
list.add("purvi");
list.add("amit");
list.add("");
System.out.println(list.size());

//Traversing list through Iterator 
// With the help of iterator you will iterate the list 
Iterator<String> itr=list.iterator(); //  iterate the element of list
// 
while(itr.hasNext()) // is there any element left in list
{  
System.out.println(itr.next()); // return next element in iteration 
}  
}  
} 