import java.util.Scanner;
public class porLper{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter CP in Rs");
        double cp=x.nextDouble();
        System.out.println("Enter SP in Rs");
        double sp=x.nextDouble();
        if(sp>cp){
            double p=((sp-cp)/cp)*100;
            System.out.println("The profit percentage is "+p);
        }else {
            double l=((cp-sp)/cp)*100;
            System.out.println("The loss percentage is "+l);
        }
    }
}