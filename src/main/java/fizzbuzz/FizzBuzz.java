package fizzbuzz;

import exceptions.Exception43;
import exceptions.Exception87;

/**
 * Created by Michel Koolwaaij on 04-09-20.
 */
public class FizzBuzz {
    public String getString(int i) throws Exception43 {
        String string = "";
        if (i == 43){
            throw new Exception43();
        }
        if (i == 87){
            throw new Exception87();
        }
        if (i%3 == 0){
            string = string.concat("Fizz");
        }
        if (i%5 == 0){
            string = string.concat("Buzz");
        }
        return string;
    }
}
