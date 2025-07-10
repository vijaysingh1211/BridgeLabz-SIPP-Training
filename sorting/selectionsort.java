public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 1 };
         // time complexity O(n^2)
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int minidx(int[] arr, int i) {
        int mini = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[mini]) {
                mini = j;
            }
        }
        return mini;
    }
    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx = minidx(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}

