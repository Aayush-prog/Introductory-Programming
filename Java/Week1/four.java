import java.util.Scanner;
public class four{
    public static void main(String arg[]){
        Scanner len=new Scanner(System.in);
        System.out.println("Length of wall:");
        double l1=len.nextDouble();
        System.out.println("Breadth of wall:");
        double b1=len.nextDouble();
        System.out.println("Height of wall:");
        double h1=len.nextDouble();
        double a1=2*(l1+b1)*h1;
        System.out.println("Area of 4 walls:"+a1);

        
    }
}