import java.util.Scanner;


public class creatingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		for (int first=1; first<=30;first++){
			System.out.print("+");
		  System.out.println("");
		  
		  Scanner readValues= new Scanner (System.in);
		  System.out.println("enterpotatoprice");
		  double potatoprice= readValues.nextDouble();
		  
		  System.out.println("noofkgspotatospuchased");
		  double noofkgspotatos=readValues.nextDouble();
		  
		  System.out.println("entertomatoprice");
		  double tomatoprice=readValues.nextDouble();
		  
		  
		  System.out.println("noofkgstomatospurchased");
		  double noofkgstomatos=readValues.nextDouble();
		  

		double totalBill = potatoprice*noofkgspotatos+tomatoprice*noofkgstomatos;
		
		
		
		first = printplussymbol(first);
		
		System.out.println("Total bill : " + totalBill);
		
		
		first = printplussymbol(first);
		
		}
	}

	private static int printplussymbol(int first) {
		for(int First=1; first<=30;first++);
		System.out.print("+");
		System.out.println("");
		return first;
	}

}
