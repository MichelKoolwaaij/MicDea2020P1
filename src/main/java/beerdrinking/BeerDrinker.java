package beerdrinking;

/**
 * Created by Michel Koolwaaij on 07-09-20.
 */
public class BeerDrinker implements Runnable{

    private static final int VOLUME_GLAS = 200;
    private String name;
    private Keg myKeg;

    private int consumedBeer = 0;

    public BeerDrinker(String name) {
        this.name = name;
    }

    public BeerDrinker(String name, Keg keg) {
        this.name = name;
        this.myKeg = keg;
    }

    public void tapBeer(Keg keg) {
        consumedBeer += keg.tap(VOLUME_GLAS);

        System.out.println(this.name + " tapped a glas.");
    }

    public void drank() {
        System.out.println(this.name + " drank " + consumedBeer + "ml.");
    }

    public void run() {
        while(myKeg.getRemainingVolume() > 0){
            tapBeer(myKeg);
        }
        System.out.println(this.name + " drank " + consumedBeer + "ml.");
    }

}
