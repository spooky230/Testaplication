package company.tree.html;
import java.util.LinkedList;
import java.util.List;
public class HtmlElement implements Cloneable {
    public List<HtmlElement> innerNodes= new LinkedList<>();
    public String tagName;
    public String text = "";
    public String style;
    public HtmlElement addNode(HtmlElement node) {
        innerNodes.add(node);
        return this;
    }

    @Override
    public HtmlElement clone(){
        HtmlElement aClone = new HtmlElement();
        aClone.tagName = this.tagName;
        aClone.text = this.text;
        aClone.style = this.style;
        return aClone;
    }
    public static final String open = "<%s>%n";
    public static final String close = "</%s>%n";
    public static final String css = "<%s style= \"%s\">%n";
    public String render(){

        String code;
        if(style == null){
            code = String.format(open,tagName);
        }
        else{
            code = String.format(css,tagName,style);
        }
        code = code+text;
        for (HtmlElement node : innerNodes) {
            code = code + node.render();
        }
        code += String.format(close,tagName);
        return code;
    }
}
