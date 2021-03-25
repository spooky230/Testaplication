package company.tree;

import java.io.FileWriter;
import java.io.IOException;

public class TreeMain {
    public static void main(String[] args) {
        ComponentNode html = createTree();
        String htmlDocument = html.render();
        System.out.println(htmlDocument);
        try (FileWriter writer = new FileWriter("example.html")) {
            writer.append(htmlDocument);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ComponentNode createTree() {
        ComponentNode html = new ComponentNode();
        html.pre = "<html>\n";
        html.after = "</html>";
        ComponentNode body = new ComponentNode();
        body.pre = "\t<body>\n"; // \t is 4 spaces \n is new line
        body.after = "\t</body>\n";
        ComponentNode h1 = new ComponentNode();
        h1.pre = "\t\t<h1>";
        h1.after = "</h1>\n";
        ComponentNode h1text = new ComponentNode();
        h1text.pre = "Hello World";
        h1text.after = "!";
        ComponentNode p = new ComponentNode();
        p.pre = "\t\t<p>";
        p.after = "\t\t</p>\n";
        ComponentNode pText = new ComponentNode();
        pText.pre = "This is hello world html app";
        pText.after = "\n";
        ComponentNode ul = new ComponentNode();
        ul.pre = "\t\t<ul>\n";
        ul.after = "\t\t</ul>\n";
        ComponentNode li1 = new ComponentNode();
        li1.pre = "\t\t\t<li   style=\"color: rgb(10, 180, 24);\">";
        li1.after = "\t\t\t</li>\n";
        ComponentNode li2 = li1.clone();
        ComponentNode li3 = li1.clone();
        ComponentNode li1Text = new ComponentNode();
        ComponentNode li2Text = new ComponentNode();
        ComponentNode li3Text = new ComponentNode();
        li1Text.pre = "Html";
        li2Text.pre = "Tree";
        li3Text.pre = "Example";
        li1.addNode(li1Text);
        li2.addNode(li2Text);
        li3.addNode(li3Text);
        ul
                .addNode(li1)
                .addNode(li2)
                .addNode(li3);
        html.addNode(body);
        body
                .addNode(h1)
                .addNode(p);
        h1.addNode(h1text);
        p
                .addNode(pText)
                .addNode(ul);
        return html;
    }
}
