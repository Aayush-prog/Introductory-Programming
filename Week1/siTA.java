import java.util.Scanner;
public class siTA{
    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
        System.out.println("Input Principle");
        double p=m.nextDouble();
        System.out.println("Input Time in years");
        double t=m.nextDouble();
        System.out.println("Input Rate");
        double r=m.nextDouble();
        double si=(p*t*r)/100;
        double ta=si+p;
        System.out.println("The SI is"+si);
        System.out.println("The total amount is"+ta);
        
    }
}