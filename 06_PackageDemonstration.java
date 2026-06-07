/**
 * Topic 6: Packages and Namespaces
 * Packages group related classes together to prevent naming conflicts and control access.
 */

// In a real IDE setup, you would declare a custom package at the top like: package com.university.project;
// Here, we demonstrate importing standard built-in Java utility packages.

import java.util.ArrayList; // Importing specific class from java.util package
import java.util.Date;      // Importing date utilities

public class _06_PackageDemonstration {
    public static void main(String[] args) {
        System.out.println("--- Java Package Management Simulation ---");

        // Instantiating a class from an imported utility package
        Date timestamp = new Date();
        System.out.println("System initialized at current package timestamp: " + timestamp);

        // Using collection containers from the utility package
        ArrayList<String> systemLogs = new ArrayList<>();
        systemLogs.add("Boot check passed.");
        systemLogs.add("Interface validation completed.");

        System.out.println("\nReading package list strings:");
        for (String log : systemLogs) {
            System.out.println(" Log Entry -> " + log);
        }
    }
}
