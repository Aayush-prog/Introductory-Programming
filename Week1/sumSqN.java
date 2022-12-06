import java.util.Scanner;
public class sumSqN{

    public static void main(String args[]){
        int sum=0;
        Scanner i=new Scanner(System.in);
        System.out.println("Input nth term");
        int u=i.nextInt();
        for(int n=1;n<=u;n++){
         sum=sum+(n*n);}
        System.out.println("The sum of square up to "+u+" is "+ sum);
        
        
    }
}