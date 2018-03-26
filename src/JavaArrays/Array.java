package JavaArrays;

public class Array {
    public int sumArray(int[] tab1){
        int sum = 0;
        for (int index = 0;index<tab1.length;index++) {
            sum+=tab1[index];
        }
        return sum;
    }
}
