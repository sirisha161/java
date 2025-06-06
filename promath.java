import java.util.Scanner;
class Mathop{
    protected int number;
    protected void setNumber(int num){
        number=num;
    }
    protected int square(){
       return number*number; 
    }
    protected int cube(){
        return number*number*number;
    }
}
class Result extends Mathop{
    public void calc(){
        System.out.println("Square :"+ square());
        System.out.println("Cube :"+ cube());
    }
}
public class promath{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Result obj=new Result();
        System.out.println("Enter the number");
        int input=sc.nextInt();
        obj.setNumber(input);
        obj.calc();
    }
}