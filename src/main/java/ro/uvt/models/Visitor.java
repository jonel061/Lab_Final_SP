package ro.uvt.models;

import java.awt.*;

public interface Visitor<type> {
    type visitBook(Carte carte);
    type visitParagraf(Paragraf paragraf);
    type visitSection(Section section);
    type visitTable(Tabel tabel);
    type visitImagine(Imagine image);
    type visitImageProxy(ImageProxy imageProxy);

}
