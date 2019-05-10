package Employee;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class ManageEmployee1 implements Employee1{
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	public static Set<Employee> employees = new HashSet<Employee>();
	public static boolean isEndProgram = false;
	Iterator<Employee> employee = employees.iterator();
	
	public static void main(String[] args) {
	showMenu();
	System.out.println("The program end!!!");
	}
	//showMenu
	public static void showMenu() {
	ManageEmployee1 employee1 = new ManageEmployee1();
	do {
		if (isEndProgram) {
			break;
		}
		System.out.println("Choose one numbers below : ");
		System.out.println("1: Create  new Employees");
		System.out.println("2: Show the existing Employees");
		System.out.println("3: exit");
		System.out.println("4: Search Employee");
		System.out.println("5:Update Emloyee");
		System.out.println("-------------------------------");
		System.out.println("Type your input number : ");
		inputNumber = scanner.nextInt();
		switch (inputNumber) {
		case 1:
			employee1.addEmployee();
			askForContinue();
			break;
		case 2:
			if (employees != null && employees.size() > 0) {
				employee1.showEmployee();
			} else {
				System.out.println("Please add new employee first!");
				System.out.println("-------------------------------");
			}
			askForContinue();
			break;
		case 3:
			break;
		case 4:
			System.out.println("Please input name to search : ");
			String nameInput = scanner.next();
			Employee employee = employee1.searchByName(nameInput);
			System.out.println("-----Thong tin tim kiem --------");
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
			askForContinue();
			break;
		case 5:
			System.out.println("Please input name to update : ");
			String nameInputUpdate = scanner.next();
			System.out.println("Please input new salary : ");
			double newSalary = scanner.nextDouble();
			employee1.updateEmployeeByName(nameInputUpdate, newSalary);
			askForContinue();
			break;
		default:
			System.out.println("your input number is wrong, please input again!");
			System.out.println("-------------------------------");
			showMenu();
		}

	} while (inputNumber != 3);
}
	//addEmployee
	@Override
	public void addEmployee() {
		Employee employee1 = new Employee("Nguyen Van A",1,3000,25,false,new Job(1,"HR"));
		Employee employee2 = new Employee("Nguyen Van B",2,4000,25,false,new Job(2,"BA"));
		Employee employee3 = new Employee("Nguyen Van C",3,5000,25,true,new Job(3,"Tester"));
		Employee employee4 = new Employee("Nguyen Van D",4,6000,25,true,new Job(4,"Developer"));
		Employee employee5 = new Employee("Nguyen Van E",5,7000,25,false,new Job(5,"CEO"));
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);	
}
	//showEmployee
	@Override
	public void showEmployee() {
	System.out.println("----------------List of employee-----------");
	System.out.println("ID  Name                Age  Salary      Job name");
	while (employee.hasNext()) {
		employee.next().print();
	}
}
	//searchByName
	@Override
	public Employee searchByName(String nameInput) {
	// TODO Auto-generated method stub
		Employee employeess = null;
		while (employee.hasNext()) {
		if (nameInput.equals(((Employee) employees).getName())) {
			employeess = ((Employee) employees);
			break;
		}
	}
	return employeess;
}
	//updateEmployeeByName
	@Override
	public void updateEmployeeByName(String nameInput, Double newSalary) {
	// TODO Auto-generated method stub	
	for (int i = 0; i< employees.size(); i++) {
		if (nameInput.equals(((Employee) employees).getName())) {
			((Employee) employees).setSalary(newSalary);
			break;
		}
	}
}
	//askForContinue
	public static void askForContinue() {
	System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
	int inputNo = scanner.nextInt();
	switch (inputNo) {
	case 0:
		showMenu();
		break;
	case 3:
		isEndProgram = true;
		break;
	default:
		break;
	}
	
}
	/*public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	public static void showMenu() {
		ManageEmployee1 employee1 = new ManageEmployee1();
		do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: exit");
			System.out.println("4: Search Employee");
			System.out.println("5:Update Emloyee");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				employee1.addEmployee();
				askForContinue();
				break;
			case 2:
				if (employees != null && employees.length > 0) {
					showMenu();
				} else {
					System.out.println("Please add new employee first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Please input name to search : ");
				String nameInput = scanner.next();
				Employee employee = employee1.searchByName(nameInput);
				System.out.println("-----Thong tin tim kiem --------");
				System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
				askForContinue();
				break;
			case 5:
				System.out.println("Please input name to update : ");
				String nameInputUpdate = scanner.next();
				System.out.println("Please input new salary : ");
				double newSalary = scanner.nextDouble();
				employee1.updateEmployeeByName(nameInputUpdate, newSalary);
				askForContinue();
				break;
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 3);
	}
	@Override
	public void addEmployee() {
		System.out.println("How many employee you want to create? : ");
		employeeNo = scanner.nextInt();
		employees = new Employee[employeeNo];
		for (int i = 0; i < employeeNo; i++) {
			System.out.println("Please input the information of employee[" + (i+1) + "] : ");
			System.out.println("Name : ");
			String name = scanner.next();
			System.out.println("Salary : ");
			double salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			Employee employee = new Employee(name, i + 1, salary, age, true, new Job(i + 1, jobName));
			employees[i] = employee;
		}
	}
	@Override
	public void showEmployee() {
		System.out.println("----------------List of employee-----------");
		System.out.println("ID  Name                Age  Salary      Job name");
		for (int i = 0; i < employees.length; i++) {
			employees[i].print();
		}
	}
	@Override
	public Employee searchByName(String nameInput) {
		// TODO Auto-generated method stub
		Employee employee = null;
		for (int i = 0; i< employees.length; i++) {
			if (nameInput.equals(employees[i].getName())) {
				employee = employees[i];
				break;
			}
		}
		return employee;
	}
	@Override
	public void updateEmployeeByName(String nameInput, Double newSalary) {
		// TODO Auto-generated method stub	
		for (int i = 0; i< employees.length; i++) {
			if (nameInput.equals(employees[i].getName())) {
				employees[i].setSalary(newSalary);
				break;
			}
		}
	}
	public static void askForContinue() {
		// TODO Auto-generated method stub
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
		
	}*/
}
