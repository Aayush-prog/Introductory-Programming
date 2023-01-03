import java.util.*;
class Sum{
    public int sum(int a, int b, int c){
        int s=a+b+c;
        return s;
    }
    public static void main(String[] args){
        Sum x=new Sum();
        Scanner z=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=z.nextInt();
        System.out.println("Enter number:");
        int b=z.nextInt();
        System.out.println("Enter number:");
        int c=z.nextInt();
        System.out.println("The sum is:"+x.sum(a,b,c));
    }
    
}
    
