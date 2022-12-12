package org.example.lecture21.module3.ex2;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Broken - invokes alien method from synchronized block!
public class ObservableSet<E> extends ForwardingSet<E> {
    public ObservableSet(Set<E> set) {
        super(set);
    }

    // 2. change to concurrent collection
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<>();

    // 2. change to concurrent collection
    public void addObserver(SetObserver<E> observer) {
            observers.add(observer);
    }


    // 2. change to concurrent collection
    public boolean removeObserver(SetObserver<E> observer) {
            return observers.remove(observer);
    }

    // 1. move alien method outside of synchronized block - open call
    // 2. change to concurrent collection
    private void notifyElementAdded(E element) {
        for (SetObserver<E> observer : observers)
            observer.added(this, element);
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element); // Calls notifyElementAdded
        return result;
    }
}