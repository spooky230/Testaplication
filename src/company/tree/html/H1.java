package company.tree.html;

public class H1 extends HtmlElement{
    public H1(){
        tagName = "h1";
    }
    public H1(String text,String style){
        this(text);
        this.style = style;
    }
    public H1(String text){
        this();
        this.text = text;
    }
}
