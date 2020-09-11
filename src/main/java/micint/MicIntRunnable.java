package micint;

/**
 * Created by Michel Koolwaaij on 11-09-20.
 */
public class MicIntRunnable implements Runnable {
    private MicInt mi;
    public MicIntRunnable(MicInt mi) {
        this.mi = mi;
    }

    public void run() {
        for (int i=0;i<1000;i++){
            mi.inc(1);
        }
    }
}
