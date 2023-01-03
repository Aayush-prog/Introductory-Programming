import java.util.*;
class set{
    public static void main(String[] args){
        HashSet a=new HashSet();
        a.add(1);
        a.add(2);
        HashSet b=new HashSet();
        b.add(2);
        b.add(3);
        b.retainAll(a);
        System.out.println(b);
    }
}