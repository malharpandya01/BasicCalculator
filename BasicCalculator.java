package basiccalculator;

import java.util.Scanner;
import java.util.Formatter;

/**
 *
 @developer Malhar Pandya
 This calculator can do basic operations of two numbers (multiplication, division, addition, and subtraction.) 
 */
public class BasicCalculator {


    public static void main(String[] args) {
      
        Scanner usrInput = new Scanner (System.in);
        double fNum, sNum, answer;
        char operation;
        
        System.out.print("Enter first number: ");
        fNum = usrInput.nextDouble();
        
        System.out.print("Enter operation sign: ");
        operation = usrInput.next().charAt(0);
        
        System.out.print("Enter second number: ");
        sNum = usrInput.nextDouble();
        
        if (operation == '+')
            {
                answer = fNum + sNum;
            }
            
            else if (operation == '-')
                {
                    answer = fNum - sNum;
                }
        
            else if (operation == '*')
                {
                    answer = fNum * sNum;
                }
            
            else if (operation == '/')
                {
                    answer = fNum / sNum;
                }
        
        else 
            {
                System.out.print("Error");
                return;
            }
        
        System.out.printf("Answer: %f", answer);
        
    }
    
}
