package micint;

/**
 * Created by Michel Koolwaaij on 01-09-20.
 */
public class MicInt {
    private int getal;

    public MicInt(int i) {
        this.getal = i;
    }

    public void inc() {
        getal++;
    }

    public int get() {
        return getal;
    }

    public void inc(int i) {
        getal = getal + i;
    }
}
