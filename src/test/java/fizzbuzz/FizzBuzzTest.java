package fizzbuzz;

import exceptions.Exception43;
import exceptions.Exception87;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Michel Koolwaaij on 04-09-20.
 */
public class FizzBuzzTest {
    FizzBuzz sut = new FizzBuzz();
    String fizzbuzz;

    @Test
    public void testDivide3() throws Exception43 {
        // act
        fizzbuzz = sut.getString(9);

        // assert
        Assertions.assertEquals("Fizz",fizzbuzz);

    }

    @Test
    public void testDivid5() throws Exception43 {
        // act
        fizzbuzz = sut.getString(10);

        // assert
        Assertions.assertEquals("Buzz",fizzbuzz);
    }

    @Test
    public void testDivide15() throws Exception43 {
        // act
        fizzbuzz = sut.getString(30);

        // assert
        Assertions.assertEquals("FizzBuzz",fizzbuzz);

    }

    @Test
    public void testException43(){
        // act & assert
        Assertions.assertThrows(Exception43.class, () -> {
            sut.getString(43);
        });

    }

    @Test
    public void testException87(){
        // act & assert
        Assertions.assertThrows(Exception87.class, () -> {
            sut.getString(87);
        });
    }

}
