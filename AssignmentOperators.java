public class AssignmentOperators{
    public static void main(String[] args) {
        // Initialize two integers
        int num1 = 10;
        int num2 = 5;
	                                                                                   
        System.out.println("Initial values: num1 = " + num1 + ", num2 = " + num2);         // Display initial values

        // Using the '=' assignment operator
               num1 = num2;
               System.out.println("\nAfter num1 = num2: num1 = " + num1 + ", num2 = " + num2);

        // Using the '+=' assignment operator (num1 += num2 means num1 = num1 + num2)
                num1 += num2;
                System.out.println("\nAfter num1 += num2: num1 = " + num1 + ", num2 = " + num2);

        // Using the '-=' assignment operator (num1 -= num2 means num1 = num1 - num2)
                num1 -= num2;
                System.out.println("\nAfter num1 -= num2: num1 = " + num1 + ", num2 = " + num2);

        // Using the '*=' assignment operator (num1 *= num2 means num1 = num1 * num2)
                 num1 *= num2;
                 System.out.println("\nAfter num1 *= num2: num1 = " + num1 + ", num2 = " + num2);

        // Using the '/=' assignment operator (num1 /= num2 means num1 = num1 / num2)
                  num1 /= num2;
                  System.out.println("\nAfter num1 /= num2: num1 = " + num1 + ", num2 = " + num2);	
		
		 // Using the '%=' assignment operator (num1 %= num2 means num1 = num1 % num2)
                     num1 %= num2;
                    System.out.println("\nAfter num1 %= num2: num1 = " + num1 + ", num2 = " + num2);
    }
}