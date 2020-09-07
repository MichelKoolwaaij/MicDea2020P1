package micint;

import exceptions.DivideByZeroException;

/**
 * Created by Michel Koolwaaij on 01-09-20.
 */
public class MicInt {
    private int value;

    public MicInt(int i) {
        this.value = i;
    }


    public void inc() {
        value++;
    }

    public int get() {
        return value;
    }

    public void inc(int i) {
        value = value + i;
    }

    public void div(int i) throws DivideByZeroException {
        if (i==0){
            throw new DivideByZeroException();
        }
        value = value / i;
    }
}
