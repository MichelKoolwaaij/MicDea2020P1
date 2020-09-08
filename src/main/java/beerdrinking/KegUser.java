package beerdrinking;

/**
 * Created by Michel Koolwaaij on 08-09-20.
 */
@FunctionalInterface
public interface KegUser {
    void removeBeerFromKeg(Keg k, int cc);
}
