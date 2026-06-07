/**
 * Topics 4 & 5: Inheritance Paradigms
 * Demonstrates hierarchical code reuse where a child class inherits attributes 
 * and behaviors from a parent class.
 */

// Base Parent Class
class NetworkDevice {
    String deviceId;
    String status;

    public NetworkDevice(String id) {
        this.deviceId = id;
        this.status = "OFFLINE";
    }

    public void powerOn() {
        this.status = "ONLINE";
        System.out.println("Device " + deviceId + " is now booted up.");
    }
}

// Child Class extending Parent (Single Inheritance)
class Router extends NetworkDevice {
    int activeConnections;

    public Router(String id) {
        // 'super' calls the constructor of the parent class (NetworkDevice)
        super(id);
        this.activeConnections = 0;
    }

    public void routeTraffic() {
        System.out.println("Router " + deviceId + " is directing data packets securely.");
    }
}

// Grandchild Class extending Child (Multilevel Inheritance)
class SmartGateway extends Router {
    boolean firewallEnabled;

    public SmartGateway(String id) {
        super(id); // Calls Router constructor
        this.firewallEnabled = true;
    }

    public void auditSecurity() {
        System.out.println("Gateway firewall status: " + (firewallEnabled ? "ACTIVE" : "DISABLED"));
    }
}

public class _04_05_InheritanceEngine {
    public static void main(String[] args) {
        System.out.println("--- Executing Hierarchical Inheritance System ---");
        
        // Creating an instance of the grandchild class
        SmartGateway gateway = new SmartGateway("GW-909");
        
        // Accessing inherited methods from all levels of the chain
        gateway.powerOn();       // Inherited from NetworkDevice
        gateway.routeTraffic();  // Inherited from Router
        gateway.auditSecurity(); // Defined in SmartGateway
    }
}
