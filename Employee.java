package Employee;
public class Employee
{	private String name;
	private int id;
	private double salary;
	private int age;
	private boolean married;
	private Job	job;
	public Employee(String name,int id,double salary,int age,boolean married,Job job)
		{	this.name = name;
			this.id=id;
			this.salary = salary;
			this.age=age;
			this.job= job;
		}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public boolean getMarried() {
		return married;
	}
	public Job getJob() {
		return job;
	}
	public void print()
	{	
		System.out.println(getId()+"   "+ getName()+"        "+getAge()+"   "+getSalary()+"       "+getJob().getName());
	}
	
	
	
	
}