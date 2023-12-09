import java.util.*;

public class CompositeIterator implements Iterator<Component> {
    Stack<Iterator<Component>> stack = new Stack<>();
    //stack -> 전위 순회
    //list or queue -> level 순회
    //next에서 재귀를 사용하면 후행 순회 가능?


    public CompositeIterator(Iterator<Component> iterator){
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if(stack.isEmpty())
            return false;
        Iterator<Component> iterator = stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Component next() {
        if(hasNext()){
            Iterator<Component> iterator = stack.peek();
            Component c = iterator.next();
            if(c instanceof NotLeaf) {
                stack.push(c.createIterator());
            }
            return c;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
