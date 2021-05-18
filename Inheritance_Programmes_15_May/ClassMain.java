package Programmer;
// Example of Multilevel Inheritance
class D
{
    String s = "Class D";
}
 
class E extends D
{
    String s = "Class E";
 
    {
        System.out.println(super.s);
    }
}
 
class F extends E
{
    String s = "Class F";
 
    {
        System.out.println(super.s);
    }
}
 
public class ClassMain
{
    public static void main(String[] args)
    {
        F v = new F();
 
        System.out.println(v.s);
    }
}