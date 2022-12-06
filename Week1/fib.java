import java.util.Scanner;
public class fib{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter nth term");
        int n=x.nextInt();
        int a=0;
        int b=1,c;
        System.out.print(a+" "+b);
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            
        }
    }
}