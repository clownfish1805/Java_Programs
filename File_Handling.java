import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


class Student {
    public String name;
    public int age;
    public int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Student> myList = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = inp.nextInt();
        inp.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student details:");

            System.out.println("Name: ");
            String name = inp.nextLine();

            System.out.println("Age: ");
            int age = inp.nextInt();
            inp.nextLine();

            System.out.println("Grade: ");
            int grade = inp.nextInt();
            inp.nextLine();

            // Create a new Student object and add it to the list
            Student student = new Student(name, age, grade);
            myList.add(student);
        }

        // Save data without function
        try {
            FileWriter writing = new FileWriter("saveData.txt");
            for (Student i : myList) {
                writing.write("Name: " + i.getName() + ", Age: " + i.getAge() + ", Grade: " + i.getGrade() + "\n");
            }
            writing.close();
            System.out.println("Wrote Successfully");
        } catch (IOException e) {
            System.out.println("Error");
        }

        // Read and display 
        try {
            FileReader fileReader = new FileReader("saveData.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Details : ");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file");
        }
    }
}

