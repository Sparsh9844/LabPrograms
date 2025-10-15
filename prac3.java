import java.util.Scanner;

// Class with constructor overloading
class prac3 {
    double width, height, depth;

    // Constructor with all dimensions
    prac3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor for a cube
    prac3(double side) {
        width = height = depth = side;
    }

    // Default constructor
    prac3() {
        width = height = depth = 0;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for 3-parameter constructor
        System.out.println("Enter width, height, and depth for box1:");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        prac3 box1 = new prac3(w, h, d);

        // Taking user input for cube
        System.out.println("Enter side length for cube (box2):");
        double side = sc.nextDouble();
        prac3 box2 = new prac3(side);

        // Default box
        prac3 box3 = new prac3();

        // Display volumes
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2 (cube): " + box2.volume());
        System.out.println("Volume of box3 (default): " + box3.volume());

        sc.close();
    }
}
/