public class LargestNumber{
	public static void main(String[] args){
		int x=8, y=4, z=1;
		int res = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(res + " is the largest number.");
	}
}	