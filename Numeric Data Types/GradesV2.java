
/**
 * A program made to calculate the total points and average grade 
 * each time a new score is added to the total.
 *
 * @author Claudia Yamamoto
 * @version 12-03-2017
 */
public class GradesV2
{
    public static void main(String [] args){
        //local var
        int numTests = 0;       //number of tests
        int testGrade = 0;      //individual test grade
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;   //average grade
        
        //test 1
        testGrade = 95;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test #" + numTests + " Test Grade:  " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
        
        //test 2
        testGrade = 73; 
        numTests++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test #" + numTests + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
            
        //test 3 
        testGrade = 91;
        numTests++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test #" + numTests + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
        
        //test 4
        testGrade = 82;
        numTests++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test #" + numTests + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
            
        
    }
}
