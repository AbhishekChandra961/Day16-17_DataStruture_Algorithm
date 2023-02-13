package BubbleSort;

public class BubbleSortString {

	static void bubbleSort(String[] arr, int n)
    {
        int i, j;
        String temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (isAlphabeticallySmaller(
                        arr[j + 1], arr[j])) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop,
            // then break
            if (swapped == false)
                break;
        }
    }
 
    // Function to compare 2 words
    static boolean isAlphabeticallySmaller(
        String str1, String str2)
    {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String[] Arr
            = { "sun", "earth", "mars", "mercury" };
        int N = Arr.length;
        bubbleSort(Arr, N);
        for (int i = 0; i < N; i++) {
            System.out.println(Arr[i]);
        }
    }
}
