package enumeration.ex1;

public class DiscountService {

    public int discount(String grad, int price){
        int discountPercent =0;
        if (grad.equals(StringGrade.BASIC)){
            discountPercent =10;
        } else if (grad.equals(StringGrade.GOLD)) {
            discountPercent =20;

        } else if (grad.equals(StringGrade.DIAMOND)) {
            discountPercent =30;
        }else {
            System.out.println(grad +": 할인X");
        }

        return price * discountPercent /100;
    }
}
