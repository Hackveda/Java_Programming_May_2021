package Collection;

public class RandomNumberExample2 
{  
public static void main( String args[] )   
{  
int min = 200; // 200 * 0.50 
int max = 400;  
//Generate random double value from 200 to 400   
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
int a = (int)(Math.random()*(max-min+1)+min);   
System.out.println(a);  
//Generate random int value from 200 to 400   
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
}  
} 