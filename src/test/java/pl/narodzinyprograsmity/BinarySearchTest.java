package pl.narodzinyprograsmity;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {
    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    int result;
    private BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new BinarySearch();
        result = Integer.MIN_VALUE;
    }

    @Test
    public void binarySearchTest() {
        result = binarySearch.search(list, 4);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void searchLastElementTest() {
        result = binarySearch.search(list, 10);

        assertThat(result).isEqualTo(9);
    }

    @Test
    public void searchNoExistElementTest() {
        result = binarySearch.search(list, 100);

        assertThat(result).isEqualTo(-1);
    }
}