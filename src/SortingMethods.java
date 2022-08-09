public class SortingMethods {
    public static void bubbleSort (int[] arr, int length, int height) throws InterruptedException {
        Print.printOut(arr, height);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            Print.printOut(arr,height);
            Thread.sleep(1000);
        }
    }
    public static void selectionSort (int[] arr, int length, int height) throws InterruptedException {
        Print.printOut(arr, height);
        int smallest_index = 0;
        int smallest;
        for (int i = 0; i < length-1; i++) {
            smallest = 1000;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < smallest) {
                    smallest_index = j;
                    smallest = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest_index];
            arr[smallest_index] = temp;
            Print.printOut(arr, height);
            Thread.sleep(1000);
        }
    }
    public static void insertionSort (int[] arr, int length, int height) throws InterruptedException {
        Print.printOut(arr,height);
        int insert_index;
        int insert_num;
        for (int i = 1; i < length; i++) {
            insert_num = arr[i];
            insert_index = -1;
            for (int j = 0; j < i; j++) {
                if (arr[j] > insert_num) {
                    insert_index = j;
                    break;
                }
            }
            if (insert_index == -1) {
                insert_index = i;
            }
            for (int k = i; k > insert_index; k--) {
                arr[k] = arr[k-1];
                //Thread.sleep(250);
            }
            arr[insert_index] = insert_num;
            Print.printOut(arr,height);
            Thread.sleep(500);
        }
    }
    public static void exchange (int[] input, int index1, int index2) {
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
    public static void shellSort (int[] arr, int length, int height) throws InterruptedException {
        Print.printOut(arr,height);
        int h = 1;
        while (h < (arr.length/3)) {h = (3*h + 1);}
        while (h >= 1) {
            System.out.println(h + " sort");
            Thread.sleep(300);
            for (int lead = h; lead < arr.length; lead++) {
                for (int sort = lead; sort >= h && arr[sort] < arr[sort-h]; sort -= h) {
                    exchange(arr, sort-h, sort);
                }
                Print.printOut(arr,height);
                Thread.sleep(300);
            }
            h = h/3;
        }
    }
    public static void hello () {
        System.out.println("Hello my friend!");
    }

}
