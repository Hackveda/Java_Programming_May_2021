package polymorphism_example;

class Test
{  
public static void main(String[] args)
{  
Bank b = new SBI(); 
//Bank b = new Bank();
Bank p = new PNB();
//b.rateOfInteres();
System.out.println("ROI: "+b.rateOfInterest());  
System.out.println("ROI: "+p.rateOfInterest()); 
}}