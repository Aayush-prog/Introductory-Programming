import java.util.*;

public class trymerge {
    ArrayList<Integer> getInput(ArrayList<Integer> al) {
        al = new ArrayList<Integer>();
        Scanner x = new Scanner(System.in);
        //asking for the number of elements to input
        System.out.println("Enter length of arraylist:");
        int num= x.nextInt();
        for (int i = 0; i < num; i++) {
            //ask element to user until the no of elements is completed
            System.out.println("Input element:");
            int elem= x.nextInt();
            al.add(elem);
        }
        return al;
    }

    void getOutput(ArrayList<Integer> al) {
        //print the sorted output
        System.out.println("Sorted array:" + al);
    }

    void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        int leftSize = left.size();
        int rightSize = right.size();
        int i = 0, j = 0, k = 0;
        //running the loop until elements of one side is finished
        while (i < leftSize && j < rightSize) {
            if (left.get(i) <= right.get(j)) {//checking which one is smaller
                arr.set(k, left.get(i));//adding the smaller one first
                i++;
            } else {
                arr.set(k, right.get(j));
                j++;
            }
            k++;
        }
        //if the elements are left in either sides
        while (i < leftSize) {
            arr.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < rightSize) {
            arr.set(k, right.get(j));
            j++;
            k++;
        }
    }

    void sort(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size < 2) {
            //when one element present no further sorting is done
            return;
        }
        int mid = size / 2;//dividing in approx half
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < mid; i++) {
            // Dividing the arraylist into left half
            left.add(arr.get(i));
        }
        for (int i = mid; i < size; i++) {
            // Dividing the arraylist into right half
            right.add(arr.get(i));
        }
        sort(left); //calling the sort for left half again and again
        sort(right); //calling the sort for right half again and again
        merge(arr, left, right); //after dividng the list conquering it calling the merge
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        trymerge ms = new trymerge();
        al = ms.getInput(al);//calling method to ask input
        ms.sort(al);//calling method to sort and merge
        ms.getOutput(al);//calling meyhod to get output
    }
}