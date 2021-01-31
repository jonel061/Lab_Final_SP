package ro.uvt.models;

public class BookStatistics implements Visitor<Integer> {

    int paragraphsCounter=0,sectionsCounter=0,imageproxy=0,imagesCounter=0,tablesCounter=0;

    @Override
    public Integer visitBook(Carte carte) {
        return 0;
    }

    @Override
    public Integer visitSection(Section s) {
        sectionsCounter++;
        return sectionsCounter;
    }

    @Override
    public Integer visitParagraf(Paragraf p) {
        //paragraphsCounter++;
        return paragraphsCounter++;
    }

    @Override
    public Integer visitImageProxy(ImageProxy ip) {
         return imageproxy++;
    }

    @Override
    public Integer visitImagine(Imagine i) {
        return imagesCounter++;
    }

    @Override
    public Integer visitTable(Tabel t) {
        return tablesCounter++;
    }

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("+++ Number of images: "+imagesCounter);
        System.out.println("+++ Number of tables: "+tablesCounter);
        System.out.println("+++ Number pf paragraphs: "+paragraphsCounter);
        System.out.println("+++ Number of sections: "+sectionsCounter);
    }
}