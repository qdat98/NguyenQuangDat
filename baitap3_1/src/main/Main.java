package main;
import java.util.Scanner;
public class Main 
{
	private static Scanner scanner;
	public static void main(String[] args) {
	    int a,b;
	    scanner = new Scanner(System.in);     
	    System.out.println("Nhap vao hai so a b :");
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    System.out.println("a + b = " + (a+b));     
	    System.out.println("a - b = " + (a-b));   
	    System.out.println("a % b = " + (a%b));   
	    System.out.println("a / b = " + (a/b));   
	    System.out.println("a ++  = " + (a++));   
	    System.out.println("b --  = " + (b--)); 
	    String st = ( a > b) ? "a > b" : "a <= b";
	    System.out.println(st); 
	    if (a > b)
	    	{	System.out.println("a > b");	
	    	}
	    else 
	    	{ System.out.println("a <= b");
	    	}
	    
	    /*System.out.println("Please enter your name");
	    String st = scanner.nextLine();
	    System.out.print("Your full name is " + st);*/
	    System.out.println(check(a,b));
	}
	public static String check(int a,int b)
		{	return (a > b) ? "a > b" : "a <= b";
		}
	
}