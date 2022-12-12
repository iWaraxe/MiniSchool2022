package org.example.lecture18.t3behavioral.p3observer;

public interface Observable<T> {
    void registerObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers(T data);
}
