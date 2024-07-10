package assignmentJava_coreJava;



	import java.util.Scanner;

	class Complex {
	    private double real;
	    private double imag;

	    public Complex(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    public Complex add(Complex other) {
	        return new Complex(this.real + other.real, this.imag + other.imag);
	    }

	    public Complex subtract(Complex other) {
	        return new Complex(this.real - other.real, this.imag - other.imag);
	    }

	    public Complex multiply(Complex other) {
	        double realPart = this.real * other.real - this.imag * other.imag;
	        double imagPart = this.real * other.imag + this.imag * other.real;
	        return new Complex(realPart, imagPart);
	    }

	    @Override
	    public String toString() {
	        return this.real + " + " + this.imag + "i";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter real part of first complex number: ");
	        double real1 = scanner.nextDouble();
	        System.out.print("Enter imaginary part of first complex number: ");
	        double imag1 = scanner.nextDouble();
	        Complex num1 = new Complex(real1, imag1);

	        System.out.print("Enter real part of second complex number: ");
	        double real2 = scanner.nextDouble();
	        System.out.print("Enter imaginary part of second complex number: ");
	        double imag2 = scanner.nextDouble();
	        Complex num2 = new Complex(real2, imag2);

	        Complex sum = num1.add(num2);
	        Complex difference = num1.subtract(num2);
	        Complex product = num1.multiply(num2);

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);

	        scanner.close();
	    }
	}

