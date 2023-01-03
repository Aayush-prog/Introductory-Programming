import java.util.*;
class sumPosi{
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter number");
        int a=x.nextInt();
        int sum=0;
        if (a<=100){
            sum +=a;
        }
        System.out.println("Do you want to continue?Y/N");
        char n=x.next().charAt(0);
        char m= Character.toUpperCase(n);
        while ( m=='Y'){
            System.out.println("Enter number");
         a=x.nextInt();
            if (a<=100){
            sum +=a;
        }
        System.out.println("Do you want to continue?Y/N");
         n=x.next().charAt(0);
         m= Character.toUpperCase(n);
        
     }
     System.out.printf("The sum is %d",sum);
}
}