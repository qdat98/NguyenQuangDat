package baitap3_5;
import java.util.Scanner;
public class Main {
	public static Scanner scanner;
	public static void main(String args[])
	{	String ten,congviec;					
		int maso,tuoi;
		boolean kethon;
		double luong;
		int x,d,i=0;
		Employee[] employee = new Employee[i];
		scanner = new Scanner(System.in);
		System.out.print("Nhap so x ");
		x = scanner.nextInt();
		scanner = new Scanner(System.in);
		switch (x)
		{	case 1:	while (x!=0)
					{	
						
						System.out.print("Name : ");
						ten = scanner.nextLine();
						System.out.print("ID : ");
						maso = scanner.nextInt();
						System.out.print("Salary : ");
						luong = scanner.nextDouble();
						System.out.print("Age : ");
						tuoi = scanner.nextInt();
						System.out.print("Married : ");
						kethon = scanner.nextBoolean();
						System.out.print("Job : ");
						congviec = scanner.nextLine();	
						System.out.println("");
						System.out.println("");
						System.out.println("Nhap 0 neu muon thoat");
						x = scanner.nextInt();
						i++;
						Employee employeei = new Employee(ten,maso,luong,tuoi,kethon,congviec);
						employee[i-1] = employeei;
						if (x==0)
							{	Employee.menu();
								System.exit(0);
							}
						i++;
					}
					System.out.print("Nhap so x ");
					x = scanner.nextInt();
			case 2: System.out.println("Mang co : " + employee.length + "  phan tu");
					System.out.println("ID  Name                Age  Salary      Job name");
					for (d=0; d < i; d++)
					{	employee[d].print();
					}
			case 3:	System.exit(0);
		}
				
		}
}

