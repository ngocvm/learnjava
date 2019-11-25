package com.ngocvm.example.Day54;

public class Car {
    protected String model;
    protected int length;
    protected int width;
    protected String color;
    protected double maxSpeed;
    protected int numberOfSeats;
    protected Engine engine;

    public Car(String model, int length, int width, String color, double maxSpeed, int numberOfSeats) {
        this.model = model;
        this.length = length;
        this.width = width;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
        engine = new Engine();
    }

    public void start() {
        System.out.println("Car starting...");
        engine.start();
    }

    public void stop() {
        System.out.println("Car stop.");
        engine.stop();
    }

    public void brake() {
        System.out.println("Car brake.");
        engine.gearDown();
    }

    public void accelerate() {
        System.out.println("Car accelerate.");
        engine.gearUp();
    }

    public void goAhead() {
        System.out.println("Car go ahead.");
    }

    public void turnLeft() {
        System.out.println("Car turn left");
    }

    public void turnRight() {
        System.out.println("Car turn right");
    }

    public class Engine {
        private String version;
        private String manufacturer;
        private String power;
        private int numberOfCylinders;

        public Engine() {
            this.version = "1.0";
            this.manufacturer = "Germany";
            this.power = "120";
            this.numberOfCylinders = 4;
        }

        public void start() {
            System.out.println("Starting engine...");
        }

        public void stop() {
            System.out.println("Stop engine...");
        }

        public void gearUp() {
            System.out.println("Engine gear up...");
        }

        public void gearDown() {
            System.out.println("Engine gear down...");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2, 4, "black", 120.0, 4);
        Car car2 = new Car("Honda", 2, 5, "read", 200.0, 4);

        car1.start();
        car1.accelerate();
        car1.goAhead();

        car2.start();
        car2.accelerate();
        car2.goAhead();
        car2.brake();
        car2.turnLeft();
        car2.accelerate();
        car2.goAhead();
        car2.stop();
    }
}
