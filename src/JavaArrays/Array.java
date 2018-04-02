package JavaArrays;

public class Array {
    public int sumArray(int[] tab1){
        int sum = 0;
        for (int index = 0;index<tab1.length;index++) {
            sum+=tab1[index];
        }
        return sum;
    }

    public int sumArray2D(int[][] tab2){
        int sum = 0;
        for(int row = 0; row<tab2.length; row++){
            for(int column = 0; column<tab2[row].length; column++)
            sum += tab2[row][column];
        }
        return sum;
    }

    public static int sum2Array2D(int[][] tab2d) {
        int sum = 0;
        for (int[] otherNumbers : tab2d) {
            for (int number : otherNumbers) {
                sum += number;
            }
        }
        return sum;
    }

    public static int sumArray2(int[] table){
        int sum = 0;
        for(int number: table){
            sum += number;
        }
        return sum;
    }

    public void printArray(int[][] tabB) {
        for (int i = 0; i < tabB.length; i++) {
            for (int j = 0; j < tabB[i].length; j++)
                if (tabB[i][j] % 2 == 0) {
                System.out.println(tabB[i][j] + ", ");
                }
        }
    }

}
