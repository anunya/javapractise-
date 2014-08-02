//Method overloading : same name different no.of arguments
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(1,2,3,4);
add(11,23);
add(111,2,4);


	}
	
	private static void add(int number1, int number2, int number3, int number4) {
		int sum = number1 + number2 + number3 + number4;		
		System.out.println("Sum :  " + sum);

}
	private static void add(int number1, int number2) {
		int sum = number1 + number2;		
		System.out.println("Sum :  " + sum);
}
	private static void add(int number1, int number2, int number3) {
	int sum = number1 + number2 + number3;		
	System.out.println("Sum :  " + sum);
	
	}
}