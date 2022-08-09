public class Main {
    public static void main (String[] args) throws InterruptedException {
        /*System.out.println("\n\n========================Bubble sort============================");
        Thread.sleep(3000);
        SortingMethods.bubbleSort(Print.generateRandom(40),40,16);
        System.out.println("\n\n========================Selection Sort=========================");
        Thread.sleep(3000);
        SortingMethods.selectionSort(Print.generateRandom(40),40,16);
        System.out.println("\n\n========================Insertion Sort=========================");
        Thread.sleep(500);
        SortingMethods.insertionSort(Print.generateRandom(40),40,16);*/
        //SortingMethods.shellSort(Print.generateRandom(50),50,16);
        BogoSort sample = new BogoSort();
        sample.bogoSort(Print.generateRandom(9));
    }
}
