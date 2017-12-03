package mandreyn;
import java.util.*;

class AverageMarkComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return new Double(o1.getAverageMark()).compareTo(o2.getAverageMark());
    }
}

public class Container<T extends Comparable<T>> extends ArrayList<T> {

    public Container() {
        super();
    }

    public T getMax()
    {
        return Collections.max(this, (Comparator<? super T>) new AverageMarkComparator());
    }

    public T getMin()
    {
        return Collections.min(this, (Comparator<? super T>) new AverageMarkComparator());
    }
}
