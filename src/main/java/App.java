import beerdrinking.Party;
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
        var micInt = new MicInt(0);

        Party party = new Party();
        party.startParty();

        System.out.println(micInt.get());
    }


}
