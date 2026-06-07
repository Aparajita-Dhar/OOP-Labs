/**
 * Topic 8: GUI (Graphical User Interface) Framework Elements
 * Note: Legacy 'Applets' have been deprecated in modern Java. This script 
 * demonstrates the standard modern alternative: Java Swing GUI component mapping.
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _08_GuiArchitecture {
    public static void main(String[] args) {
        // 1. Creating the main display window container (JFrame)
        JFrame applicationWindow = new JFrame("Academic Dashboard Simulator");
        applicationWindow.setSize(400, 200);
        applicationWindow.setLayout(null); // Explicit placement formatting
        applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on clicking 'X'

        // 2. Creating an interactive layout item (JButton)
        JButton actionButton = new JButton("Run Master Audit");
        actionButton.setBounds(100, 50, 180, 40); // (X, Y, Width, Height) positions

        // 3. Attaching an event listener script to handle user clicks
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("[GUI Event Intercepted] Audit request sent to the main server cluster!");
            }
        });

        // 4. Mounting button to the window layer and turning on visibility
        applicationWindow.add(actionButton);
        applicationWindow.setVisible(true); // Renders window to the screen
        
        System.out.println("Graphical User Interface frame successfully initialized in the system background.");
    }
}
