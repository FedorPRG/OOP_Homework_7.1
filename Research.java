import java.util.ArrayList;

public class Research {
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public void View_Tree() {
        for (Node t : tree) {
            System.out.println((t.toString()));
        }
    }

    public int Search(Person p) {
        for (Node t : tree) {
            if (t.p1.GetIdName() == p.GetIdName() && t.re == Relationship.children) {
                return 1;
            }
        }
        return 0;
    }

    public ArrayList<Person> Spend(Person p, Relationship re) {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.GetIdName() == p.GetIdName() && t.re == re) {
                result.add(t.p2);
            }
        }
        return result;
    }
}
