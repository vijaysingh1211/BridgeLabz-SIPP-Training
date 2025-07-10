public class insertionsort {
     public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 1 };
         // time complexity O(n^2)
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void InsertLastElement(int[] arr,int i){
        int temp = arr[i];
        int j = i-1;
         while(j>=0 && arr[j]>temp){
          arr[j+1] = arr[j];
            j--;
         }
         arr[j+1]  = temp;
    }
    public static void Sort(int[] arr){
         for (int i = 1; i < arr.length; i++) {
            InsertLastElement(arr, i);
         }
    }

    }


