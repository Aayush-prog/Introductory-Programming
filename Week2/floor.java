import java.util.Scanner;
public class floor{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Input floor");
        int n=x.nextInt();
        if (n>13){
            System.out.println("Not actual floor");
        }else{
            System.out.println("Actual floor");
        }
    }
}