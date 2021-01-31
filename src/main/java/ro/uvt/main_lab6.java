package ro.uvt;

import ro.uvt.models.*;

public class main_lab6 {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraf p1 = new Paragraf("Paragraph 1");
        cap1.add(p1);
        Paragraf p2 = new Paragraf("Paragraph 2");
        cap1.add(p2);
        Paragraf p3 = new Paragraf("Paragraph 3");
        cap1.add(p3);
        Paragraf p4 = new Paragraf("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Imagine("ImageTwo"));
        cap1.add(new Paragraf("Some text"));
        cap1.add(new Tabel("Table 1"));

        BookStatistics stats = new BookStatistics();

        cap1.accept(stats);
        stats.printStatistics();


        //new FileExporterWithVisitor("accounts2.json", new JsonVisitor()).export(carte);

        //carte.accept(new BookSaveVisitor("carte.json"));
    }

}
