package baitap3_5;
public class Employee {
	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married;
	public String job;
	Employee(String name,int id,double salary,int age,boolean married,String job)
	{	this.name = name;
		this.id=id;
		this.salary = salary;
		this.age=age;
		this.job= job;
	}
	public static void menu()
	{	System.out.println("Menu chinh ");
		System.out.println("1: Create employee ");
		System.out.println("2: Show the existing employee ");
		System.out.println("3: Exit ");
	}
	public void print()
	{	
		System.out.println(id+"   "+ name+"        "+age+"   "+salary+"       "+job);
	}
	
}
