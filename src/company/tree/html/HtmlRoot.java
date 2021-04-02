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
    public HtmlRoot(HtmlElement head,HtmlElement body){
        this();
        this.head = head;
        this.body = body;
    }
    @Override
    public String render(){
        String open = renderOpenedTag();
        String headRenderResult = head.render();
        String bodyRenderResult = body.render();
        String close = renderClosedTag();
        String result = open + headRenderResult + bodyRenderResult + close;
        return result;
    }
}
