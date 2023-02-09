package compound_interest;

public class CompoundInterest {
    
    private double amount ; // amount on deposit at end of each year
    private double principal=470000; //initial amount before interest
    private double rate = 0.05; //interest rate

    //display header 
    public void header(){
        System.out.printf("%s%30s%n", "YEAR", "AMOUNT ON DEPOSIT");
    }

    public void calc (){
        for(int year = 1; year <=3; year++){
            amount = principal * Math.pow(1.0 + rate, year);

            // %,25.2f 2 decimal point 25 character to the right and separate with comma
            System.out.printf("%2d%,28.2f%n", year, amount);
            
        }
    }

}
