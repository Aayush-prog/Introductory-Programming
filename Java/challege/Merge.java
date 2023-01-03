import java.util.*;
public class Merge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Original list: " + list);

        list = mergeSort(list);

        System.out.println("Sorted list: " + list);
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() > 1) {
            List<Integer> left = leftHalf(list);
            List<Integer> right = rightHalf(list);

            left = mergeSort(left);
            right = mergeSort(right);

            return merge(left, right);
        }
        return list;
    }

    public static List<Integer> leftHalf(List<Integer> list) {
        int size1 = list.size() / 2;
        List<Integer> left = new ArrayList<>(size1);
        for (int i = 0; i < size1; i++) {
            left.add(list.get(i));
        }
        return left;
    }

    public static List<Integer> rightHalf(List<Integer> list) {
        int size1 = list.size() / 2;
        int size2 = list.size() - size1;
        List<Integer> right = new ArrayList<>(size2);
        for (int i = 0; i < size2; i++) {
            right.add(list.get(i + size1));
        }
        return right;
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>(left.size() + right.size());
        int i1 = 0;
        int i2 = 0;

        while (i1 < left.size() && i2 < right.size()) {
            if (left.get(i1) <= right.get(i2)) {
                result.add(left.get(i1));
                i1++;
            } else {
                result.add(right.get(i2));
                i2++;
            }
        }

        // copy remaining elements from both halves - each of these will have already been sorted
        while (i1 < left.size()) {
            result.add(left.get(i1));
            i1++;
        }
        while (i2 < right.size()) {
            result.add(right.get(i2));
            i2++;
        }

        return result;
    }
}
