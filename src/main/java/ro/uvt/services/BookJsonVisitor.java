package ro.uvt.services;

import ro.uvt.models.*;

public class BookJsonVisitor implements Visitor<String> {



    @Override
    public String visitBook(Carte carte) {
        return "{\"text\" : \"" + carte.getTitlu() + "\", \"alignment\" : \"" + carte.getAutori() + "\"}";
    }

    @Override
    public String visitSection(Section s) {
        return "{\"text\" : \"" + s.getSectionTitle() + "\", \"alignment\" : }";
    }

    @Override
    public String visitParagraf(Paragraf p) {
        return "{\"text\" : \"" + p.getText() + "\", \"alignment\" : \"" + p.getAlign() + "\"}";
    }

    @Override
    public String visitImageProxy(ImageProxy ip) {
        return "{\"text\" : \"" + ip.getImgname() + "\", \"alignment\" : \"" + ip.getAlign() + "\"}";
    }

    @Override
    public String visitImagine(Imagine i) {
        return "{\"text\" : \"" + i.getNume() + "\", \"alignment\" : \"" + i.getAlign() + "\"}";
    }

    @Override
    public String visitTable(Tabel t) {
        return "{\"text\" : \"" + t.getNume() + "\", \"alignment\" : \"" + t.getAlign() + "\"}";
    }
}
