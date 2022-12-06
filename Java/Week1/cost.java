import java.util.Scanner;
public class cost{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter cost per area in Rs");
        double p=x.nextDouble();
        System.out.println("Enter total area of walls");
        double a=x.nextDouble();
        double tp=a*p;
        System.out.println("Total price is Rs "+tp);
    }
}