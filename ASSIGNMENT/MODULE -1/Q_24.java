package assignmentJava_coreJava;

public class Q_24 {

	
	
	    // Data members
	    private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;

	    public Q_24(String name, int age, String phoneNumber, String address, double salary) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    public void printSalary() {
	        System.out.println("Salary: " + salary);
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public static void main(String[] args) {
	        // Create a Member object
	        Q_24 member = new Q_24("Nikul", 30, "760-058-1189", "123 Amd Street", 50000);

	       
	        System.out.println("Name: " + member.getName());
	        System.out.println("Age: " + member.getAge());
	        System.out.println("Phone Number: " + member.getPhoneNumber());
	        System.out.println("Address: " + member.getAddress());

	       
	        member.printSalary();
	    }
	}


