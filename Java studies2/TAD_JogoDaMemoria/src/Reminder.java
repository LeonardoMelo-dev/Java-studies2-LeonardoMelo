import java.util.Timer;
import java.util.TimerTask;

public class Reminder
{
    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\nDigite a nova sequencia: ");
            timer.cancel(); //Terminate the timer thread

        }
    }
}