package Employee;
public class Main 
{	public static void main(String args[])
	{	Employee[] employee = new Employee[5];
		/*
		job1 = new Job(1,"HR");
		 */
		Employee employee1 = new Employee("Nguyen Van A",1,3000,25,false,new Job(1,"HR"));
		Employee employee2 = new Employee("Nguyen Van B",2,4000,25,false,new Job(2,"BA"));
		Employee employee3 = new Employee("Nguyen Van C",3,5000,25,true,new Job(3,"Tester"));
		Employee employee4 = new Employee("Nguyen Van D",4,6000,25,true,new Job(4,"Developer"));
		Employee employee5 = new Employee("Nguyen Van E",5,7000,25,false,new Job(5,"CEO"));
		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;
		employee[3] = employee4;
		employee[4] = employee5;
		System.out.println("Mang co : " + employee.length + "  phan tu");
		System.out.println("ID  Name                Age  Salary      Job name");
		int i;
		for (i=0; i < employee.length; i++)
			{	employee[i].print();
			}
	}
	

}
