import java.util.Scanner;

public class Addition {
	
	//int a,b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first integer :");
		
		int a = sc.nextInt();
		
		System.out.println("Please enter second integer :");
		
		int b = sc.nextInt();
		
		c=  a-(-b);
		
		System.out.println("The Sum of "+a+" and "+b+" is : "+c);

	}
	

}
