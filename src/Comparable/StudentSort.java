package Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class StudentSort
{
	public static void main(String[] args)
	{
		Student s1=new Student(15,"Dinga",62.9);
		Student s2=new Student(20,"bheem",89.2);
		Student s3=new Student(3,"Kaaliya",27.8);
		LinkedList<Student> lst=new LinkedList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		Collections.sort(lst);
		for(Student st:lst)
		{
			System.out.println(st);
		}
	}
}
