import java.util.*;
class calc{
    double sum(double a, double b){
        double s=a+b;
        return s;
    }
    double diff(double a, double b){
        double d=a-b;
        return d;
    }
    double pro(double a, double b){
        double p=a*b;
        return p;
    }
    double div(double a, double b){
        double div=a/b;
        return div;
    }
    public static void main(String[] args){
        calc z=new calc();
        char ans='y';
        double a=0,b=0;
        int c=0;
        if(ans=='y'){
        Scanner x=new Scanner(System.in);
        System.out.println("Input number");
         a=x.nextDouble();
        System.out.println("Input number");
         b=x.nextDouble();
        System.out.println("Choose what you want to do");
        System.out.printf("1=sum%n2=difference%n3=product%n4=divide");
         c=x.nextInt();
    }
    if (c==1){
            System.out.println("Sum is:"+z.sum(a,b));
        }else if (c==2){
            System.out.println("Difference is:"+z.diff(a,b));
        }else if (c==3){
            System.out.println("Product is:"+z.pro(a,b));
        }else if (c==4){
            System.out.println("Division is:"+z.diff(a,b));
        }

    Scanner v=new Scanner(System.in);
    System.out.println("Do you want to continue?y/n");
    ans=v.next().charAt(0);
    if (ans=='n'){
        System.out.println("Thank you");
    }
    
        
        
    }
}