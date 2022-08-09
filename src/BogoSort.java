import java.util.Arrays;
import java.util.Random;

public class BogoSort {
    Random random = new Random();

    public void bogoSort(int[] n) {
        while(!inOrder(n)){
            shuffle(n);
            System.out.println(Arrays.toString(n));
        }
        System.out.println(Arrays.toString(n));
    }

    public void shuffle(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int swapPosition = random.nextInt(i + 1);
            int temp = n[i];
            n[i] = n[swapPosition];
            n[swapPosition] = temp;
        }
    }

    public boolean inOrder(int[] n) {
        for (int i = 0; i < n.length-1; i++) {
            if (n[i] > n[i+1]) {
                return false;
            }
        }
        return true;
    }
}
