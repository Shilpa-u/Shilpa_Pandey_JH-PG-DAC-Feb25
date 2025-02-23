public class LargestNumber{
        public static void main(String[] args){
          int firstNumber = 12;
          int secondNumber = 45;
          int thirdNumber = 22;
            
         int largest = firstNumber;

         if (secondNumber > largest){
         largest = secondNumber;
         } 
         if (thirdNumber > largest){
         largest = thirdNumber;
         } 
         System.out.println("The largest number is :" + largest);
}
}