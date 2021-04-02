package company.tree.html;


public class HtmlRoot extends HtmlElement {
    public HtmlRoot() {
        tagName = "Html";
    }
    public HtmlRoot(String text) {
        this();
        this.text = text;
    }
    private HtmlElement head;
    private HtmlElement body;
    private HtmlRoot(HtmlElement head,HtmlElement body){
        this.head = head;
        this.body = body;
    }
    @Override
    public String render(){
        return renderOpenedTag()+head.render()+body.render()+renderClosedTag();
    }
}
