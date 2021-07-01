import com.example.Vector2D;
import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v = new Vector2D(); // action

        // assertion
        Assert.assertEquals(0, v.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.getY(), 1e-9);
    }

}
