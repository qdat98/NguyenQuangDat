package Employee;
public class Employee
{	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married;
	public Job	job;
	Employee(String name,int id,double salary,int age,boolean married,Job job)
		{	this.name = name;
			this.id=id;
			this.salary = salary;
			this.age=age;
			this.job= job;
		}
	public void print()
	{	
		System.out.println(id+"   "+ name+"        "+age+"   "+salary+"       "+job.name);
	}
	
	
	
	
}