import java.util.Scanner;

public class Car {
    private String model;
    private String color;
    private int speed;

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Car Model: ");
        String model = scan.nextLine();
        System.out.print("Enter Car Color: ");
        String color = scan.nextLine();
        System.out.print("Enter Car Speed: ");
        int speed = scan.nextInt();

        Car car = new Car();
        car.setModel(model).setColor(color).setSpeed(speed).display();

        scan.close();
    }
}
