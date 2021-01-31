package ro.uvt.models;

import ro.uvt.services.AlignStrategy;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Tabel extends  BaseElement implements AlignStrategy {
    String nume;
    @Transient
    private AlignStrategy align;

    public Tabel(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public AlignStrategy getAlign() {
        return align;
    }
    //    @Override
//    public void render(){
//        System.out.print("Tabel \n");
//    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }

    @Override
    public void render(Paragraf p) {

    }
}
