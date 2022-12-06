import java.util.Scanner;
public class buzz{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Input number");
        int n=x.nextInt();
        if (n%7==0){
            System.out.println("It is a buzz number.");
        }else{
            System.out.println("It is not a buzz number.");
        }
    }
}