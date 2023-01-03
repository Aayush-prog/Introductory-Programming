import java.util.*;

public class ms {
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

     void merge(ArrayList<Integer> al, int beg, int mid, int end) {
		int leftSize= mid - beg + 1;
		int rightSize= end - mid;
		
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		
		for (int i = 0; i < leftSize; i++) {
			left[i] = al.get(beg + i);
		}
		for (int j = 0; j < rightSize; j++) {
			right[j] = al.get(mid + 1 + j);
		}

        int i = 0, j = 0, k = beg;
		while (i < leftSize && j < rightSize) {
			if (left[i] <= right[j]) {
				al.set(k, left[i]);
				i++;
			}
			else {
				al.set(k, right[j]);
				j++;
			}
			k++;
		}
		
		while (i < leftSize) {
			al.set(k, left[i]);
			i++;
			k++;
		}
		
		while (j < rightSize) {
			al.set(k, right[j]);
			j++;
			k++;
		}
        }
    

    void sort(ArrayList<Integer> al, int beg, int end) {
        if (beg < end) {
            int mid = beg + (end-beg)/ 2;//dividing in approx half
            sort(al, beg, mid); //calling the sort for left half again and again
            sort(al, mid+1, end); //calling the sort for right half again and again
            merge(al, beg, mid, end); //after dividng the list, conquering it calling the merge
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ms ms = new ms();
        al = ms.getInput(al);//calling
        ms.sort(al,0,al.size());
        ms.getOutput(al);
    }
}