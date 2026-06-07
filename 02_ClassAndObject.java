/**
 * Topic 2: Classes, Objects, and Constructors
 * Shows how to create an abstract template (Class) and turn it into real memory entities (Objects).
 */

// Blueprint Class
class UniversityCandidate {
    // Instance variables (Attributes)
    String applicantName;
    String targetDegree;
    double undergraduateGpa;

    // Custom Constructor (Initializes the object when created with 'new')
    public UniversityCandidate(String name, String degree, double gpa) {
        this.applicantName = name; // 'this' differentiates instance variables from parameters
        this.targetDegree = degree;
        this.undergraduateGpa = gpa;
    }

    // Method to display object data
    public void displayProfile() {
        System.out.println("Applicant: " + applicantName);
        System.out.println("Target Program: " + targetDegree);
        System.out.println("Current GPA: " + undergraduateGpa + "/4.0");
    }
}

// Main Execution Class
public class _02_ClassAndObject {
    public static void main(String[] args) {
        System.out.println("--- Instantiating Objects via Constructors ---\n");

        // Creating real objects from our blueprint class
        UniversityCandidate student1 = new UniversityCandidate("Alice Smith", "MSc Computer Science", 3.82);
        UniversityCandidate student2 = new UniversityCandidate("Rahman Khan", "MSc Data Analytics", 3.65);

        // Invoking object behaviors
        student1.displayProfile();
        System.out.println("-------------------------");
        student2.displayProfile();
    }
}
