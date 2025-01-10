import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] arrayExample = {14, 52, 73, 2, 93};
        
        //twoSum(new int[]{2, 11, 5, 4}, 9);
        //sortArrayLowBig(arrayExample);
        //sortArrayBigLow(arrayExample);
        //reverseArray(arrayExample);
        //findMedian(arrayExample);
    }

    public static void sortArrayLowBig(int[] array) {
        sort(array); //guess what it does

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        //loops through the array
        for (int i = 0; i < nums.length; i++) {

            //checks if the array is empty
            if (nums.length == 0) {
                System.out.println("No pair found.");
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                //checks if nums[j] position value is equal to target - nums[i] position value
                if (nums[j] == target - nums[i]) {
                    //finally returns the valid pair that equals to the target
                    System.out.println("Pair found: " + nums[i] + ", " + nums[j]);
                }
            }
        }
        return new int[] {};
    }

    public static void sortArrayBigLow(int[] array) {
        sort(array); //guess again

        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i - 1]);
        }
    }

    public static void reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = j;
        }

        System.out.println("" + Arrays.toString(array));
    }

    public static void findMedian(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println((double) sum / array.length);

    }

}
