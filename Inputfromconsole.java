package pavan;
import java.util.*;  // here star indicate import all the class here we import scanner class , present in util package;

public class Inputfromconsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hello, please enter your name");
		String name =sc.nextLine();
		System.out.println("welcome,"+name);
		System.out.println("please enter your age Mr."+name);
		int age = sc.nextInt();
		System.out.println("Thankyou ");
		
		
		
		//scanner is class and we need to create a object for that class , here we create a "sc" as a object 
		
	
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		 int c = a+b;
		System.out.println("Sum of a+b="+c);
		
	
		System.out.println("Enter the value");
     	int value = sc.nextInt();
		if(value%2==0) {
		System.out.println("It is a even number");}
		else{
			
		System.out.println("It is a odd number");
		}
		

		
	}

}
