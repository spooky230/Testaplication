package company.tree.html;
import java.util.LinkedList;
import java.util.List;
public class Head extends HtmlElement{
    public String title;
    List<String> css = new LinkedList<String>();
    List<String> Scripts = new LinkedList<String>();
    public Head(String title,List<String> css,List<String> Scripts){
        this();
        this.title = title;
        this.css = css;
        this.Scripts = Scripts;
    }
    public Head(){
        this.tagName = "Head";
    }
}
