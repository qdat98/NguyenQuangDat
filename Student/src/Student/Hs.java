/**
 * 
 */
/**
 * @author OS
 *
 */
package Student;
public class Hs
{	public String name;
	public String gender;
	public String age;
	Hs(String name, String gender, String age)
	{	this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public void print()
	{	System.out.println("Ten " + name);
		System.out.println("Gender " + gender);
		System.out.println("Age " + age);
		System.out.println();
	}
}