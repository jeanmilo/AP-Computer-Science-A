/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Claudia Yamamoto
 * @version 12-03-2017
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
        //Declaring int var
        int iNum1 = 25;
        int iNum2 =  9;
        int iNum3 = 11;
        int iNum4 = 28;
        int iNum5 = 32;
        int iNum6 = 99;
        double dNum1 = 3.14;
        double dNum2 = 10.0;
        double dNum3 = 43.21;
        
        // Addition
        System.out.println("Addition");
        System.out.print( iNum1 + " + " + iNum2 +" = " );
        System.out.println(iNum1 + iNum2);
        System.out.println( "43.21 + 3.14 + 10.0 = "+ (43.21 + 3.14 + 10.0) );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 +" - " + iNum2 + " - " + iNum1 +" = "+(iNum3 - iNum2 - iNum1));
        System.out.println( dNum1+ " - "+dNum2+" = "+ (dNum1 - dNum2) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " * "+ iNum2 + " = "+ (iNum1 * iNum2) ); 
        System.out.println( dNum1+" * "+dNum2+" * "+dNum2+" = "+(dNum1 * dNum2 * dNum2) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( iNum2+" / "+iNum1+" = "+(iNum2 / iNum1) );
        System.out.println( dNum3+" / "+dNum2+" = "+(dNum3 / dNum2) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3+" % "+iNum2 +"= "+(iNum3 % iNum2) );
        System.out.println( dNum2+" % "+dNum1+" = "+(dNum2 % dNum1) );
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("2.03 Additional int Equations");
        System.out.println(iNum4 + " + " + iNum5 +" / " + iNum6 + " = " + (iNum4 + iNum5 / iNum6));
        System.out.println(iNum6 + " % " + iNum5 + " + " + iNum4 + " = " + (iNum6%iNum5+iNum4) );
        System.out.println(iNum5 + " / " + dNum2 + " - " + iNum3 + " = " + (iNum5/dNum2-iNum3));
        
               
    } // end of main method
} // end of class
