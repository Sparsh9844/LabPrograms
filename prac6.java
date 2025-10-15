package myFunc;

interface Shape{
	double area();
}

class Square implements Shape {
	double side;
	
	public Square(double side) {
		this.side=side;
	}
	
	//Method overriding
	public double area() {
		return side*side;
	}
}
public class prac6 {
	public static void main(String[] args) {
		Square s=new Square(5);
		System.out.println("The area of square is:" +s.area());
		
	}
}
