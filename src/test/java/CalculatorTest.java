import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void can_add(){
        assertEquals(10, Calculator.add(5,5));
    }

    @Test
    public void can_subtract(){
        assertEquals(15, Calculator.subtract(20,5));
    }

    @Test
    public void can_divide(){
        assertEquals(10, Calculator.divide(20, 2), 0.01);
    }

    @Test
    public void can_multiply(){
        assertEquals(4, Calculator.multiply(2,2));
    }

}

