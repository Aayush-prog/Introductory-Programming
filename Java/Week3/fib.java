import java.util.Scanner;
public class fib{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter nth term");//asks upto which term
        int n=x.nextInt();
        int a=0, b=1,c;
        System.out.print(a+" "+b);
        for(int i=1;i<=n;i++){
            c=a+b;//fibonacci series next number calc
            System.out.print(" "+c);
            a=b;
            b=c;
            
        }
    }
}