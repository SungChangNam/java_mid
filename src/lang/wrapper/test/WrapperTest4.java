package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str="100";

        //Sting -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer = " + integer1);

        //Integer ->int
        int intValue= integer1;
        System.out.println("intValue = " + intValue);
        
        //int -> Integer
        Integer integer2= intValue;
        System.out.println("integer2 = " + integer2);
    }
}
