import java.util.ArrayList;

public class GeoTree {
    public ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
      return tree;
    }
  
    public void Append(Person parent, Person children) {
      tree.add(new Node(parent, Relationship.parent, children));
      tree.add(new Node(children, Relationship.children, parent));
    }
}
