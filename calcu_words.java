import java.util.Scanner;

public class calcu_words {
   
   public static void main (String[] args){
      
      
      //VARIABLES      
      int num1;
      int num2 = 0;
      
      String numWord1 = "";
      String numWord2 = "";
      String sign;
      String operator = "";
      String resetNow = "";  
      
      double result = 0;
      
      boolean reset = true;
      boolean valid = false;
      
      Scanner input = new Scanner(System.in); 
      
      //ALERT
      final String ALERT_INVALID_NUM = "You've entered an invalid number. Try again.\n";
      final String ALERT_INVALID_OPERATION = "You've entered an invalid operator. Try again.\n";
      final String ALERT_INVALID_ZERO = "Division by zero is not allowed. Try again.\n";
      
      
      do{
         do{
            
            /**************GET INPUTS*******************/
            
            //GET NUM1
            System.out.println("");
            System.out.println("Input first whole # (0-10) : ");
            num1 = input.nextInt();
            
            //GET OPERATION
            System.out.println("Select sign (+, -, *, /, ! ); ");
            input.nextLine();
            sign = input.nextLine();
            
            //GET NUM2 IF SAME SIGN
            if (!"!".equals(sign)){
               System.out.println("Input second whole # (1-10) : ");
               num2 = input.nextInt();
               input.nextLine();
            } else{
               break;
            }
            
            
            /**************TEST & ALERT FOR INVALID INPUT *******************/
            //NUM1 & NUM2
            if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10){
               System.out.println(ALERT_INVALID_NUM);
            }
            
            else if (num2==0){
               System.out.println(ALERT_INVALID_ZERO);
            }
            
            //OPERATION
            else if (!"+".equals(sign) && !"-".equals(sign) && !"*".equals(sign) && !"/".equals(sign) && !"!".equals(sign)){
               System.out.println(ALERT_INVALID_OPERATION);
            }
            
            //BREAK LOOP
            else {
               valid = true;
            }
            
         } while (valid==false);
         
         
         
         /**************CHANGE TO WORDS*******************/
         
         //NUMBERS
         switch (num1){
            case 0:
               numWord1 = "Zero";
               break;
            case 1:
               numWord1 = "One";
               break;
            case 2:
               numWord1 = "Two";
               break;
            case 3:
               numWord1 = "Three";
               break;   
            case 4:
               numWord1 = "Four";
               break;
            case 5:
               numWord1 = "Five";
               break;
            case 6:
               numWord1 = "Six";
               break;       
            case 7:
               numWord1 =" Seven";
               break;   
            case 8:
               numWord1 = "Eight";
               break;
            case 9:
               numWord1 = "Nine";
               break;
            case 10:
               numWord1 = "Ten";
               break; 
         }
         
         
         switch (num2){
            case 1:
               numWord2 = "one";
               break;
            case 2:
               numWord2 = "two";
               break;
            case 3:
               numWord2 = "three";
               break;   
            case 4:
               numWord2 = "four";
               break;
            case 5:
               numWord2 = "five";
               break;
            case 6:
               numWord2 = "six";
               break;       
            case 7:
               numWord2 =" seven";
               break;   
            case 8:
               numWord1 = "eight";
               break;
            case 9:
               numWord1 = "nine";
               break;
            case 10:
               numWord1 = "ten";
               break; 
         }
         
         /**************ASIGN WORDS & COMPUTATIONS*******************/
         
         //FACTORIAL
         if ("!".equals(sign)){
            operator = "factorial";
            result = num1;
            for (int i=1 ; i != num1 ; i++ ) { 
               result *= i;               
            }
            System.out.printf("RESULT: %s %s is %.0f\n", numWord1, operator, result);
         } 
         
         //NOT FACTORIAL
         else{
            switch (sign){
               case "+":
                  operator = "plus";
                  result = num1 + num2;
                  break;
               case "-":
                  operator = "minus";
                  result = num1 - num2;
                  break;
               case "*":
                  operator = "multiplied by";
                  result = num1 * num2;
                  break;
               case "/":
                  operator = "divided by";
                  result = (double)num1 / num2;
                  break;
            }
            System.out.printf("RESULT: %s %s %s is %.2f\n", numWord1, operator, numWord2.toLowerCase(), result); 
         }
         
         
         /**************CONTINUE OR NOT*******************/
         
         System.out.println("\nContinue? ('C' or 'c'): ");
         resetNow = input.nextLine();
         
         //EXIT MAIN LOOP
         if (!"C".equals(resetNow) && !"c".equals(resetNow)){
            reset=false; 
         }
         
      } while (reset == true); //MAIN LOOP BY DEFAULT 
      
   }
}

