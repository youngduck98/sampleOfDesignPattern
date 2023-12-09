import java.util.List;

public class americano extends Coffee{
    public americano(){
        name = "americano";
    }
    @Override
    public List<String> getDecorator() {
        return this.decorators;
    }
}
