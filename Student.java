package week1.day1;

public class Student 
{	
	String studentName;
	int studentRollNumber;
	public static void main(String[] args) 
	{
	Student stud = new Student();
	stud.studentName = "Scofield";
	stud.studentRollNumber = 202207710;
	
	}
public void college() 
	{
	int collegeCode = 2120;
	String collegeName = "ABC college of engineering";
	System.out.println(collegeCode);
	System.out.println(collegeName);
	studentDetail();
	}
private void studentDetail() 
	{
	System.out.println(studentName);
	System.out.println(studentRollNumber);	
	}
}
