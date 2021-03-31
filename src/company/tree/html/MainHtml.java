package company.tree.html;

import java.io.FileWriter;
import java.io.IOException;

public class MainHtml {
    public static void main(String[] args){
        HtmlElement html = new HtmlElement();
        html.tagName = "html";
        HtmlElement body = new HtmlElement();
        body.tagName = "body";
        HtmlElement h1 = new HtmlElement();
        h1.tagName = "h1";
        h1.text = "some text";
        html
                .addNode(body);
        body
                .addNode(h1);
        String htmlDocument = html.render();
        System.out.println(htmlDocument);
        try (FileWriter writer = new FileWriter("treeHtml.html")) {
            writer.append(htmlDocument);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
