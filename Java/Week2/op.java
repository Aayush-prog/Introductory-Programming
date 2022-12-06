import java.util.Scanner;
import java.lang.Math;
public class op{
    public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    System.out.println("Input 1st number");
    int a=x.nextInt();
    System.out.println("Input 2nd number");
    int b=x.nextInt();
    int sum=a+b;
    int sub=a-b;
    int mul=a*b;
    double div=a/b;
    int mod=a%b;
    double exp=Math.pow(a,b);
    System.out.printf("Addition:%d%nSubtraction:%d%nMultiplication:%d%nDivision:%.2f%nModulus:%d%nExponential:%.0f%n",sum,sub,mul,div,mod,exp);
    }
} 