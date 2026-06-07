/**
 * Topic 7 (Part 2): Multi-Threading and Concurrency
 * Demonstrates spinning up independent, asynchronous execution workers (Threads) 
 * that run simultaneously alongside the main program flow.
 */

// Custom worker extending the base Thread engine
class NetworkDiagnosticWorker extends Thread {
    private String processName;

    public NetworkDiagnosticWorker(String name) {
        this.processName = name;
    }

    // The 'run' method contains the instructions the thread executes in parallel
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("[" + processName + "] Analyzing system packet layer #" + i);
                // Pause thread execution for 500 milliseconds to simulate active processing delay
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Worker thread process was interrupted unexpectedly.");
        }
        System.out.println(">> [" + processName + "] Analysis task finalized successfully.");
    }
}

public class _07_ThreadConcurrency {
    public static void main(String[] args) {
        System.out.println("--- Booting Concurrent Multi-Threaded Systems ---");

        // Instantiating two distinct background worker threads
        NetworkDiagnosticWorker workerAlpha = new NetworkDiagnosticWorker("Worker-Alpha");
        NetworkDiagnosticWorker workerBeta = new NetworkDiagnosticWorker("Worker-Beta");

        // Use 'start()' to spin up the thread in parallel. Do NOT call run() directly!
        workerAlpha.start();
        workerBeta.start();

        System.out.println("[Main Engine Core] Continuing basic monitoring instructions simultaneously...");
    }
}
