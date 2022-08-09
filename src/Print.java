public class Print {
    public static void printOut (int[] arr, int height) {
        for (int line = 0; line < height; line++) {
            for (int num : arr) {
                if ((line-(height-num)) >= 0) {
                    System.out.print("|| ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 130; i++) {
            System.out.print("X");
        }
        System.out.println("");
    }
    public static int[] generateRandom (int length) {
        int[] example = new int[length];
        for (int i = 0; i < length; i++) {
            example[i] = (1+(int)(Math.random()*15));
        }
        return example;
    }
}
