package cn.yuanyuan.dp.functional;

/**
 * @author tao
 */
public class Demo {

    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.called("Yuan");
        Person person = PersonBuilderExtensions
                .workAs(builder, "维格智数")
                .build();
        System.out.println(person);
    }

}
