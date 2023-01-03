import java.util.*;
class average{
    public static void main(String[] args){
        int sum=0,m=0,a=0;
        List<Integer> marks=new ArrayList(Arrays.asList(60,70,80,90,20,30,40));
        for (int i=0;i<marks.size();i++){
        m=marks.get(i);
        sum+=m;}
        a=sum/7;
        System.out.println("The average is"+a);
    }
}