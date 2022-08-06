import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}
		else if(age>st.age) {
			return 1;
			
		}
		else
			return -1;
	}
}
public class ComparableExample {
	public static void main(String[] args) {
	Student s1 = new Student(21, "Ronyy");
	Student s2 = new  Student(5, "tuku");
	ArrayList<Student> stu = new ArrayList();
	stu.add(s1);
	stu.add(s2);
	for(Student s: stu) {
		System.out.println(s.age +" "+s.name);
	}
	
	Collections.sort(stu);
	for(Student s: stu) {
		System.out.println(s.age +" "+s.name);
	}
}
	}
