public class MergeSort {
    private static int[] aux;
    public static void merge (int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        for (int k = 0; k < arr.length; k++) {
            aux[k] = arr[k];
        }
        for (int index = low; index <= high; index++) {
            if (i > mid) {arr[index] = aux[j++];}
            else if (j > high) {arr[index] = aux[i++];}
            else if (aux[i] <= aux[j]) {arr[index] = aux[i++];}
            else {arr[index] = aux[j++];}
        }
    }
    public static void sortArray (int[] arr) throws InterruptedException {
        aux = new int[arr.length];
        sort(arr, 0, arr.length-1);
    }
    public static void sort (int[] arr, int low, int high) throws InterruptedException {
        if (low >= high) {return;}
        int mid = (low+(high-low)/2);
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
        Print.printOut(arr,16);
        Thread.sleep(300);
    }
}
