package Class_object;

public class Nested_loop
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= 7; j++) 
            {
                System.out.println("i value :: " + i + ", j value :: " + j);
            }
            System.out.println("-----------------------------");
        }
    }
}