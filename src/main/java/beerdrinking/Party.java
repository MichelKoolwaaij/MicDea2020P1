package beerdrinking;

import java.util.ArrayList;

/**
 * Created by Michel Koolwaaij on 07-09-20.
 */
public class Party {

    private Keg keg;
    private ArrayList<BeerDrinker> drinkers;

    /**
     * Create a new Party
     */
    public Party() {
        initKeg();
        initBeerdrinkers();
    }

    /**
     * Start the party
     */
    public void startParty() {

        KegUser ku = (k, cc) -> {k.tap(cc);}; // demo lambda functional interface

        while (keg.getRemainingVolume() > 0) {

            ku.removeBeerFromKeg(keg,10); // demo lambda functional interface

            drinkers.stream().forEach(drinker -> {
                if (keg.getRemainingVolume() > 0)
                    drinker.tapBeer(keg);
            });

        }

        drinkers.stream().forEach(drinker -> drinker.drank());
    }

    private void initKeg() {
        this.keg = new Keg(50000);
    }

    private void initBeerdrinkers() {
        this.drinkers = new ArrayList<BeerDrinker>();

        drinkers.add(new BeerDrinker("Romy"));
        drinkers.add(new BeerDrinker("Koen"));
        drinkers.add(new BeerDrinker("Stein"));
        drinkers.add(new BeerDrinker("Adam"));
        drinkers.add(new BeerDrinker("Laurens"));
    }
}

