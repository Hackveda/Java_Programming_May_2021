package Programmer;

class Program extends Employee
{  
   int bonus=10000;  
 public static void main(String args[])
 {  
   // class_name object_name = new class_name()
   Program p=new Program();// p is object  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}
