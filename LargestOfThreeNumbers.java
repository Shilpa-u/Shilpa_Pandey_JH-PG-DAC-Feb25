public class LargestOfThreeNumbers{
   public static void main(String[] args){
   int num1 = 20;
   int num2 = 30;
   int num3 = 10; 
   if (num1 >= num2 && num1 >= num3) { 
      System.out.println("The Largest number is: "+ num1 );
}
   else if (num2 >= num1 && num2 >= num3){
      System.out.println("The Largest number is: "+ num2 );
}
   else {
       System.out.println("The Largest number is: "+ num3 );
}
}
}
