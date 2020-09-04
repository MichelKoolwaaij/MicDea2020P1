package micint;

import exceptions.DivideByZeroException;

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

    public void div(int i) throws DivideByZeroException {
        if (i==0){
            throw new DivideByZeroException();
        }
        getal = getal / i;
    }
}
