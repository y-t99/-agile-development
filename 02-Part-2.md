### 单一责任原则（ The Single Responsibility Principle，SRP）

内聚性：一个模块的组成元素之间的功能相关性。

单一职责原则：一个类应该只有一个发生变化的原因。

为何把职责分离到单独的类中很重要呢？因为每一个职责都是变化的一个轴线。当需求变化时，该变化会反映为类的职责的变化。如果一个类承担了多于一个的职责，那么引起它变化的原因就会有多个。

如果一个类承担的职责过多，就等于把这些职责耦合在了一起。一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。这种耦合会导致脆弱的设计，当变化发生时，设计会遭受到意想不到的破坏。

### 开放封闭原则（The Open-Close Principle，OCP）



### Liskov替换原则（The Liskov Substitution Principle，LSP）



### 依赖倒置原则（The Dependency-Inversion Principle，DIP）



### 接口隔离原则（The Interface Segregation Principle，ISP）