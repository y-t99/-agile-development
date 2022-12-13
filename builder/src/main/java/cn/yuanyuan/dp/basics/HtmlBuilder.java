package cn.yuanyuan.dp.basics;

/**
 * @author tao
 */
public class HtmlBuilder {

    HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {

        root.setName(rootName);

    }

    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement element = new HtmlElement(childName, childText);
        root.getElements().add(element);
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
