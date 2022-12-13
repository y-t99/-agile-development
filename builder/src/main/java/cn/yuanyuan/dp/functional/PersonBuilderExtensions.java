package cn.yuanyuan.dp.functional;

/**
 * @author tao
 */
public class PersonBuilderExtensions {

    public static PersonBuilder workAs(PersonBuilder builder, String position) {
        return builder.doAction(p -> p.setPosition(position));
    }

}
