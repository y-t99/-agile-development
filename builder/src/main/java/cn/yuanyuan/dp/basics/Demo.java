package cn.yuanyuan.dp.basics;

/**
 * @author tao
 */
public class Demo {
    public static void main(String[] args) {
        String hello = "hello";

        String paragraphHtml = "<p>"
                + hello
                + "</p>";
        System.out.println(paragraphHtml);

        String[] words = new String[] { "hello", "world" };
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ul>");
        for (String word :
                words) {
            stringBuilder.append("<li>");
            stringBuilder.append(word);
            stringBuilder.append("</li>");
        }
        stringBuilder.append("</ul>");
        System.out.println(stringBuilder);

        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");

        htmlBuilder.addChild("li", "hello");
        htmlBuilder.addChild("li", "world");

        System.out.println(htmlBuilder);
    }

}
