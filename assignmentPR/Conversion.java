public class Conversion
{
    // for final storage of characteristic after testing
    int c;
    // for final storage of numerator after testing
    int n;
     // for final storage of denominator after testing
    int d; 
    
    // for interum storage after testing
    String characteristic = "";
    String numerator = "";
    String denominator = "1";  
    
    char[] number = {'1','2','3','.','4','5','6'};

     
    
    /*Breaks the passed char array into the characteristic string
     * and mantissa stored as (numerator and denominator)
     * 
     */
   private void breakForConversion(char numString[]) 
    {
       
       //to iterate thru the char array
        int i = 0;
  
        // while not '.' concatenate the char to string characteristic
        while (numString[i] != '.') 
        {
          characteristic = characteristic + numString[i] ; 
          i++;
        }
        
        // while not '.' concatenate the char to string characteristic
        while (numString[i] < numString.length) 
        {
          numerator = numerator + numString[i] ; 
          i++;
        }
        
        // places after the decimal to get denominator
        int places = numerator.length(); 
        
        while(places !=0)
        {
            denominator = denominator + '0';
            
            places--;
        }
    }
   
    
   
    
    /* uses breakForConversion to break up a given char[] 
     * tests if the  String characteristic is correct format(able to cast as int)
     * stores String characteristic as int c and returns true if it is
     * Returns false if it is not
     */
    public boolean characteristic(char numString[], String charateristic)
    {
        
    return true;
    }

    /* uses breakForConversion to break up a given char[] 
     * tests if the  String numerator is correct format(able to cast as int)
     * stores String numerator as int n  and String denominator as int d  
     * returns true if valid format
     * Returns false if it is not
     */
    public boolean mantissa(char numString[], String numerator, int denominator)
    {
        
    return true;
    }
}