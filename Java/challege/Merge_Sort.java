import java.util.*;

public class Merge_Sort{
    ArrayList getInput(ArrayList<Integer>al){   
        Scanner sc = new Scanner(System.in);   
        //for number of elements 
        System.out.println("Enter the length of list");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {//running until the number of elements is fulfilled
            System.out.println("Enter the element");
            int elem = sc.nextInt();
            al.add(elem);
        }
        System.out.println("The original list is: ");
        System.out.println(al);
        return al;
    }
  
    
    public void getOutput(ArrayList<Integer> al){
        //print the sorted output
        System.out.println("The sorted list is: ");
        System.out.println(al);
    }

    
    public void merge(ArrayList<Integer> al, int beg, int mid, int end) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        int I1 = beg;//for the first half
        int I2 = mid + 1;//for the second half
        //comparision until the elements in one side is finished
        while (I1 <= mid && I2 <= end) {
            if (al.get(I1) >= al.get(I2)) {
                listA.add(al.get(I1));//adding to the temporary list
                I1++;
            } else {
                listA.add(al.get(I2));
                I2++;
            }
        }
        //if elements remaining
        while (I1 <= mid) {
                listA.add(al.get(I1));
                I1++;
            }
        while (I2 <= end) {
            listA.add(al.get(I2));
            I2++;
        }
        //putting into the original list
        for (int i = 0; i < listA.size(); beg++) {
            al.set(beg, listA.get(i));
            i++;
        }
    }

    
    public void sort(ArrayList<Integer> al, int beg, int end) {
        //checking if there is only one element left
        if (beg >= end) {
            return;
        }
        //finding where to divide the list
        int mid = beg + (end - beg) / 2;
        sort(al, beg, mid);//calling itself again and again until one element is left
        sort(al, mid + 1, end);
        merge(al, beg, mid, end);//for merging the list
    }
    
    
    public static void main(String[] args) {
        ArrayList finalList = new ArrayList<Integer>();
        Merge_Sort mrgsrt  = new Merge_Sort();//creating object of class to pass nonstatic methods
        mrgsrt.getInput(finalList);//calling the methods
        mrgsrt.sort(finalList, 0, finalList.size() - 1);
        mrgsrt.getOutput(finalList);
    }
}