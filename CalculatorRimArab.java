

package calculatorrimarab;
import java.io.IOException;
import java.util.Scanner;


public class CalculatorRimArab {

  
   public static void main(String[] args) throws IOException {
 
	Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение через пробел:");       	
        String rim = "MDCLXVI";
        String num1, oper , num2;
        String[] data = sc.nextLine().split(" ");
        num1 = data[0];
        oper = data[1];
        num2 = data[2];
        int one;
        int two;
        String resultarab;
        
  if       ((rim.indexOf(num1.charAt(0))!= -1) && (rim.indexOf(num2.charAt(0))!= -1)){
            ConvertRimToArab rimToArab = new ConvertRimToArab();
            ConvertRimToArab rimToArab1 = new ConvertRimToArab();
            one = rimToArab.arabConvert(num1);
            two = rimToArab1.arabConvert(num2);
            int operator = oper.charAt(0);
            ConvertArabToRim arabToRim = new ConvertArabToRim();
      
      if(operator == '+') {
          int result = one + two;
        resultarab = arabToRim.rimConvert(result);
        System.out.println(resultarab);
    } else if(operator == '-') {
        int result = one - two;
        resultarab = arabToRim.rimConvert(result);
        System.out.println(resultarab);
    } else if(operator == '*') {
        int result = one * two;
        resultarab = arabToRim.rimConvert(result);
        System.out.println(resultarab);
    } else if(operator == '/') {
        int result = one / two;
        resultarab = arabToRim.rimConvert(result);
        System.out.println(resultarab);
    } else {
        int result = one % two;
        resultarab = arabToRim.rimConvert(result);
        System.out.println(resultarab);
    }
            
            
        }
            
 else      {         
        int number1= Integer.parseInt(num1);
        int operator = oper.charAt(0);
        int number2 = Integer.parseInt(num2);
        
              
        if(operator == '+') {
        int result = number1 + number2;
        System.out.println(result);
    } else if(operator == '-') {
        int result = number1 - number2;
        System.out.println(result);
    } else if(operator == '*') {
        int result = number1 * number2;
        System.out.println(result);
    }
      else  if(operator == '/') {
     
        int result = number1 / number2; 
    
     System.out.println(result);
       }
        
     else {
        int result = number1 % number2;
        System.out.println(result); 
   }
    }
}
    
}
