import java.util.ArrayList;
import java.util.List;

public class shot extends CoffeeDecorator{

    @Override
    public List<String> getDecorator() {
        List<String> ret = new ArrayList<>(coffee.getDecorator());
        ret.add(this.name);
        return ret;
    }
}
