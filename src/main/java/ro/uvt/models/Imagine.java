package ro.uvt.models;

import ro.uvt.services.AlignStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.concurrent.TimeUnit;

@Entity
public class Imagine extends BaseElement implements AlignStrategy {



    String nume;
    @Transient
    private AlignStrategy align;


    public Imagine() {}

    public Imagine(String nume) {
        this.nume = nume;
        try {
            TimeUnit.SECONDS.sleep(5);
        }  catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void accept(Visitor v) {
        v.visitImagine(this);

    }

    public String getNume() {
        return nume;
    }

    public AlignStrategy getAlign() {
        return align;
    }

    @Override
    public void render(Paragraf p) {
    }
//    public void render(){
//        System.out.format("Imagine %s \n", nume);
//    }


}
