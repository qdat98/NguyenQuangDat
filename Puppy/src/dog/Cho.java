/**
 * 
 */
/**
 * @author OS
 *
 */
package dog;
public class Cho
{	public String name;
	public String color;
	public String breed;
	Cho(String name, String color, String breed)
	{	this.name= name;
		this.color= color;
		this.breed= breed;
	}
	public void vayduoi(String vayduoi)
	{	System.out.println("Vay duoi   " + vayduoi);
	}
	public void sua(String sua)
	{	System.out.println("Sua        " + sua);
	}
	public void an(String an)
	{	System.out.println("An         " + an);
	}
	public void print()
	{	System.out.println("Name       " + name );
		System.out.println("Color      " + color );
		System.out.println("Breed      " + breed );
	}
}
