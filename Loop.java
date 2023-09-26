
public class Loop {

	public static void main(String[] args) {
		int [] arr = {25, 11, 7, 75, 56};  
		 int i = Integer.MIN_VALUE;
		for (int n: arr) {
			if (n>i) {
				i=n;
			}
		}
		System.out.println("Largest element is: " + i); 
		
	}

}
