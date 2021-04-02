package company.tree;

import java.util.LinkedList;
import java.util.List;

public class ComponentNode implements Cloneable{
    public List<ComponentNode> componentNodes = new LinkedList<>();
    public String pre = "";
    public String after = "";
    public ComponentNode addNode(ComponentNode node) {
        componentNodes.add(node);
        return this;
    }
    public String render(){
        StringBuilder code = new StringBuilder(pre);
        for (ComponentNode componentNode : componentNodes) {
            code.append(componentNode.render());
        }
        code.append(after);
        return code.toString();
    }
    @Override
    public ComponentNode clone() {
        ComponentNode clone = new ComponentNode();
        clone.pre = this.pre;
        clone.after = this.after;
        return clone;
    }
}
