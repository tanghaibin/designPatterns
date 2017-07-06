package top.haibin.iterface;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public interface ContainerIterator<T> {

    T next();

    boolean hasNext();

    void setSize(int size);

    T prev();
}
