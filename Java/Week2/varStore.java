import java.util.Scanner;
public class varStore{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Input last name");
        String last_name=x.nextLine();
        System.out.println("Input age");
        int age=x.nextInt();
        System.out.println("Input temperature");
        float current_temperature=x.nextFloat();
    }
}