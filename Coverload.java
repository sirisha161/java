import java.util.Scanner;
class Student{
    String name;
    int roll;
    String grade;
    // constructor -1 no args 
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
    //constructor -3 3-args
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
         sc.nextLine();
         Student s2= new Student();
        s2.display();
        System.out.println("\n Enter name: ");
        String name2 = sc.nextLine();
        System.out.println(" Enter Roll: ");
        int roll2=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter grade: ");
         String grade = sc.nextLine();
         Student s3= new Student();
         s3.display();
    }
}
