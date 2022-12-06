import java.util.*;
class factorial{
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("Input number");
        int n=x.nextInt();
        int f=1;
        for (int i=2;i<=n;i++){
            f*=i;
        
        }
        System.out.println("The factorial is "+f);
    }
}
