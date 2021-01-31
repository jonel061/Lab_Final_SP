package ro.uvt.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Carte extends Section {


    @Id
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Autor> autori;


    public Carte(List<Autor> autori, String titlu) {
        super(titlu);
        this.autori = autori;

    }

    public Carte() {
    }

    public String getTitlu() {
        return getSectionTitle();
    }

    public void setTitlu(String titlu) {
        this.setSectionTitle(titlu);
    }

    public List<Autor> getAutori() {
        return autori;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }


    public int getId() {
        return id;

    }
}

