package JavaArrays;
import java.util.Arrays;
import java.util.Collections;

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
//        III. Array.equals()
        int[] tab1 = {4,2,1,5,6};
        int[] tab2 = {4,2,1,5,6};
        System.out.println(Arrays.equals(tab1,tab2)); //return true (boolean type)

        int[]tab3 = {1,2,3};
        int[]tab4 = {1,2,4};
        System.out.println(Arrays.equals(tab3,tab4)); //return false (boolean type)

//        IV. Array.sort() & binarySearch()
        int[] unsortedTab = {9,6,1,3,2,8};
        int[] sorted;
        Arrays.sort(unsortedTab);
        System.out.println(Arrays.toString(unsortedTab));

        int index = Arrays.binarySearch(unsortedTab,3);
        System.out.println("Found 3 at position: " + index);








    }
}
