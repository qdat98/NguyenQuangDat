package main;
import java.util.Scanner;
public class Main {
	private static Scanner scanner;
	public static void main(String args[])
		{	byte x;
			scanner = new Scanner(System.in);
			System.out.print("x = ");
			x = scanner.nextByte();
			switch (x)
			{	case 1: System.out.println("Create employee "); 
						break;
				case 2: System.out.println("Show the existing employee");
						break;
				case 3:
						System.out.println("Exit");
			}
		}
}
