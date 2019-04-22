package bt1;
import java.util.Scanner;
public class Bt1 {
	private static Scanner scanner;
	public static void main(String[] args) {
	    int n;
	    String chuoi;
	    scanner = new Scanner(System.in);     
	    System.out.println("Nhập vào chuỗi bất kỳ: ");
	    chuoi = scanner.nextLine();
	    System.out.println("Nhập vào số nguyên: ");
	    n = scanner.nextInt();
	         
	    if (n < 2) {
	        System.out.println(chuoi);
	    } else {
	        for (int i = 0; i < n; i++) {
	            System.out.print(chuoi);    
	        }
	    }
		char grade = 'C';
		switch (grade)
			{	case 'A':
					System.out.println("Excellentl");
					break;
				case 'B':
				case 'C':
					System.out.println("Well done");
					break;
				case 'D':
					System.out.println("Your passed");
					break;
				case 'F':
					System.out.println("Better try again");
					break;
				default :
					System.out.println("Invalid grade");
			}
		System.out.println("Your grade is : "+ grade);
			}

}
