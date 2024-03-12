package observer.pulltype.subject;

import observer.pulltype.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
