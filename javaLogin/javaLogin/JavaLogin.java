package javaLogin;
import java.util.Scanner;

public class JavaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int correctPassword = 6789;
		String correctUsername="Jemimah";
		
		Scanner data= new Scanner(System.in);	
		
		for(int attempts=1; attempts<=3; attempts++) {
			System.out.println("Attempt " + attempts + ":Enter your username");
			String username = data.nextLine();
		
		System.out.println("enter password");
		int password = data.nextInt();
	      data.nextLine();
		
		if(username.equals(correctUsername) && password ==correctPassword) {
			System.out.println("Login successful!");
			break;
		}else { 			
			System.out.println("wrong credentials ");
		}
		   if (attempts == 3) {
               System.out.println("Maximum attempts reached. Try again later.");
           }
		}
	
		
		
	}

}
