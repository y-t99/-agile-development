package cn.yuanyuan.dp.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author tao
 */
public final class PersonBuilder {

    private final List<Function<Person, Person>> actions = new ArrayList<>();

    public PersonBuilder called(String name) {
        return doAction(p -> p.setName(name));
    }

    public PersonBuilder doAction(Consumer<Person> action){
        return addAction(action);
    }

    public Person build() {
        return actions.stream().reduce(new Person(), (p, f) -> f.apply(p), (a, b) -> a);
    }

    private PersonBuilder addAction(Consumer<Person> action) {
        actions.add(p -> {
            action.accept(p);
            return p;
        });
        return this;
    }

}
