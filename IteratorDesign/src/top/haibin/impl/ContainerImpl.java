package top.haibin.impl;

import top.haibin.iterface.Container;
import top.haibin.iterface.ContainerIterator;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public class ContainerImpl<T> implements Container<T> {

    private Object[] elements;

    private int index;

    private int size;

    private ContainerIterator iterator;

    public ContainerImpl() {
        elements = new Object[10];
        iterator = new ContainerIteratorImpl(elements, size);
    }

    @Override
    public ContainerIterator iterator() {
        return iterator;
    }

    @Override
    public void add(T element) {
        if(index > 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        elements[index++] = element;
        ++size;
        iterator.setSize(size);
    }
}
