package OOP;

public class Student {
	int id;
	float marks;
	
	public Student(int i, float m){
		id = i;
		marks = m;
	}
	public void displayGrade(){
		
		if(marks >= 90)
			System.out.println(" Excellent ");
		else if(marks >= 80)
			System.out.println(" Very good ");
		else if(marks >= 70)
			System.out.println(" Good ");
		else if(marks >= 60)
			System.out.println(" Average ");
		else if(marks >= 40)
			System.out.println(" Pass ");
		else
			System.out.println(" Fail ");
	}

}
