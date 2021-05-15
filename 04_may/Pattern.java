package Class_object;

import java.util.*;
import java.util.Scanner;
public class Pattern
{
    public static void main(String args[])
    {  
        // accepting input from user
    	Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the height : ");
        // height is integer type that is why i used nextInt
        int height= sc.nextInt(); 

            for(int i = 1 ; i <= height ; i++ ) 
            {
                for(int j = 1; j <= i; j++) 
                {
                    System.out.print("B");
                 }
                System.out.println("");
            }
      }
}