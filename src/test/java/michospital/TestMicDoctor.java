package michospital;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Michel Koolwaaij on 07-09-20.
 */
public class TestMicDoctor {
    private MicDoctor sut;

    @BeforeEach
    public void init(){
        sut = new MicDoctor("Bianca",75000);
    }

    @Test
    public void testSalaryWithBonus(){
        // assign
        sut.setNrOfBeds(12);
        sut.setNrOfPatients(11);

        // act
        double salary = sut.getSalary();

        // assert
        Assertions.assertEquals(82500, salary);
    }
}
