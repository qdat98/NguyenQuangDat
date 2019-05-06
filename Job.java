package Employee;

public class Job 
{
		private String name;
		private int id;
		public Job(int id,String name)
			{	this.id = id;
				this.name = name;
			}
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}
	
}
