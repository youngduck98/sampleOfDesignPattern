import java.util.*;

public class NotLeaf extends Component{
    String componentName;
    Boolean condition = false;
    List<Component> children = new LinkedList<>();
    Iterator<Component> iterator;

    public NotLeaf(String componentName, Boolean condition){
        this.componentName = componentName;
        this.condition = condition;
    }

    public String getName(){
        return componentName;
    }
    public void addComponent(Component c){
        children.add(c);
    }
    public void removeComponent(Component c){
        children.remove(c);
    }
    public boolean getCondition(){
        return condition;
    }

    public Iterator<Component> createIterator(){
        if(iterator == null)
            iterator = new CompositeIterator(children.iterator());
        return iterator;
    }

    public void printComponent(){
        System.out.println(getName());
        Iterator<Component> iter = children.iterator();
        while(iter.hasNext()){
            System.out.print("-");
            Component c = iter.next();
            c.printComponent();
        }
    }

    public void printCondition(){
        System.out.println(getName());
        Iterator<Component> iter = children.iterator();
        while(iter.hasNext()){
            Component c = iter.next();
            if(!c.getCondition())
                continue;
            System.out.print("-");
            c.printCondition();
        }
    }
}
