import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = {2, 4, 5, 7};
        int[] a2 = {2, 3, 5, 7};
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        //int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a13 = {{3, 4}, {6, 7}, {11, 23}};
        assertArrayEquals("Should be equal", a11, a13);
    }

    @Test
    public void testStringArrayEquality() {
        String[] array1 = {"apple", "banana", "cherry"};
        String[] array2 = {"apple", "banana", "cherry"};
        assertArrayEquals("String arrays should be equal", array1, array2);
    }

}
