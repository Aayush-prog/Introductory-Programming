import java.util.Scanner;
public class obp{
    public static void main(String arg[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter amount of pen");
        int pe=x.nextInt();
        System.out.println("Enter amount of pencil");
        int p=x.nextInt();
        System.out.println("Enter amount of copy");
        int c=x.nextInt();
        System.out.println("Enter price of pen in Rs");
        double pe1=x.nextDouble();
        System.out.println("Enter price of pencil in Rs");
        double p1=x.nextDouble();
        System.out.println("Enter price of copy in Rs");
        double c1=x.nextDouble();
        double ta=(pe*pe1)+(p*p1)+(c*c1);
        System.out.println("The total amount is Rs "+ta);
        
    }
}