import java.util.*;
public class reverse{
    public static void main(String[] args){
        List<Integer> r=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int a=r.size()-1,b;
        System.out.println("Original list:"+r);
        for (int i=0;i<r.size();i++){//loop start
            b=r.remove(a);//remove the values and returns it
            r.add(i,b);//add in the index position i
        }
        System.out.println("Reversed list:"+r);
    }
}