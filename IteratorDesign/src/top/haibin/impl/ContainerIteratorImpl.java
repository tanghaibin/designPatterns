package top.haibin.impl;

import top.haibin.iterface.ContainerIterator;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public class ContainerIteratorImpl<T> implements ContainerIterator<T> {

    private int index = 0;

    private Object[] elements;

    private int size;

    public ContainerIteratorImpl(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    @Override
    public T next() {
        return (T)elements[index++];
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public T prev() {
        if(index < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) elements[--index];
    }
}
