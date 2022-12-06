import java.util.*;
class pow{
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("Input 1st number");
        int a=x.nextInt();
        System.out.println("Input 2nd number");
        int b=x.nextInt();
        int p=1;
        for (int i=1;i<=b;i++){
             p*=a;
        }
        System.out.printf("The value of %d raised to power of %d is %d",a,b,p);
    }
}