import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChartTest {

    @Test
    void getName() {
        Chart temp = new Chart("Billboards");
        assertEquals("Billboards", temp.getName());
    }

    @Test
    void setName() {
        Chart temp = new Chart("Billboards");
        temp.setName("Top 10 Rock Albums");
        assertEquals("Top 10 Rock Albums", temp.getName());

    }

    @Test
    void getRanks() {
        String arr[] = {"hello", "Shape of you"};
        Chart temp = new Chart("Billboards", arr);
        assertEquals(arr, temp.getRanks());
    }

    @Test
    void setRanks() {
        Chart temp = new Chart("Billboards");
        String arr[] = {"hello", "Shape of you"};
        temp.setRanks(arr);
        assertEquals(arr, temp.getRanks());

    }


}