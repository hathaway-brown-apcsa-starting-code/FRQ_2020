public class CheckDigit
{
  /** Returns the check digit for num, as described in part (a).
  * Precondition: The number of digits in num is between one and
  * six, inclusive.
  * num >= 0
  */

  public static int getCheck(int num)
  {
      /*  part (a) of the original question */
      /*  Solved here to enable the 2020 exam questions   */
      
      int ans = 0;
      int counter = 7;
      int digits = getNumberOfDigits(num);
      for (int i = 1; i <= digits; i++)
      {
          ans += getDigit (num, i) * counter;
          counter--;
      }
      return (ans % 10);
  }
  
  
  /** Returns true if numWithCheckDigit is valid, or false
  * otherwise, as described in part (b).
  * Precondition: The number of digits in numWithCheckDigit
  * is between two and seven, inclusive.
  * * numWithCheckDigit >= 0
  */
 
  public static boolean isValid(int numWithCheckDigit)
  {
      /* to be implemented in part (b) */
      
      // Your code goes here
      return false;    // dummy code so that it compiles
  }
  
  /** Returns the number of digits in num. */
  public static int getNumberOfDigits(int num)
  {
    /* implementation not shown in problem; written here for testing */
    return (int)Math.log10(Math.abs(num)) + 1;
  }
  
  /** Returns the nthdigit of num.
  * Precondition: n >= 1 and n <= the number of digits in num
  */
  public static int getDigit(int num, int n)
  {
    /* implementation not shown in problem; written here for testing */
    
    // Generate 10^n for divison
    int powOf10 = 1;
    for (int i = 1; i <= (getNumberOfDigits(num) - n); i++)
    {
        powOf10 *= 10;
    }
    
    return (num / powOf10) % 10;
  }
  
  // There may be instance variables, constructors, and methods not shown.
}