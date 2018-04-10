package JavaArrays;
import javax.sound.midi.Soundbank;
import java.util.*;

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


        int[][] aryNumbers = new int[6][5];

        aryNumbers[0][0] = 10;
        aryNumbers[0][1] = 12;
        aryNumbers[0][2] = 43;
        aryNumbers[0][3] = 11;
        aryNumbers[0][4] = 22;

        aryNumbers[1][0] = 20;
        aryNumbers[1][1] = 45;
        aryNumbers[1][2] = 56;
        aryNumbers[1][3] = 1;
        aryNumbers[1][4] = 33;

        aryNumbers[2][0] = 30;
        aryNumbers[2][1] = 67;
        aryNumbers[2][2] = 32;
        aryNumbers[2][3] = 14;
        aryNumbers[2][4] = 44;

        aryNumbers[3][0] = 40;
        aryNumbers[3][1] = 12;
        aryNumbers[3][2] = 87;
        aryNumbers[3][3] = 14;
        aryNumbers[3][4] = 55;

        aryNumbers[4][0] = 50;
        aryNumbers[4][1] = 86;
        aryNumbers[4][2] = 66;
        aryNumbers[4][3] = 13;
        aryNumbers[4][4] = 66;

        aryNumbers[5][0] = 60;
        aryNumbers[5][1] = 53;
        aryNumbers[5][2] = 44;
        aryNumbers[5][3] = 12;
        aryNumbers[5][4] = 11;


        int row=6;
        int column=5;

        int j, k;

        for(j=0; j<row; j++){
            for(k=0; k<column; k++){
                System.out.print(aryNumbers[j][k] + " " );
            }
            System.out.println( " " );
        }
//      VII. Tables
//      1. creating new table
        int[] table4 = new int[100];
//      2. inserting values into cells
        for(int element = 0; element<table4.length; element++){
            table4[element] = element;
        }
//      3. printing values
        for(int element = 0; element<table4.length; element++){
            if(element<10){
                System.out.print("0" + table4[element]+ ", ");
            } else {
                System.out.print(table4[element]+ ", ");
            }
            if(element>0 && (element+1)%10 == 0){
                System.out.println();
            }
        }



        Vehicle v1 = new Vehicle("Tesla","Blue",30000);
        Vehicle v2 = new Vehicle("Vw","Red",15000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v2.setModel("Jaguar");
        v2.setColor("Silver");
        v2.setPrice(45000);
        v2.displayVehicleDetails();

//      VIII Scanner/Max/Min/Avg
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many numbers you will enter: ");
        int numbersInArray = scanner.nextInt();
        double[] measures = new double[numbersInArray];

//      1. input data
        for(int m = 0; m<measures.length;m++){
            System.out.println("Type "+ m + " number: ");
            measures[m] = scanner.nextDouble();
        }
//      2. Max
        double max = 0;
        for(double measure: measures){
            if(measure>max){
                max = measure;
            }
        }
        System.out.println("Max measure is: "+ max);
//      3. Min
        double min = 1000000;
        for (double measure: measures){
            if(measure<min){
                min = measure;
            }
        }
        System.out.println("Min measure is: " + min);
//      3. Sum
        double sum = 0;
        for(double measure:measures){
            sum += measure;
        }
        System.out.println("Sum is: " + sum);
//      4. Avg
        double average = sum/measures.length;
        System.out.println("Average measures is: " + String.format("%.2f", average));
        double input = 43.23242455;
        System.out.println("Double: " + input);
        System.out.println("Double: " + String.format("%.2f", input));


//      IX switch
        int temperatur = 37;
        switch (temperatur){
            case 35:
                System.out.println("Temperature is 35");
                break;

            case 36:
                System.out.println("Temperature is 36");
                break;
            case 37:
                System.out.println("Temperature is 37");
                break;
            case 38:
                System.out.println("Temperature is 38");
                break;
            default:
                System.out.println("Don't know this value");
                break;
        }

//      X Decrementing for loop test
        for(int number = 20; number > 9; number-- ){
            System.out.print(number + ", ");
        }
        System.out.println("");
        for(int number2 = -9; number2 < 41; number2+=2){

                System.out.print("Number2: "+ number2 + ", ");
            }

//      XI While loop test
        System.out.println("");
        int count = 10;
        while(count < 21){
            System.out.print("Counting " + count + ", ");
            count++;
        }

        int count2 = -10;
        while (count2 < 41){
            System.out.println("test1");
            if(count2%2==0){
                System.out.println("test2");
            }else{
                System.out.print("Count2: "+ count2 + ", ");
            }
            count2++;
            System.out.println("test3");
        }

//        XII int[] tab argument
        int[] argNumbers = new int[]{1, 4, 2, 6, 8, 9, 2};
        Array table1 = new Array();
        int summ = table1.sumArray(argNumbers);
        System.out.println("Sum= "+summ);

//        XIII int[][] tab2 argument
//        a.
        int[][] argNumbers2D = new int[][]{
                {1,2,3},
                {1,2,3},
                {1,2,3}};
        Array table2 = new Array();
        int summ2 = table2.sumArray2D(argNumbers2D);
        System.out.println("2D Array sum = "+ summ2);
//      b. static 2d Array
        int[][] numbers2D = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6, 7}
                };
        System.out.println("Static, foreach sum= "+Array.sum2Array2D(numbers2D));

//      c. static 1d Array
        int[] numbers3 = new int[]{1,2,3};
        System.out.println(Array.sumArray2(numbers3));

//        XIV int[][]tabB test
        int[][] tabB = {{1, 2, 3, 4},
                {5, 6, 7, 8}};

        Array test = new Array();
        System.out.println("Test: ");
        test.printArray(tabB);

//        XV Lists

        List<String> listOne = new ArrayList<String>();
        listOne.add("first");
        listOne.add("second");
        listOne.add("first");
        List<String> listTwo = new ArrayList<String>();
        listTwo.addAll(listOne);
        String begining = listTwo.get(1);
        System.out.println(begining);
        boolean empty = listTwo.isEmpty();
        System.out.println(empty);
        int size = listTwo.size();
        System.out.println(size);

//        XVI References
        Object referenceToObjectX = new Object();
        Object anotherReferenceToObjectX = referenceToObjectX;
        Object refferenceToObjectY = new Object();

        System.out.println(referenceToObjectX.toString());
        System.out.println(anotherReferenceToObjectX.toString());
        System.out.println(refferenceToObjectY.toString());

    }

}
