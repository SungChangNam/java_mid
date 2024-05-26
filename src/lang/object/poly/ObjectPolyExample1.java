package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        acting(dog);
        acting(car);
    }

    private static void acting(Object obj) {
        //obj sound();//컴파일 오류
        // obj.move(); //컴파일 오류,Object는 move()가 없다.

        //객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog){
            dog.sound();
        }else if (obj instanceof Car car){
            car.move();
        }
    }
}

