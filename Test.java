import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class CalculatorTest {

    public void mnozenje(){

        List<Float> numbers = new ArrayList<Float>((Collection<Float>) Arrays.asList(5.0f, 3.0f));
        List<String>operations=new ArrayList<>(Arrays.asList("*"));

        Calculator.Calculate(numbers,operations);

        float expected=15.0f;
        float actual=Calculator.finalResult;
        Assert.assertEquals(expected,actual,0.0f);






    }

}
