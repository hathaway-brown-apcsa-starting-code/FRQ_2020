
/**
 * Code to test APCS-A Free Response Question #1 from the Course Description
 * This is question #2 on the 2020 Exam.
 *
 * @author Michael Buescher at Hathaway Brown School   mbuescher@hb.edu
 * @version 2020-05-05
 */

public class CheckDigitTester
{
    public static void main (String[] args)
    {
        // The check digit for 159 is 2, so this should return true, false
        System.out.println ("isValid(1592) :\t" + CheckDigit.isValid(1592)); 
        System.out.println ("isValid(1593) :\t" + CheckDigit.isValid(1593)); 
        
        // The check digit for 283415 is 6, so this should return true, false
        System.out.println ("isValid(2834156) :\t" + CheckDigit.isValid(2834156)); 
        System.out.println ("isValid(2834157) :\t" + CheckDigit.isValid(2834157)); 
        
        // The check digit for 2183 is 2, so this should return true, false
        System.out.println ("isValid(21832) :\t" + CheckDigit.isValid(21832)); 
        System.out.println ("isValid(21835) :\t" + CheckDigit.isValid(21835)); 
    }
}
