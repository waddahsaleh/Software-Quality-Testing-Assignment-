import org.junit.Test;

import static org.junit.Assert.*;

public class NextDateTest {

    @Test
    public void  testMinimumValues() {
        assertEquals("2/1/1812", NextDate.nextDate(1, 1, 1812));
    }

    @Test
    public void testMaximumValues() {
        assertEquals("Invalid date", NextDate.nextDate(31, 12, 2212));
    }

    @Test
    public void testLeapYear() {
        assertEquals("29/2/2020", NextDate.nextDate(28, 2, 2020));
    }

    @Test
    public void testNonLeapYear() {
        assertEquals("1/3/2021", NextDate.nextDate(28, 2, 2021));
    }

    @Test
    public void testEndOfMonth() {
        assertEquals("1/2/2023", NextDate.nextDate(31, 1, 2023));
    }

    @Test
    public void testNotEndOfMonth() {
        assertEquals("16/4/2022", NextDate.nextDate(15, 4, 2022));
    }

    @Test
    public void testFebruary29LeapYear() {
        assertEquals("1/3/2020", NextDate.nextDate(29, 2, 2020));
    }

    @Test
    public void testFebruary29NonLeapYear() {
        assertEquals("Invalid date", NextDate.nextDate(29, 2, 2021));
    }

    @Test
    public void testRandomDate() {
        assertEquals("18/8/2022", NextDate.nextDate(17, 8, 2022));
    }
    @Test
    public void testInvalidDay() {
        assertEquals("Invalid date", NextDate.nextDate(32, 2, 2020));
    }

    @Test
    public void testInvalidMonth() {
        assertEquals("Invalid date", NextDate.nextDate(29, 13, 2021));
    }

    @Test
    public void testInvalidYear() {
        assertEquals("Invalid date", NextDate.nextDate(17, 8, 2214));
    }
    @Test
    public void  testEndOfYear() {
        assertEquals("1/1/1822", NextDate.nextDate(31, 12, 1821));
    }
}