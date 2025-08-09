import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length) {
        this(length, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void display() {
        double area = length * width;
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        double len = scan.nextDouble();
        System.out.print("Enter width: ");
        double wid = scan.nextDouble();

        Rectangle r = new Rectangle(len, wid);
        r.display();

        scan.close();
    }
}
