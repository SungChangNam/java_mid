package lang.immutable.test;

public class ImmutableDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1= new ImmutableMyDate(2024,5,29);
        ImmutableMyDate date2= date1;
        System.out.println("date1 ="+ date1);
        System.out.println("date2 ="+ date2);

        System.out.println("2025-> date1");


        date2 = date1.withYear(2025);
        System.out.println("date1 ="+ date1);
        System.out.println("date2 ="+ date2);
    }
}
