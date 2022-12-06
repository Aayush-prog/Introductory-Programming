import java.util.Scanner;
public class marks{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Input marks of 1st subject");
        int a=x.nextInt();
        System.out.println("Input marks of 2nd subject");
        int b=x.nextInt();
        System.out.println("Input marks of 3rd subject");
        int c=x.nextInt();
        System.out.println("Input marks of 4th subject");
        int d=x.nextInt();
        System.out.println("Input marks of 5th subject");
        int e=x.nextInt();
        int fm=a+b+c+d+e;
        double p=fm/5;
        double g=(p/100)*4;
        System.out.println("Your full marks is "+fm+", percentage is "+p+" and grade is "+g);
    }
}