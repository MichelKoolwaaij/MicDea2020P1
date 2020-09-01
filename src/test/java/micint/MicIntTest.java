package micint;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Michel Koolwaaij on 01-09-20.
 */
public class MicIntTest {
    private MicInt sut;

    @Test
    public void testConstructor(){
        // assign
        sut = new MicInt(3);

        // act

        // assert
        Assertions.assertEquals(3, sut.get());
    }

    @Test
    public void testInc(){
        // assign
        sut = new MicInt(3);

        // act
        sut.inc();

        // assert
        Assertions.assertEquals(4, sut.get());
    }

    @Test
    public void testIncWithPositiveValue(){
        // assign
        sut = new MicInt(3);

        // act
        sut.inc(2);

        // assert
        Assertions.assertEquals(5, sut.get());

    }

    @Test    public void testIncWithNegativeValue(){
        // assign
        sut = new MicInt(3);

        // act
        sut.inc(-2);

        // assert
        Assertions.assertEquals(1, sut.get());

    }

}
