package bl.com.cabInvoicegenrator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGenratorTest {

    //----------------- Test to Calculate total fare -----------------------
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenrator invoiceService = new  CabInvoiceGenrator();
        double distance = 2.0;
        int time = 5;
        double totalFare = invoiceService.CalculateFare(distance, time);
        Assert.assertEquals(25, totalFare,0);
    }

    //-------- Test to Calculate total fare if distance is less --------
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        CabInvoiceGenrator invoiceService = new  CabInvoiceGenrator();
        double distance = 0.1;
        int time = 1;
        double totalFare = invoiceService.CalculateFare(distance, time);
        Assert.assertEquals(5.0, totalFare,0);
    }
}
