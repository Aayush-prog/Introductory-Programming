import java.util.Scanner;
public class volume{
    public static void main(String args[]){
        Scanner radius=new Scanner(System.in);
        System.out.println("Enter the radius of sphere in m");
        double r=radius.nextDouble();
        double v=(4/3)*3.14*(r*r*r);
        System.out.println("The volume of sphere is:" + v+" m^3");
        
        
        
        
        
    }
}
