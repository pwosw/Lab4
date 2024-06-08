public class JPA406{
    public static void main(String[] args) {
        int[] rates = {30, 50, 80, 100}; 
        int[] intervals = {2, 4, 6}; 

        calculateAndPrintFee(2, rates, intervals);
        calculateAndPrintFee(3, rates, intervals);
        calculateAndPrintFee(5, rates, intervals);
        calculateAndPrintFee(8, rates, intervals);
    }
    
    public static void calculateAndPrintFee(int hours, int[] rates, int[] intervals) {
        int totalFee = calculateFee(hours, rates, intervals);
        System.out.println("停車時數:"+hours+"小時");
        System.out.println("應繳費用:"+totalFee+"元整");
        System.out.println("---------------------");
    }
    
    public static int calculateFee(int hours, int[] rates, int[] intervals) {
        int totalFee = 0;
        int previousInterval = 0; 
        
        for (int i = 0; i < intervals.length; i++) {
            int currentInterval = intervals[i];
            int rate = rates[i];
            
            int hoursInThisInterval = Math.min(hours, currentInterval) - previousInterval;
            totalFee += hoursInThisInterval * rate;
            
            if (hours <= currentInterval) {
                break; 
            }
            
            previousInterval = currentInterval;
        }
        
        if (hours > intervals[intervals.length - 1]) {
            int rate = rates[rates.length - 1];
            totalFee += (hours - intervals[intervals.length - 1]) * rate;
        }
        
        return totalFee;
    }
}
