package inheristance1package;

class School {
	void schoolName() {
		System.out.println("Nagarjuna High School");
	}
}

class Teacher extends School {
	void teach() {
		System.out.println("Teacher teaches science.");
	}
}

class Student extends School {
	void classStudying() {
		System.out.println("Student is in 8th standard");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.schoolName(); // Output: Nagarjuna High School
		teacher.teach(); // Output: Teacher teaches science

		Student student = new Student();
		student.schoolName(); // Output: Nagarjuna High School
		student.classStudying(); // Output: Student is in 8th standard
	}
}
