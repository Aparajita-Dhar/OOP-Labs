/**
 * Topic 1: Basic Program Structure in Java
 * Demonstrates the structural blueprint of a Java class and basic console output.
 */
public class _01_JavaBasics {
    
    // The main method is the execution entry point for every Java application
    public static void main(String[] args) {
        System.out.println("--- 1. Java Execution Architecture ---");
        System.out.println("Java code compiles to bytecode, which runs on the JVM (Java Virtual Machine).");

        // Variable initialization
        int academicYear = 2026;
        String trackName = "Object-Oriented Programming";

        System.out.println("\n--- 2. Variable Output ---");
        System.out.println("Current Year: " + academicYear);
        System.out.println("Enrolled Lab Track: " + trackName);
    }
}
