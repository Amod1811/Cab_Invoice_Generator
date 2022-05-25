package bl.com.cabInvoicegenrator;
/*
The cab service is a subscription based cab service,
where the customer books a cab, and pays the bill at the end of month.

Given distance and time ,the invoice generator should return
the total fare for the journey

cost-Rs.10 per km +1 per min
minimum fare-Rs.5
 */
public class CabInvoiceGenrator {
    /**
     * final variable
     */
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;

    /**
     * Created a method to calculate the fare of journey
     *
     * @param distance is 5
     * @param time
     * @return total fare
     */
    public double CalculateFare(double distance, int time) {

        // formula for total fare
        double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        /**
         * if total fare is greater than min fare then
         */
        if (totalFare < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFare;
    }

    public static void main(String[] args) {
        CabInvoiceGenrator cabInvoiceGenerator = new CabInvoiceGenrator();
        double fare = cabInvoiceGenerator.CalculateFare(5, 20);
        System.out.println("Total Fare : " + fare + " Rs");
    }
}
