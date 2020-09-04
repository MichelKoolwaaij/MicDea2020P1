package micint;

import exceptions.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Michel Koolwaaij on 01-09-20.
 */
public class MicIntTest {
    private MicInt sut;

    @BeforeEach
    public void initTest(){
        // assign
        sut = new MicInt(3);
    }

    @Test
    public void testConstructor(){
        // assign
        sut = new MicInt(20);

        // act

        // assert
        Assertions.assertEquals(20, sut.get());
    }

    @Test
    public void testInc(){


        // act
        sut.inc();

        // assert
        Assertions.assertEquals(4, sut.get());
    }

    @Test
    public void testIncWithPositiveValue(){


        // act
        sut.inc(2);

        // assert
        Assertions.assertEquals(5, sut.get());

    }

    @Test    public void testIncWithNegativeValue(){


        // act
        sut.inc(-2);

        // assert
        Assertions.assertEquals(1, sut.get());

    }

    @Test
    public void testDivWithPositiveValue() throws DivideByZeroException {

        // act
        sut.div(3);

        // assert
        Assertions.assertEquals(1, sut.get());
    }

    @Test
    public void testDivWithZero(){

        // Act & Assert
        Assertions.assertThrows(DivideByZeroException.class, () -> {
            sut.div(0);
        });
    }

}
