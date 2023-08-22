import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
class Student{
    public String name;
    public int age;
    public int grade;
     public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getGrade(){
        return grade;
    }
}
public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> myList = new ArrayList<>();
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter no of students");
		int n=inp.nextInt();
		inp.nextLine();
		for(int i=0;i<n;i++){
		    System.out.println("Enter Student details:");
		    
		    System.out.println("Name: ");
		    String name=inp.nextLine();
		    
		    System.out.println("Age: ");
		    int age=inp.nextInt();
		    inp.nextLine();
		    
		    System.out.println("Grade: ");
		    int grade=inp.nextInt();
		    inp.nextLine();
		    
		 
    
    myList.add(new Student(name,age,grade));
		}
		System.out.println("Student Details : ");
		for(Student i : myList){
		  //  System.out.println(i.getName()+","+i.getAge()+","+i.getGrade());
		  System.out.println("Name: " + i.getName() + ", Age: " + i.getAge() + ", Grade: " + i.getGrade());
		}
	}
}

