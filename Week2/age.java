import java.util.Scanner;
public class age{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Input your age");
        int n=x.nextInt();
        if (n<=10){
            System.out.println("Children");
        }else if (n<=50){
            System.out.println("Adult");
        }else{
            System.out.println("Old Age");
        }
    }
}