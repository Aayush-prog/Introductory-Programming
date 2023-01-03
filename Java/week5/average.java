import java.util.*;
class average{
     double av(double a, double b, double c){
        double s=(a+b+c)/3;
        return s;
    }
    public static void main(String[] args){
        average x=new average();
        Scanner z=new Scanner(System.in);
        System.out.println("Enter number:");
        double a=z.nextDouble();
        System.out.println("Enter number:");
        double b=z.nextDouble();
        System.out.println("Enter number:");
        double c=z.nextDouble();
        System.out.println("The average is:"+x.av(a,b,c));
    }
    
}
    
