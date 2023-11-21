package bubblebutt;

import java.util.Arrays;
import java.util.Stack;

public class BubbleButt {

    public static void main(String[] args) {
        // Sorting stack of integers
        Stack<Integer> num = new Stack<>();
        num.push(55);
        num.push(66);
        num.push(23);
        num.push(53);
        num.push(2);
        num.push(11);

        System.out.println("Original Integer Stack: " + num);
        bubbleSort(num);
        System.out.println("Sorted Integer Stack: " + num);

        // Sorting string array
        String[] wew = {"Gwyn", "Princess", "Joanna", "Rhea", "ariel", "jam", "gwyn"};
        System.out.println("Original String Array: " + Arrays.toString(wew));
        bubbleSort(wew);
        System.out.println("Sorted String Array: " + Arrays.toString(wew));
    }

    static void bubbleSort(Stack<Integer> stack) {
        int n = stack.size();
        Integer[] arr = stack.toArray(new Integer[n]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        stack.clear();
        stack.addAll(Arrays.asList(arr));
    }

    static void bubbleSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                   
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}