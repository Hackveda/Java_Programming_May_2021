package Class_object;
public class NestedWhile
{
	public static void main(String args[])
	{
		int i=1,j=1;
		    while(i<=10)
		    {
		        while(j<=10)
		        {
		        System.out.print(j);
		            j++;        
		        }
		        i++;
		        System.out.println("");
		        j=1;
		    }
	}
		
}


