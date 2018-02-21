/**
 * The purpose of this program is to calculate the probability 
 * that a family with two children will consist of two boys, 
 * a boy and a girl, or two girls
 * 
 * @Claudia Yamamoto
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReaderV1
 {
    public static void main(String[] args) throws IOException
        {
        //init vars
        String token = ""; 
        int bB = 0;
        int gG = 0;
        int bG = 0;
        int counter=0; 
        double proBB=0;
        double proBG = 0;
        double proGG =0; 
        Scanner inFile = new Scanner(new File("maleFemaleInFamily.txt"));
        
        while(inFile.hasNext()){
            token = inFile.next();
            System.out.println(token);
            if(token.equals("BB")){
                bB++;
                counter++;
            }else if(token.equals("GG")){
                gG++;
                counter++;
            }else if(token.equals("BG")){
                bG++;
                counter++;
            }else if(token.equals("GB")){
                bG++;
                counter++;  
            }    
        }
        
        System.out.println("\nSample size: " + counter);
        System.out.println("Number of families with two boys: "+ bB);
        System.out.println("Number of families with one boy and one girl: "+ bG);
        System.out.println("Number of families with two girls: "+ gG);
        
        inFile.close();
        proBB = Math.round(((double)bB / counter)* 10000.0)/100.0;
        proBG = Math.round(((double)bG / counter)* 10000.0)/100.0;
        proGG = Math.round(((double)gG / counter)* 10000.0)/100.0; 
        System.out.println("\nProbability of Two Boys: "+ proBB + "%"); 
        System.out.println("Probability of One Boy One Girl: "+ proBG + "%"); 
        System.out.println("Probability of Two Girls: " + proGG + "%"); 
    }
}
