package ro.uvt;

import ro.uvt.models.Autor;
import ro.uvt.models.Carte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ro.uvt.services.*;

public class Lab8 {
    public static void main(String[] args)
    {
        List<Autor> autori = Arrays.asList(new Autor("Autor 1"));
        Carte b = new Carte((ArrayList<Autor>) autori,"titlu1");

        //Command comanda2 = new OpenCommand("titlu1", "blabla");
        //comanda2.execute();  //de continuat


        Command command = new SaveCommand(b,"carte.json");
        command.execute();



    }
}