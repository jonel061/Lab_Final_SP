package ro.uvt.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import ro.uvt.services.AlignLeft;
import ro.uvt.services.AlignStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Paragraf extends BaseElement implements Visitee{


    private String text;
    @Transient
    private AlignStrategy align;

    public Paragraf() {}

    public Paragraf(String s) {
        this.text = s;
        this.align = new AlignLeft();
    }

//    @Override
//    public void render() {
//        this.align.render(this);
//    }


    public AlignStrategy getAlign() {
        return align;
    }

    public void setAlign(AlignStrategy align) {
        this.align = align;
    }


    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraf(this);
    }
}
