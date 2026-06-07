/**
 * Topic 3: Polymorphism (Many Forms)
 * Demonstrates both Method Overloading (Compile-time) and Method Overriding (Runtime).
 */

class DataProcessor {
    // 1. Method Overloading: Same method name, different parameter lists
    public void renderData(String text) {
        System.out.println("Processing text payload: " + text);
    }

    public void renderData(int number) {
        System.out.println("Processing numerical payload: " + number);
    }
}

// Base class for Overriding
class SystemAlert {
    public void trigger() {
        System.out.println("System Alert: Generic system update notification.");
    }
}

// Child class overriding the parent method
class CriticalAlert extends SystemAlert {
    // 2. Method Overriding: Re-defining a parent method to change its behavior at runtime
    @Override
    public void trigger() {
        System.out.println("CRITICAL ALERT: Resource threshold breached! Immediate attention required.");
    }
}

public class _03_Polymorphism {
    public static void main(String[] args) {
        System.out.println("--- 1. Compile-Time Polymorphism (Overloading) ---");
        DataProcessor processor = new DataProcessor();
        processor.renderData("MSc Candidate Dossier");
        processor.renderData(7002);

        System.out.println("\n--- 2. Runtime Polymorphism (Overriding) ---");
        SystemAlert genericAlert = new SystemAlert();
        SystemAlert urgentAlert = new CriticalAlert(); // Upcasting

        genericAlert.trigger(); // Runs parent version
        urgentAlert.trigger();  // Runs overridden child version at runtime
    }
}
