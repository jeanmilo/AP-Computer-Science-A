/**
 * A program used to calculate a users total points 
 * and average test grade each time a new score 
 * is added to the total.
 *
 * @author Claudia Yamamoto
 * 12-15-2017
 */
//importing Scanner methods
import java.util.Scanner; 
public class GradesV3
{
    public static void main(String [] args){
        //local var
        Scanner in = new Scanner(System.in);
        
        int testNum = 0;
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;   //average grade
        
        System.out.print("What's your name? ");
        String name = in.nextLine();
        System.out.print(name + ", enter your class subject: ");
        String className = in.nextLine();
        System.out.print("Please enter how many tests you took in "+ className + ": ");
        int numTests = in.nextInt();
        System.out.print("Please enter your grade: ");
        int testGrade = (int)in.nextInt();
        
        
        //test 1
        testNum ++;
        totalPoints += testGrade;
        average = (double)totalPoints/testNum;
        System.out.println("Test #" + testNum + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "    Average Score: " + average );
        
    
        
        //test 2
        System.out.print("Please enter your grade: ");
        testGrade = (int)in.nextInt();
        testNum++;
        totalPoints += testGrade;
        average = (double)totalPoints/testNum;
        System.out.println("Test #" + testNum + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
        
            
        //test 3    
        System.out.print("Please enter your grade: ");
        testGrade = (int)in.nextInt();
        testNum++;
        totalPoints += testGrade;
        average = (double)totalPoints/testNum;
        System.out.println("Test #" + testNum + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
        
        //test 4
        System.out.print("Please enter your grade: ");
        testGrade = (int)in.nextInt();
        testNum++;
        totalPoints += testGrade;
        average = (double)totalPoints/testNum;
        System.out.println("Test #" + testNum + " Test Grade: " + testGrade +
            "   Total Points: " + totalPoints + "   Average Score: " + average );
            
        
    }
}
