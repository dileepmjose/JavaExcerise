import java.util.Arrays;

public class CheckArraySorted {
    public static void main(String arg[]) {

        Integer[] intArray = {10, 20, 30,35, 40, 50};
        if(isSorted(intArray)){
            System.out.println("SORTED");
        }else{
            System.out.println("NOT SORTED");
        }
    }

    public static boolean isSorted(Integer[] intArray) {
        System.out.println("=====Method 2======");
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
