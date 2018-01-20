/**
 * This program takes the amount of money spent 
 * in a country (Brazil, Belgium, and Argentina) and
 * converts it into US currency as of December 3rd 2017.
 * 
 *
 * @author Claudia Yamamoto
 * @version 12-03-2017
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here 
        double realsSpent = 1283.43;
        double realExRate = 3.265602;
        double dollarsSpentInBr = 0.0;
        double dollarsAfterBr = 0.0;
        double eurosSpent = 3254.37;
        double euroExRate = 0.840811;
        double dollarsSpentInBe = 0.0;
        double dollarsAfterBe = 0.0;
        double pesoSpent = 2932.49;
        double pesoExRate = 17.22427;
        double dollarsSpentInAr = 0.0;
        double dollarsAfterAr = 0.0;
        
        
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion

        System.out.println("Starting US Dollars: " + startingUsDollars);
        System.out.println();
        System.out.println("Mexico:");
        System.out.println("  Pesos Spent: " + pesosSpent);
        dollarsSpentInMexico = (pesosSpent/pesoExchangeRate);
        System.out.println("  US Dollar Equivalent: " + dollarsSpentInMexico);
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        System.out.println("  US Dollars Remaining: " + dollarsAfterMexico);
        
        
        System.out.println("Brazil:");
        System.out.println("  Reals Spent: " + realsSpent);
        dollarsSpentInBr = (realsSpent/realExRate);
        System.out.println("  US Dollar Equivalent: " + dollarsSpentInBr);
        dollarsAfterBr = dollarsAfterMexico - dollarsSpentInBr;
        System.out.println("  US Dollars Remaining: " + dollarsAfterBr);
        
        
        System.out.println("Belgium:");
        System.out.println("  Euros Spent: " + eurosSpent);
        dollarsSpentInBe = (eurosSpent/euroExRate);
        System.out.println("  US Dollar Equivalent: " + dollarsSpentInBe);
        dollarsAfterBe = dollarsAfterBr - dollarsSpentInBe;
        System.out.println("  US Dollars Remaining: " + dollarsAfterBe);
        
        
        System.out.println("Argentina:");
        System.out.println("  Pesos Spent: " + pesoSpent);
        dollarsSpentInAr = (pesoSpent/pesoExRate);
        System.out.println("  US Dollar Equivalent: " + dollarsSpentInAr);
        dollarsAfterAr = dollarsAfterBe - dollarsSpentInAr;
        System.out.println("  US Dollars Remaining: " + dollarsAfterAr);
        
        System.out.println();
        
        System.out.println("==================================================");
        
        System.out.println();
        System.out.println();

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 42;         //cost per item of first souvenir
        int budget1 = 400;          //budget for first item
        int totalItems1 = 8;        //how many items can be purchased
        int fundsRemaining1 = budget1 % (costItem1*totalItems1);  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1);
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 94.99;   //cost per item of second souvenir
        int budget2 = 500;          //budget for second item
        int totalItems2 = 5;        //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2; //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2);
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
