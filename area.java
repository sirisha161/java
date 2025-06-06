import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius value:");
        double radius=scanner.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.printf("The area fo the circle with radius %.2f is: %.2f\n",radius,area);
        scanner.close();
    }
}