public class Q02{
public static void main(String args[]){
     int arr = {1,2,3,4,5,6};
	 
	 //call the function to reverse the array
	 reverseArray(arr);
	 
	 //output the reversed array
	System.out.println("Reversed Array: ");
	 for(int i = 0; i < arr.length; i++);
         System.out.println(arr[i] + " ");
}
}		 
      // method to reverse the array in place
	  public static void reverseArray(int[] arr) {
	     int left = 0;  // starting from the first element
		 int right = arr.length - 1;  //stating from the last element
		 
		        // Iterate and swap elements until left pointer is less than right pointer
		 while (left < right) {
		
                // Swap the elements at the left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

                 // Move the pointers towards the center
            (left++);
            (right--);
        }
    }
}
		 