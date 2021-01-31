package ro.uvt.models;

import org.springframework.stereotype.Component;
import ro.uvt.services.Observer;
import ro.uvt.services.Subject;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {

    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Observer> observers = new ArrayList();

    @Override
    public void attach(Observer ob) {
        this.observers.add(ob);
    }
    public  void add(Carte carte){
        this.observers.forEach(x->x.update(carte));
    }
}
