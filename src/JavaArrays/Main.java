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
        int[] someOfNumbersLonger = Arrays.copyOf(numbers2, 10);
        System.out.println("Original2:    " + Arrays.toString(numbers2));
        System.out.println("SomeOfNumbers:" + Arrays.toString(someOfNumbers));
        System.out.println("SomeOfNumbersLonger:" + Arrays.toString(someOfNumbersLonger));
//        II c. Copy without Array.copyOf()
        String[] letters = {"a", "b", "c", "d"};
        System.out.println("II c Letters: "+ Arrays.toString(letters));
        char[] temp = new char[letters.length+ 5];
        System.out.println("II c temp: "+ Arrays.toString(temp));
//        System.arraycopy(letters, 0, temp, 0, letters.length);
//        System.out.println("II c temp: "+ Arrays.toString(temp));

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

        String[] names = {"Ola", "Kasia", "Tomek", "Ala"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

//        V. Foreach loop
        int[] table = {3,5,2,1,7,10,4};
        int i = 0;
        for(int element:table){
            System.out.println("Indeks "+ i + " element " + element);
            i++;
        }

//        VI. Multidimension arrays
//        int[][] table2D; //declaration
//        table2D = new int[6][6]; //init

//        int[][] table2D = new int[6][6]; //first is row second is column
        int[][] table2D = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};
        System.out.println("Table2D[1][3]: "+table2D[1][3]);











    }
}
