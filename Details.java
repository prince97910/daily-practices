//to  add student details using collections 
import java.util.*;
class Student
{
	int sid;
	String sname;
	String gname;
	Student(int sid,String sname,String gname)
	{
		this.sid=sid;
		this.sname=sname;
		this.gname=gname;
	}


}
class Details
{
	public static void main(String[] args)
	{
		Student s1=new Student(3,"siva","ece");
		Student s2=new Student(2,"manoj","eee");
		Student s3=new Student(1,"surya","ece");
		Student s4=new Student(4,"vamsi","cse");
		Student s5=new Student(5,"rakesh","ece");
		Student s6=new Student(5,"nea","eee");
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);

		System.out.println("the student are in colledge are:");
		for(Student st:a1)
		{
			System.out.println(st.sid + "\t" + st.sname +"\t"+st.gname);
		}
	}
}