package Comparable;
public class Student implements Comparable<Student>
{
	public int id;
	public String name;
	public double perc;
	Student(int id, String name, double perc)
	{
		this.id=id;
		this.name=name;
		this.perc=perc;
	}
	@Override
	public int compareTo(Student s)
	{
		if(this.perc==s.perc)
			return 0;
		if(this.perc>s.perc)
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}
	
	/*@Override
	public int compareTo(Student s)
	{
		int res=this.name.compareToIgnoreCase(s.name);
		//int res = this.name.compareTo(s.name);
		return res; //For Ascending
		//return res*(-1); //For Descending
	}*/
	
	/*@Override
	public int compareTo(Student s)
	{
		if(this.id==s.id)
			return 0;
		if(this.id>s.id)
			return 1;
		else
			return -1;
	}*/
}
