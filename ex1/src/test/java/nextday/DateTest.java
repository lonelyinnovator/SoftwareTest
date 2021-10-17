package nextday;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 沈佳军
 * @date 2021/10/17
 **/

public class DateTest {


    @Test
    public void incrementTest() {
        Date date = new Date(1, 17, -1);
        date.increment();
        Assert.assertEquals(18, date.getDay().getDay());

        date = new Date(10, 31, 2021);
        date.increment();
        Assert.assertEquals(11, date.getMonth().getMonth());

        date = new Date(11, 30, 2021);
        date.increment();
        Assert.assertEquals(1, date.getDay().getDay());
        Assert.assertEquals(12, date.getMonth().getMonth());

        date = new Date(12, 31, 2021);
        date.increment();
        Assert.assertEquals(2022, date.getYear().getYear());

        date = new Date(2, 28, 2020);
        date.increment();
        Assert.assertEquals("2/29/2020", date.toString());

        Year y = new Year(-1);
        y.increment();
    }

    @Test
    public void toStringTest() {
        Date date = new Date(12, 31, 2021);
        date.increment();
        Assert.assertEquals("1/1/2022", date.toString());
    }

    @Test
    public void equalsTest() {
        Date date = new Date(2, 28, 2020);
        Assert.assertEquals(true, date.equals(new Date(2, 28, 2020)));
        Assert.assertEquals(false, date.equals(new Date(3, 1, 2020)));
        Assert.assertEquals(false, date.equals(new Date(2, 27, 2020)));
        Assert.assertEquals(false, date.equals(new Date(2, 28, 2021)));
    }

    @Test
    public void isYearValidTest() {
        try {
            Year y = new Year(0);
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    @Test
    public void isMonthValidTest() {
        try {
            Month m = new Month(13, new Year(2021));
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    @Test
    public void isDayValidTest() {
        try {
            Day day = new Day(32, new Month(10, new Year(2021)));
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    @Test
    public void nextDayTest() {
        Date date = new Date(10, 30, 2021);
        Date date1 = Nextday.nextDay(date);
        Assert.assertEquals(false, date1.equals(date));
    }

    @Test
    public void testPrintDate() {
        Date date = new Date(10, 30, 2021);
        date.printDate();
    }
}
