import java.util.Scanner;
public class PE{
    public static void main(String args[]){
        Scanner l=new Scanner(System.in);
        System.out.println("Enter mass in kg");
        double m=l.nextDouble();
        System.out.println("Enter height ");
        double h=l.nextDouble();
        double p=m*9.8*h;
        System.out.println("The PE is;"+p);
        
        
    }
}