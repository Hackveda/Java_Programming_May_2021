package polymorphism_example;

class Example1
{
	  
    // Method with 2 parameter
    static int Multiply(int a, int b)
    {
        return a * b;
    }
  
    // Method with the same name but 3 parameter
    static double Multiply(double a, double b)
    {
        return (a * b);
    }
}