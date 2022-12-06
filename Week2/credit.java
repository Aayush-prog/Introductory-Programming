import java.util.Scanner;
public class credit{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Input credits earned");
        double y=x.nextDouble();
        if (y>=90){
            System.out.println("Senior");
        }else if(y>=60){
            System.out.println("Junior");
        }else if(y>=30){
            System.out.println("Sophomore");
        }else{
            System.out.println("Freshman");
        }
    }
}