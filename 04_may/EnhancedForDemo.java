package Class_object;

class EnhancedForDemo 
{
    public static void main(String[] args)
    {
         int[] numbers = {1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15};
         // number is an array of integer
         for (int item : numbers) 
         {
             System.out.println("Count is: " + item);
         }
         for (int i = 0;i<15;i++)
         {
        	 System.out.print("\n element : "+ (i+1));
         }
    }
}