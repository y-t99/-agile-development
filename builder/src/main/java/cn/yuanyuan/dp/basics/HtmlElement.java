package cn.yuanyuan.dp.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tao
 */
public class HtmlElement {
    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String name;

    private String text;

    private List<HtmlElement> elements = new ArrayList<>();

    private final static int INDENT_SIZE = 2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<HtmlElement> getElements() {
        return elements;
    }

    private String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();

        String indentString = repeat(" ", INDENT_SIZE * indent);
        stringBuilder.append(indentString);
        String beginTagName = String.format("<%s>", name);
        stringBuilder.append(beginTagName).append(System.lineSeparator());

        if (text != null && text.length() != 0) {
            String subIndentString = repeat(" ", INDENT_SIZE * (indent + 1));
            stringBuilder.append(subIndentString);
            stringBuilder.append(text);
            stringBuilder.append(System.lineSeparator());
        }

        for (HtmlElement element:
             elements) {
            stringBuilder.append(element.toStringImpl(indent + 1));
        }

        String endTagName = String.format("</%s>", name);
        stringBuilder.append(indentString);
        stringBuilder.append(endTagName);
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }

    private String repeat(String content,int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(content);
        }
        return stringBuilder.toString();
    }
}
