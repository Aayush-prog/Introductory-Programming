import java.util.Scanner;
public class scenario{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Input time in seconds");
        int s=x.nextInt();
        int m=0,h=0,d=0;
        if (s>60){
            m=s/60;
            s=s%60;
            if (m>60){
                h=m/60;
                m=m%60;
        }
    }
    System.out.println(h+" hours, "+m+" minutes and "+s+" seconds");
}
}