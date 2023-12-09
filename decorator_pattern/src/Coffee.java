import java.util.*;
public abstract class Coffee {
    protected String name;
    private int cost;
    List<String> decorators = new ArrayList<>();

    public int getCost(){return cost;}

    public abstract List<String> getDecorator();
}
