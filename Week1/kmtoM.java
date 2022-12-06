import java.util.Scanner;
public class kmtoM{
    public static void main(String args[]){
        Scanner len=new Scanner(System.in);
        System.out.println("Input distance in km");
        Double l=len.nextDouble();
        Double m=l*0.621;
        System.out.println("The distance in mile is:"+m);
        
        
        
    }
}