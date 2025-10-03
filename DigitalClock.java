import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    public static void main(String[] args) {
        // Create a thread to run the clock
        Thread clockThread = new Thread(() -> {
            while (true) {
                // Get current time
                LocalTime now = LocalTime.now();
                
                // Format time as HH:MM:SS
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                
                // Clear screen (optional for some consoles)
                // System.out.print("\033[H\033[2J"); // ANSI escape code to clear console (might not work in some IDEs)
                // System.out.flush();

                // Print time
                System.out.println("Current Time: " + time);
                
                // Wait 1 second
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Clock interrupted.");
                    break;
                }
            }
        });

        // Start the thread
        clockThread.start();
    }
}
