package cn.yuanyuan.dp.stepwise;

/**
 * @author tao
 */
public class CarBuilder {

    public static ISpecifyCarType create() {
        return new StepwiseBuilder();
    }

}

class StepwiseBuilder implements ISpecifyCarType, ISpecifyWheelSize, IBuildCar {

    private Car car = new Car();

    @Override
    public Car build() {
        return car;
    }

    @Override
    public ISpecifyWheelSize ofType(CarType carType) {
        car.type = carType;
        return this;
    }

    @Override
    public IBuildCar withWheels(int size) {
        switch (car.type) {
            case Sedan:
                if (size < 17 || size > 20) {
                    throw new RuntimeException();
                }
                break;
            case Crossover:
                if (size < 15 || size > 17) {
                    throw new RuntimeException();
                }
                break;
            default:
                throw new RuntimeException();
        }
        car.wheelSize = size;
        return this;
    }
}

