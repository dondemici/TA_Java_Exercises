package InnerClass;

public class Car1 {
    private String vin;
    private Engine engine;

    // Constructor for Car, initializes vin and defines Diagnostics inner class
    public Car1(String vin) {
        this.vin = vin;

        // Method-local inner class: only visible inside this constructor
        class Diagnostics {
            void run() {
                System.out.println("Diagnostics running for car with vin " + vin);
            }
        }

        // Example usage of Diagnostics class
        Diagnostics diag = new Diagnostics();
        diag.run();
    }

     // Static nested class Engine (declarative nested class)
     public static class Engine {
        private int horsepower;
        private String type;

        public Engine(int horsepower, String type) {
            this.horsepower = horsepower;
            this.type = type;
        }

        public void displaySpecs() {
            System.out.println("Engine type: " + type + ", Horsepower: " + horsepower);
        }
    }

    public String getVin() {
        return vin;
    }

    // start method
    public void start() {
        System.out.println("car with vin " + vin + " is starting");
    }
}

