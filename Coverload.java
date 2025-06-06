import java.util.Scanner;
class Student{
    String name;
    int roll;
    String grade;
    Student(){
        name="Unknown";
        roll=0;
        grade="Not Assigned";
    }
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
        grade="Not Assigned";
    }
    Student(String name, int roll, String grade){
        this.name=name;
        this.roll=roll;
        this.grade=grade;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Grade: "+grade);
    } 
}
public class Coverload{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.display();
        System.out.println("\n Enter name: ");
        String name=sc.nextLine();
        System.out.println(" Enter Roll: ");
        int roll=sc.nextInt();
        System.out.println("Enter grade: ");
        
    }
}