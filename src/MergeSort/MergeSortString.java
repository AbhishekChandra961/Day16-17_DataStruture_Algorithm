package MergeSort;

public class MergeSortString {

	static void insertionSort(String[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
 
            // Move elements of arr[0..i-1],
            // that are greater than key,
            // to one position ahead
            // of their current position
            while (j >= 0
                   && isAlphabeticallySmaller(key, arr[j])) {
 
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
        insertionSort(Arr);
        for (int i = 0; i < N; i++) {
            System.out.println(Arr[i]);
        }
    }
}
