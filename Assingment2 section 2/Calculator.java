public class Calculator{
    public static void main(String[] args){
         double num1 = 10;
         double num2 = 5;
         char operator = '/';
         
          double result;

         switch (operator) {

         case '+':
         result = num1 + num2;
         System.out.println("Result: " + num1 + " + " + num2 + " = " + result);

         break;
  
         case '-':
         result = num1 - num2;
         System.out.println("Result: " + num1 + " - " + num2 + " = " + result);

         break;
         
         case '*':
         result = num1 * num2;
         System.out.println("Result: " + num1 + " * " + num2 + " = " + result);

         break;

         case '/':
          if (num2 == 0){
          System.out.println("Error: Division by zero is not allowed");
}
           else{
             result = num1 / num2;
             System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
}
           break;

     default:
          System.out.println("Error: Invalid operator");
           break;
}
}
}
           


         
        
         


       