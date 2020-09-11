package beerdrinking;

import java.util.ArrayList;

/**
 * Created by Michel Koolwaaij on 07-09-20.
 */
public class ThreadingParty {

    private Keg keg;
    private ArrayList<BeerDrinker> drinkers;

    /**
     * Create a new Party
     */
    public ThreadingParty() {
        initKeg();
        initBeerdrinkers();
    }

    /**
     * Start the party
     */
    public void startParty() {



        drinkers.stream().forEach(drinker -> {
            System.out.println("Thread started");
            new Thread(drinker).start();
        });
    }


    private void initKeg() {
        this.keg = new Keg(50000);
    }

    private void initBeerdrinkers() {
        this.drinkers = new ArrayList<BeerDrinker>();

        drinkers.add(new BeerDrinker("Romy",keg));
        drinkers.add(new BeerDrinker("Koen",keg));
        drinkers.add(new BeerDrinker("Stein",keg));
        drinkers.add(new BeerDrinker("Adam",keg));
        drinkers.add(new BeerDrinker("Laurens",keg));
    }
}

