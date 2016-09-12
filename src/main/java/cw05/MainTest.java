package cw05;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evgeniy on 12/09/16.
 */
public class MainTest {

    @Test
    public void getSumTest() {
        int result = new Main().getSum(1, 4);
        Assert.assertEquals(result, 6);
    }
}
