import java.util.Scanner;
public class tsaVCuboid{
    public static void main(String args[]){
        Scanner len=new Scanner(System.in);
        System.out.println("Input length");
        double l=len.nextDouble();
        System.out.println("Input breadth");
        double b=len.nextDouble();
        System.out.println("Input height");
        double h=len.nextDouble();
        double v=l*b*h;
        double tsa=2*(l*b+b*h+l*h);
        System.out.println("The volume is "+v);
        System.out.println("The tsa is "+tsa);
        
        
        
    }
    
}