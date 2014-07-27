import java.util.Scanner;


public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner enterValues = new Scanner(System.in);
     
     
     System.out.println("enter first number");
     int number1 = enterValues.nextInt();
     
     
     System.out.println("enter second number");
     int number2 = enterValues.nextInt();
     
     
     
     System.out.println("enter third number");
     int number3 = enterValues.nextInt();
     
     
     System.out.println("enter fourth number");
     int number4 = enterValues.nextInt();
     
     
     
     int sum = number1 + number2 + number3 + number4;
     
     System.out.println("Sum :" +sum);
     
     
     
	}

}
