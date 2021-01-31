package ro.uvt.models;

import java.awt.*;

public class RandomContentVisitor implements Visitor<String>{

    @Override
    public String visitBook(Carte carte) {
        System.out.println(carte.getTitlu());
        System.out.println(carte.getAutori());
        carte.getContent().forEach(copil->copil.accept(this));
        return null;
    }

    @Override
    public String visitParagraf(Paragraf paragraf) {
        paragraf.getAlign().render(paragraf);
        return null;
    }

    @Override
    public String visitSection(Section section) {
        System.out.println(section.getSectionTitle());
        section.getContent().forEach(copil->copil.accept(this));
        return null;
    }

    @Override
    public String visitTable(Tabel tabel) {
        System.out.print("Tabel \n");
        tabel.accept(this);
        return null;
    }

    @Override
    public String visitImagine(Imagine image) {
        image.accept(this);
        return null;

    }

    @Override
    public String visitImageProxy(ImageProxy imageProxy) {
        imageProxy.getRealImage().accept(this);
        return null;

    }
}
