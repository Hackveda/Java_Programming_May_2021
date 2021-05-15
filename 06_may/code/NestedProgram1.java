package Class_object;

public class NestedProgram1 
{
	public static void main(String args[])
	{
		int i=1,j=1;
		    while(i<=10)
		    {
		        while(j<=i)
		        {
		        System.out.print("*");
		            j++;        
		        }
		        i++;
		        System.out.println("");
		        j=1;
		    }
		}
}


