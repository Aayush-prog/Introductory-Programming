import java.util.*;
class multiply{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        System.out.println("Input number");
        int n=x.nextInt(),m;
        while (n<0){
            System.out.println("Invalid!");
            System.out.println("Input number");
            n=x.nextInt();
        }
            for (int i=1;i<=10;i++){
                m=n*i;
                System.out.println(n+"*"+i+"="+m);
            } 
        
    }
}
