import java.util.concurrent.TimeUnit;

public class Tools {
    public static void wait(int seconds)
    {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
