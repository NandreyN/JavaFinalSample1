package mandreyn;
import java.util.*;


public class Container<T extends Comparable<T>> extends ArrayList<T> {

    public Container() {
        super();
    }

    public T getMax()
    {
        return Collections.max(this);
    }

    public T getMin()
    {
        return Collections.min(this);
    }
}
