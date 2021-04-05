package company.tree.html;
import java.util.LinkedList;
import java.util.List;
public class Head extends HtmlElement{
    public static final String TITLE_S_TITLE = "<title>%s</title>%n";
    public static final String S_SCRIPT = "%s<script type = \"text/javaScript\" src=\"%s\">%s</script>%n";
    public static final String SRC_S = "link type=\"text/css\" rel=\"stylesheet\" src=\"%s\">%n";
    public String title;
    List<String> css = new LinkedList<String>();
    List<String> scripts = new LinkedList<String>();
    public Head(String title,List<String> css,List<String> scripts){
        this();
        this.title = title;
        this.css = css;
        this.scripts = scripts;
    }
    public Head(){
        this.tagName = "Head";
    }
    @Override
    public String render() {
        String open =renderOpenedTag();
        String titleRender = String.format(TITLE_S_TITLE, title);
        String scriptsRender = "";
        for (int i = 0; i < scripts.size(); i++) {
            scriptsRender= String.format(S_SCRIPT, scriptsRender, scripts.get(i), text);
        }
        String linksRender = "";
        for (int i = 0; i < css.size(); i++) {
            linksRender += String.format(SRC_S, css.get(i));
        }
        String close = renderClosedTag();
        String result =open + titleRender + scriptsRender +linksRender + close;
        return result;
    }
}
