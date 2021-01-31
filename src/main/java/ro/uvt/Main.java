package ro.uvt;
import ro.uvt.models.*;
import ro.uvt.services.*;
import java.util.*;

import ro.uvt.models.Paragraf;
import ro.uvt.models.Section;
import ro.uvt.services.AlignLeft;
import ro.uvt.services.AlignRight;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hi!");

          Section section = new Section();
        List<Autor> autori = Arrays.asList(new Autor("George Mart"));

        Carte c = new Carte((ArrayList<Autor>) autori, "Cartea");
        c.add(new Paragraf("aa"));
        Section s1 = new Section("bb");
        s1.add(new Imagine("cc"));
        c.add(s1);
        //c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel(), new Tabel()));

         //c.render();

        long startTime = System.currentTimeMillis();
        Element img1 = new ImageProxy ("Pamela Anderson");
        Element img2 = new ImageProxy ("Kim");
        Element img3 = new ImageProxy ("Kirby");

        Section section1 = new Section ("Front");
        section1.add(img1);

        Section section2 = new Section ("Summer");
        section2.add(img2);
        section2.add(img3);

        Carte book = new Carte ((ArrayList<Autor>) autori, "Cartea");
        book.add(section1);
        book.add(section2);

        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        //section1.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        //section1.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");


        startTime = System.currentTimeMillis();
        //section2.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing of the section 2 took " + (endTime - startTime) + " milliseconds");
        Section cap1 = new Section("Capitolul 1");
        Paragraf p1 = new Paragraf("Paragraph 1");
        cap1.add(p1);
        Paragraf p2 = new Paragraf("Paragraph 2");
        cap1.add(p2);
        Paragraf p3 = new Paragraf("Paragraph 3");
        cap1.add(p3);
        Paragraf p4 = new Paragraf("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        //cap1.render();


        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        //cap1.render();

    }
}
