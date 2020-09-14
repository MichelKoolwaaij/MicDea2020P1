import beerdrinking.Party;
import beerdrinking.ThreadingParty;
import exceptions.DivideByZeroException;
import http.MicHTTPServer;
import micint.MicInt;
import micint.MicIntRunnable;

import java.util.stream.IntStream;

/**
 * Created by Michel Koolwaaij on 31-08-20.
 */
public class App {
    private static final int MAXTHREADS = 1000;

    public static void main (String[] args)  {
        App app = new App();
        app.start();
    }

    private void start()  {
        System.out.println("Welkom in de wereld van DEA");
        var micInt = new MicInt(0);

        /** Start the streams demo
         *
         */
        // Party party = new Party();
        // party.startParty();

        /** Multithreading demo
         * with MicIntRunnable, lambda expression and a stream
         * uncomment to run demo
         *
         */

        //IntStream intstream = IntStream.range(0, MAXTHREADS+1);
        //intstream.forEach(i -> new Thread( new MicIntRunnable(micInt)).start());

        /** MultiThreading demo
         * with Beerdrinker
         * uncomment to run demo
         */
        // ThreadingParty party = new ThreadingParty();
        // party.startParty();

        /** HTTP Server demo
         *
         *
         */
        var httpServer = new MicHTTPServer(8384);
        httpServer.startServer();

        System.out.println(micInt.get());
    }


}
