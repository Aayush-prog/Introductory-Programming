import java.util.Scanner;
public class por{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter mark of 1st subject ");
        double m1=n.nextDouble();
        System.out.println("Enter mark of 2nd subject ");
        double m2=n.nextDouble();
        System.out.println("Enter mark of 3rd subject ");
        double m3=n.nextDouble();
        System.out.println("Enter mark of 4th subject ");
        double m4=n.nextDouble();
        double fm=(m1+m2+m3+m4)/4;
        if(fm<40.0){
            System.out.println("The student is fail");
        }else{
        System.out.println("The student is pass");}
        
        
    }
}