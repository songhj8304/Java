package lang.wrapper.wrapperEx;


public class ParseDouble {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5","3.0"};
        double sum = 0;
        for(String a : array){
            sum += Double.parseDouble(a);
        }

        System.out.println("sum = " + sum);
    }
}
