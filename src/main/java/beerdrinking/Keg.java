package beerdrinking;

/**
 * Created by Michel Koolwaaij on 07-09-20.
 */
public class Keg {

    private final int capacityInMl;
    private int remainingCapacityInMl;

    /**
     * Create a new keg
     *
     * @param capacityInMl
     */
    public Keg(int capacityInMl) {
        this.capacityInMl = capacityInMl;
        this.remainingCapacityInMl = capacityInMl;
    }

    public int getRemainingVolume() {
        return this.remainingCapacityInMl;
    }

    public int tap(int volumeInMl) {
        if (volumeInMl > this.remainingCapacityInMl) {
            volumeInMl = this.remainingCapacityInMl;
        }

        this.remainingCapacityInMl -= volumeInMl;
        return volumeInMl;
    }

}
