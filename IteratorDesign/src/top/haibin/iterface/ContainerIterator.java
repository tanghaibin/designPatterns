package top.haibin.iterface;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public interface ContainerIterator {

    Object next();

    boolean hasNext();

    void setSize(int size);

    Object prev();
}
