package observer.pushtype.subject;

import observer.pushtype.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
