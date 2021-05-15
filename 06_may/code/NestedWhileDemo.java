package Class_object;

class NestedWhileDemo
{
public static void main(String args[])
{
int i=1;
    while(i<=3) // Outer loop 
    {
        System.out.println("\n"+i+" "+"outer loop executed only once\n");
        int j=1;
        while(j<=4) // inner loop 
        {
        System.out.println(j+" "+"inner loop executed until to completion");
            j++;        
        }
        i++;

    }
}
}