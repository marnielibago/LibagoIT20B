package sortingalgorithms.java;

public class SortingAlgorithmsJava {

    //Sort Method 
    public static void bubbleSort(int bubble[]) {
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - i - 1; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int selection[]) {
        for (int i = 0; i < selection.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < selection.length; j++) {
                if (selection[j] < selection[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = selection[i];
            selection[i] = selection[minIndex];
            selection[minIndex] = temp;
        }
    }

   
    public static void insertionSort(int insertion[]) {
        for (int i = 1; i < insertion.length; i++) {
            int key = insertion[i];
            int j = i - 1;

            while (j >= 0 && insertion[j] > key) {
                insertion[j + 1] = insertion[j];
                j--;
            }

            insertion[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int original[] = {10, 8, 7, 6, 9, 2, 1, 4, 3, 5};

        // Separate copies of the original array
        int bubble[] = original.clone();
        int selection[] = original.clone();
        int insertion[] = original.clone();

        // Call each sorting method
        bubbleSort(bubble);
        selectionSort(selection);
        insertionSort(insertion);

        // Display 
        System.out.print("Original Array: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Sorted Array using Bubble Sort: ");
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + " ");
        }
        System.out.println();

     
        System.out.print("Sorted Array using Selection Sort: ");
        for (int i = 0; i < selection.length; i++) {
            System.out.print(selection[i] + " ");
        }
        System.out.println();

       
        System.out.print("Sorted Array using Insertion Sort: ");
        for (int i = 0; i < insertion.length; i++) {
            System.out.print(insertion[i] + " ");
        }
        System.out.println();
    }
}
