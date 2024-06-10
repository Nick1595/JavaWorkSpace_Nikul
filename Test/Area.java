package Test;
class Shape {
	    public double getArea() {
	        return 0; // Default implementation for the base class
	    }
	}

	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double getArea() {
	        return length * width; // Overridden method to calculate area of a rectangle
	    }
	}

	public class Area {
	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 3);
	        System.out.println("Area of rectangle: " + rectangle.getArea());
	    }
	}





