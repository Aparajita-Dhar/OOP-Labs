/**
 * Topic 6: Interfaces (Architectural Contracts)
 * An interface defines standard behavior that implementing classes MUST fulfill.
 * This handles abstraction and simulates multiple inheritance structures in Java.
 */

// Interface defining a standard blueprint
interface CloudService {
    void connectToCloud(); // Abstract method (no body)
    void syncData(String packet);
}

// Class implementing the interface contract
class DatabaseNode implements CloudService {
    private String nodeName;

    public DatabaseNode(String name) {
        this.nodeName = name;
    }

    // Must override and implement all abstract methods from the interface
    @Override
    public void connectToCloud() {
        System.out.println("Node [" + nodeName + "] connected to global cloud endpoint successfully.");
    }

    @Override
    public void syncData(String packet) {
        System.out.println("Node [" + nodeName + "] streaming payload packet: " + packet);
    }
}

public class _06_InterfaceArchitecture {
    public static void main(String[] args) {
        System.out.println("--- Testing Decoupled Interface Contract ---");
        
        CloudService myNode = new DatabaseNode("Cluster-Alpha");
        myNode.connectToCloud();
        myNode.syncData("User_Auth_Token_UUID");
    }
}
