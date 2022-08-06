import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}
class AgeComparator implements Comparator<Student>{
	int age;
	String name;
	
	public int compare(Student s1, Student s2) {
		if(s1.age > s2.age)
			return 1;
		else if(s1.age<s2.age)
			return -1;
		return 0;
	}
}

class NameComparator implements Comparator<Student>{
	int age;
	String name;
	
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(23,"Vijay"));  
		al.add(new Student(27,"Ajay"));  
		al.add(new Student(21,"Jai"));  
		  
		System.out.println("Sorting by Name");  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student st: al){  
		System.out.println(st.name+" "+st.age); 
		}
		
		System.out.println("Sorting by Age");  
		Collections.sort(al,new AgeComparator());  
		//Traversing the elements of list  
		for(Student st1: al){  
		System.out.println(st1.name+" "+st1.age); 
		}
	}
}
