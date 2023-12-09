import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Component c = new NotLeaf("Menus", true);

        Component baseManu = new NotLeaf("baseMenu", true);
        baseManu.addComponent(new Leaf("soup", true));
        c.addComponent(baseManu);

        Component mainMenu = new NotLeaf("mainMenu", true);
        mainMenu.addComponent(new Leaf("chicken", false));
        mainMenu.addComponent(new Leaf("beef", false));
        mainMenu.addComponent(new Leaf("salad", true));
        c.addComponent(mainMenu);

        //c.printComponent();
        //c.printCondition();
        CompositeIterator iter = new CompositeIterator(c.createIterator());
        while(iter.hasNext()){
            Component now = iter.next();
            System.out.println(now.getName());
        }
    }
}