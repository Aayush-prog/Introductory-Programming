import java.util.Scanner;
public class poOrNeg{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Input number");
        int n=x.nextInt();
        if (n>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}