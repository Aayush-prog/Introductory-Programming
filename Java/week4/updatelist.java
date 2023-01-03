import java.util.*;
class updatelist{
    public static void main(String[] args){
    List fruit=new ArrayList(Arrays.asList("apple","banana","pear","cherry"));
    System.out.println("old list"+fruit);
    fruit.set(0,"Grapefruit");//changes value at given index
    fruit.remove(2);//delets the values
    fruit.add(2,"Date");//adds a new value at index position
    fruit.add("Orange");
    System.out.println("updated list"+fruit);
}
}
