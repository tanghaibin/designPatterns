package top.haibin.impl;

import top.haibin.iterface.ContainerIterator;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public class ContainerIteratorImpl implements ContainerIterator {

    private int index = 0;

    private Object[] elements;

    private int size;

    public ContainerIteratorImpl(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    @Override
    public Object next() {
        return elements[index++];
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
    public Object prev() {
        if(index < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[--index];
    }
}
