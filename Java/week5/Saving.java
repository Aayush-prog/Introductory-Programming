import java.util.*;
class Saving{
    void interest(double p, double t, double r){
        double si= (p*t*r)/100;
        System.out.println("The interest is:"+si);
    }
    public static void main(String[] args){
        Saving m= new Saving();
            Scanner x= new Scanner(System.in);
            System.out.println("Input principal:");
            double p=x.nextDouble();
            System.out.println("Input time:");
            double t=x.nextDouble();
            System.out.println("Input rate:");
            double r=x.nextDouble();
            m.interest(p,t,r);
        }
    }
