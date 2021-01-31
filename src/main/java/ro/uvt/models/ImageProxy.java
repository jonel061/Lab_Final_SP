package ro.uvt.models;

import ro.uvt.services.AlignStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ImageProxy extends BaseElement implements  AlignStrategy {


    String imgname;
    @Transient
    Imagine realImage;
    @Transient
    private AlignStrategy align;

    public ImageProxy() {}

    //    @Override
//    public void render() {
//        if (realImage == null){
//            realImage = new Imagine(imgname);
//        }
//        realImage.render();
//    }
    public ImageProxy(String imgname){
        this.imgname = imgname;
        this.realImage = null;
    }

    public Imagine getRealImage() {
        if (realImage == null){
            realImage = new Imagine(imgname);
        }
        return realImage;
    }

    public AlignStrategy getAlign() {
        return align;
    }

    public String getImgname() {
        return imgname;
    }

    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }

    @Override
    public void render(Paragraf p) {

    }
}
