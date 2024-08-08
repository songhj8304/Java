package static2.ex;

public class MathArrayUtils {
    public static int sum(int[]array){
        int sum = 0;
        for(int a :array){
            sum += a;
        }
        return sum;
    }
    public static double average(int[]array){
        return (double) sum(array)/ array.length;
    }
    public static int min(int[] array){
        int min = array[0];
        for(int a: array){
            if(min > a){
                min = a;
            }
        }
        return min;
    }
    public static int max(int[] array){
        int max = array[0];
        for(int a: array){
            if(max < a){
                max = a;
            }
        }
        return max;
    }
}
