package skill;

public class SuperKeyword {
    static class Vehicle {
        int maxSpeed = 120;
    }

    static class Car extends Vehicle {
        int maxSpeed = 180;

        void display() {
            System.out.println("Maximum Speed: " + super.maxSpeed);
        }
    }

    public static void main(String[] args) {
        Car small = new Car();
        small.display();
    }
}