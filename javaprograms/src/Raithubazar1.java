import java.util.Scanner;


public class Raithubazar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner readValues = new Scanner(System.in);
     
     
     for(int first=1; first<=20; first++);
     System.out.println("+");
     
     
     
     System.out.println("enterpotatoprice");
     double potatoprice = readValues.nextDouble();
     
     System.out.println("enternoofkgspotatos");
     double noofkgspotatos = readValues.nextDouble();
     
    
     System.out.println("entertomatoprice");
     double tomatoprice = readValues.nextDouble();
     
     
     System.out.println("enternoofkgstomatos");
     double noofkgstomatos = readValues.nextDouble();
     
     double totalBill = potatoprice*noofkgspotatos+tomatoprice*noofkgstomatos;
     
     System.out.println("Total bill :" + totalBill);
     
     
     
	}

}
