package Maths;
import java.util.*;
public class Roundoff 
{
	public static void main(String[] args)
	{
		  int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
		  // always write logic in parenthesis circular bracket
		  int percentage_of_marks = ((tot_theory_marks + tot_practical_marks)*100)/tot_marks;  
		    System.out.print("\nPercentage of Marks: "+percentage_of_marks+"%\n");
    }
}