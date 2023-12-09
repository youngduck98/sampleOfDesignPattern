public class Leaf extends Component{
    String componentName;
    Boolean condition;

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

    public void printCondition(){
        if(!condition)
            throw new UnsupportedOperationException();
        System.out.println("-" + getName());
    }
}
