package Class_object;

public class Demo
{      
	// data members 
	 String name;
	 int rollno;
	 int age;
	 
	public void info()
	{
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	
	
	public static void main(String[] args)
	{
		Demo student = new Demo();
		// class_name object_name = new class_name()
		// Accessing and property value
		student.name = "Bhavesh";
		student.rollno = 253;
		student.age = 21;
		
		// Calling method
		student.info();
		
	}
} 