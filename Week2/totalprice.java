import java.util.Scanner;
public class totalprice{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Input no of copies");
        int n=x.nextInt();
        double tp;
        if (n<100){
            tp=n*0.30;
        }else if(n<500){
            tp=n*0.28;
        }else if(n<800){
            tp=n*0.27;
        }else if(n<1000){
            tp=n*0.26;
        }else{
            tp=n*0.26;
        }
        System.out.println("The total cost is $"+tp);
    }
    
}