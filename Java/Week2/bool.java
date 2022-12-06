public class bool{
    public static void main(String[] args){
        int a=0;
        int b=1;
        boolean x=(a==0)&&(b==1);//true
        boolean y=!(true &&!(false&&false));//false
        boolean z=(a!=1)&&(b==1);//true
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}