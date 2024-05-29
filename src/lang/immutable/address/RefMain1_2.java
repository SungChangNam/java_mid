package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수있다.
        Address a= new Address("서울"); //x001
        Address b =new Address("서울");// x002
        System.out.println("A= "+a);
        System.out.println("b= "+b
        );

        b.setValue("부산");
        System.out.println("A= "+a);
        System.out.println("b= "+b);
    }
}
