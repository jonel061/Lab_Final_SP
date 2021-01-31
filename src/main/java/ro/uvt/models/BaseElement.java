package ro.uvt.models;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseElement implements Element {

    @Id
    @GeneratedValue
    @Getter
    public int id;

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element getElement(int i) {
        return null;
    }


}
