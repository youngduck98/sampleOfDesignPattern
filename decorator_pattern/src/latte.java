import java.util.List;

public class latte extends Coffee{
    public latte(){
        name = "latte";
    }

    @Override
    public List<String> getDecorator() {
        return this.decorators;
    }
}
