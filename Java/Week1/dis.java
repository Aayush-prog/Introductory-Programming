import java.util.Scanner;
public class dis{
    public static void main(String args[]){
        Scanner i=new Scanner(System.in);
        System.out.println("Input initial velocity");
        double u=i.nextDouble();
        System.out.println("Input acceleration");
        double a=i.nextDouble();
        System.out.println("Input time in seconds");
        double t=i.nextDouble();
        double d=u*t+(1/2)*a*t*t;
        System.out.println("The distance is"+d+"m");
        
        
    }
}