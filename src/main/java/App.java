import exceptions.DivideByZeroException;
import micint.MicInt;

/**
 * Created by Michel Koolwaaij on 31-08-20.
 */
public class App {
    public static void main (String[] args)  {
        App app = new App();
        app.start();
    }

    private void start()  {
        System.out.println("Welkom in de wereld van DEA");
        MicInt micInt = new MicInt(8);

        micInt.inc(3);
        try {
            micInt.div(0);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            micInt.inc();
        }

        System.out.println(micInt.get());
    }


}
