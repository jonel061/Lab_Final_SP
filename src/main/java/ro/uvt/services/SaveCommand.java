package ro.uvt.services;
import ro.uvt.*;
import ro.uvt.models.BookStatistics;
import ro.uvt.models.Carte;
import ro.uvt.models.Visitor;
import ro.uvt.services.*;

import java.io.BufferedWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SaveCommand implements Command {
    Carte b;
    String fisierCarte;

    public SaveCommand(Carte b, String fisierCarte) {
        this.b = b;
        this.fisierCarte = fisierCarte;
    }

    @Override
    public void execute() {
        Visitor<String> v = new BookJsonVisitor();

        String bookJson = v.visitBook(b);

        Path file = Paths.get(fisierCarte);
        file.resolve("carte.json");
        System.out.println(file);


        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write(bookJson);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}