// Vehicle interface
interface Vehicle {
    // start method
    void start();
}

// TwoWheeler class implementing Vehicle interface
class TwoWheeler implements Vehicle {
    // Overriding start method for TwoWheeler
    @Override
    public void start() {
        System.out.println("Starting a two-wheeler");
    }
}

// ThreeWheeler class implementing Vehicle interface
class ThreeWheeler implements Vehicle {
    // Overriding start method for ThreeWheeler
    @Override
    public void start() {
        System.out.println("Starting a three-wheeler");
    }
}

// FourWheeler class implementing Vehicle interface
class FourWheeler implements Vehicle {
    // Overriding start method for FourWheeler
    @Override
    public void start() {
        System.out.println("Starting a four-wheeler");
    }
}

// VDemo class
public class main {
    public static void main(String[] args) {
        // Creating a reference to Vehicle interface referring to TwoWheeler class
        Vehicle vehicleRef = new TwoWheeler();
        
        // Calling start() using the reference
        vehicleRef.start(); // Output: Starting a two-wheeler
        
        // Changing reference to ThreeWheeler class
        vehicleRef = new ThreeWheeler();
        
        // Calling start() using the reference
        vehicleRef.start(); // Output: Starting a three-wheeler
        
        // Changing reference to FourWheeler class
        vehicleRef = new FourWheeler();
        
        // Calling start() using the reference
        vehicleRef.start(); // Output: Starting a four-wheeler
    }
}
