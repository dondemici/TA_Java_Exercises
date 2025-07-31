package InnerClass;

interface StartListener {

    void onStart(String message);
    
}

class Car{
    String vin;
    //static nested class
    Engine engine;

    Car(String vin)
    {
        this.vin=vin;
    }
    public void start(){
        
        System.out.println("Car"+vin);
        
        StartListener listener = new StartListener() {
            @Override
            public void onStart(String message){
                System.out.println("Listener"+ message);
            }
        };
        listener.onStart("Engine");
    }

static class Engine{
    private int horsepower;
    private String type;

    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public void start(){
        System.out.println("A"+horsepower);
    }

    class Diagnostics {
        public void run() {
            System.out.println("Diagnostics running for car with vin " + type);
        }
    }

}   
}

class TestPractice{
public static void main(String[] args) {
    Car myCar = new Car("32115");
    myCar.start();
    Car.Engine engine = new Car.Engine(255, "Six");
    Car.Engine.Diagnostics diag = engine.new Diagnostics();

    diag.run();
}

}