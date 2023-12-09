import java.util.Iterator;

public class Leaf extends Component{
    String componentName;
    Boolean condition;
    Iterator<Component> iterator;

    public Leaf(String componentName, boolean condition){
        this.componentName = componentName;
        this.condition = condition;
    }
    public String getName(){
        return componentName;
    }
    public boolean getCondition(){
        return condition;
    }

    public void printComponent(){
        System.out.println("-" + getName());
    }

    public Iterator<Component> createIterator(){
        if(iterator == null)
            iterator = new NullIterator();
        return iterator;
    }

    public void printCondition(){
        if(!condition)
            throw new UnsupportedOperationException();
        System.out.println("-" + getName());
    }
}
