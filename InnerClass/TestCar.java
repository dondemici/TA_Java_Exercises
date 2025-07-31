package InnerClass;

public class TestCar {
    public static void main(String[] args) {
        Car1 myCar = new Car1("ABC12345VIN");
        myCar.start();

        // Create static nested class Engine object without Car instance
        Car1.Engine engine = new Car1.Engine(300, "V8");
        engine.displaySpecs();
    }
}