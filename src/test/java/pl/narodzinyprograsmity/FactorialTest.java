package pl.narodzinyprograsmity;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void factorialTest() {
        int result = factorial.count(4);

        assertThat(result).isEqualTo(24);
    }
}