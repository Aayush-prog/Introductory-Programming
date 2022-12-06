import java.util.Scanner;
public class sumN{

    public static void main(String args[]){
        int sum=0;
        Scanner i=new Scanner(System.in);
        System.out.println("Input nth term");
        int u=i.nextInt();
        for(int n=1;n<=u;n++){
         sum=sum+n;}
        System.out.println("The sum up to "+u+" is "+ sum);
        
        
    }
}