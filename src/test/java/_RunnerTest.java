import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {3, 9},
                {-2, 16},
                {5, 25}
        };
    }

    @org.testng.annotations.Test(dataProvider = "data")
    public void testCalculate(Object num, double result) throws Exception {
        assertEquals(_Runner.calculate(String.valueOf(num)), result, 0.000000000001);
    }

}