import java.util.Scanner;
import java.lang.Math;
public class aTriangle{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter length of first side");
        double l1=x.nextDouble();
        System.out.println("Enter length of second side");
        double l2=x.nextDouble();
        System.out.println("Enter length of third side");
        double l3=x.nextDouble();
        double s=(l1+l2+l3)/2;
        double a=(s*(s-l1)*(s-l2)*(s-l3));
        System.out.println("The are of triangle is "+ Math.sqrt(a));
    }
}