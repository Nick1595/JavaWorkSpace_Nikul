package assignmentJava_coreJava;

class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student
{
	
	int roll;
	String name;
	int age;
	String course;
	
	Student(int roll, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
	{
	
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.course = course;
		
		
			
			 if (age < 15 || age > 21) {
		            throw new AgeNotWithinRangeException("Age is not within the valid range of 15 to 21.");
		        }
		        if (!name.matches("[a-zA-Z]+")) {
		            throw new NameNotValidException("Name contains invalid characters.");
		        }
			
	}
	
	 public int getRollNo()
	 {
	        return roll;
	 }

	 public String getName() 
	 {
	        return name;
	 }

	 public int getAge() 
	 {
	        return age;
	 }

	 public String getCourse() 
	 {
	        return course;
	 }
	
}

public class Q_41 {
	
	public static void main(String[] args) {
		
        try {
            
            Student student = new Student(101, "Nikul", 14, "java");
            
    		System.out.println("Roll No: " + student.getRollNo());
    		System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
            
            
            Student studentWithInvalidAge = new Student(102, "Nikul", 22, "html");
        }
        catch (AgeNotWithinRangeException | NameNotValidException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            Student studentWithInvalidName = new Student(103, "Miral11", 19, "css");
        } 
        catch (AgeNotWithinRangeException | NameNotValidException e) 
        {
        	
            System.out.println(e.getMessage());
        }
		
	}

}
