import java.util.Scanner;
public class apRec{
    public static void main(String args[]){
        Scanner i=new Scanner(System.in);
        System.out.println("Input length");
        double l=i.nextDouble();
        System.out.println("Input breadth");
        double b=i.nextDouble();
        double a=l*b;
        double p=2*(l+b);
        System.out.println("The area is "+a+" and perimeter is "+p);
    }
}