package poly.ex.pay;

public abstract class PayStore {

    //결제 수단 추가 시 변하는 부분
    //static으로 기능제공
    //추상클래스로 선언해 객체생성 방지
    public static Pay findPay(String option){
        if( option.equals("kakao")){
            return new KakaoPay();
        }else if( option.equals("naver")) {
            return new NaverPay();
        }else{
            return new DefaultPay();
        }
    }
}
