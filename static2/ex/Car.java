package static2.ex;

public class Car {
    private String CarName;
    private static int count;
    public Car(String CarName){
        System.out.println("차량 구입, 이름: "+ CarName);
        this.CarName = CarName;
        count++;
    }
    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + count);
    }
}
