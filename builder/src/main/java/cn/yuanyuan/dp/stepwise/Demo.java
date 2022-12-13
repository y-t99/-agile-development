package cn.yuanyuan.dp.stepwise;

/**
 * @author tao
 */
public class Demo {

    public static void main(String[] args) {
        Car car = CarBuilder
                .create()
                .ofType(CarType.Sedan)
                .withWheels(20)
                .build();
        System.out.println(car);
    }

}
