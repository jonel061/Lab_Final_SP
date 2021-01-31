package ro.uvt.services;

import ro.uvt.models.Autor;
import ro.uvt.models.Carte;

import java.util.List;

public class OpenCommand extends Carte {
    public OpenCommand(List<Autor> autori, String titlu) {
        super(autori, titlu);
    }


}
