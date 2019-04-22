package dog;
public class Main 
{
	public static void main(String[] args)
	{	Cho a = new Cho("Lu"," Mau trang ","Cho co");
		a.print();
		a.vayduoi("Nhe nhang");
		a.an("Nhanh, thich an ca");
		a.sua("Gau gau");
		System.out.println();
	 	Cho b = new Cho("Cau vang ","Mau vang ","Cho nhat");
		b.print();
		a.vayduoi("Nhe nhang");
		a.an("Thich an thit");
		a.sua("Gau gau");
		System.out.println();
	 	Cho c = new Cho("Muc","Mau den ","Cho ta");
	 	c.print();
	 	a.vayduoi("Nhiet tinh");
		a.an("Thich an long lon");
		a.sua("Gau gau");	 	
	}
}
