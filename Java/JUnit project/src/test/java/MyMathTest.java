import com.example.MyMath;
import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(2, 0);
    }

}
