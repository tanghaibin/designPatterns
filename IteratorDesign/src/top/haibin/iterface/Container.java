package top.haibin.iterface;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public interface Container<T> {

    ContainerIterator<T> iterator();

    void add(T element);
}
