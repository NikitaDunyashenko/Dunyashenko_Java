import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] testArray = new int[10];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rand.nextInt(30) + 1;
            if (testArray[i] % 3 == 0) {
                System.out.print(testArray[i] + " ");
            }
        }
    }
}
