package JavaArrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        I. Display method
        int[] numbers = {1, 4, 2, 6, 8, 9, 2};
        System.out.println(Arrays.toString(numbers));
//        II. Array.copyOf()
        int[] numbers2 = {0, 5, 2, 4, 6, 9, 1};
        System.out.println(Arrays.toString(numbers2));
        int[]copy2 = Arrays.copyOf(numbers2, numbers2.length);
        System.out.println("Original2:" + Arrays.toString(numbers2));
        System.out.println("Copy2:    " + Arrays.toString(copy2));
        copy2[2] = 100;
        System.out.println("Original2:" + Arrays.toString(numbers2));
        System.out.println("Copy2:    " + Arrays.toString(copy2));
//        II b. Array.copyOf()
        int[] someOfNumbers = Arrays.copyOf(numbers2, 4);
        System.out.println("Original2:    " + Arrays.toString(numbers2));
        System.out.println("SomeOfNumbers:" + Arrays.toString(someOfNumbers));






    }
}
