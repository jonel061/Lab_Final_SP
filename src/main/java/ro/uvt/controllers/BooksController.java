package ro.uvt.controllers;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.models.*;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;



@RestController
@RequestMapping("/carte")
public class BooksController {

    private final JpaRepository<Carte, Integer> BooksRepository ;
    private final AllBooksSubject allBooksSubject;


    @Autowired
    public BooksController(JpaRepository<Carte, Integer> BooksRepository, AllBooksSubject allBooksSubject) {
        this.BooksRepository = BooksRepository;
        this.allBooksSubject =allBooksSubject;
    }

  /*  @PostMapping
    public int saveCarteToDB() {
        Carte carte = createCarte();
        carte = BooksRepository.save(carte);
        return carte.getId();
    }
*/
  @OneToMany( cascade = CascadeType.ALL)
    private Carte createCarte(){
        List<Autor> autori = Arrays.asList(new Autor("George Mart"), new Autor("NotGeorge Mart"));

        Carte c = new Carte((List<Autor>) autori, "Cartea");
        c.add(new Paragraf("aa"));
        Section s1 = new Section("bb");
        s1.add(new Imagine("cc"));
        c.add(s1);

        return c;
    }



   @GetMapping
    public String getAll(){
        return "string";
    }

    @SneakyThrows
    @GetMapping("/{Id}")
    public ResponseEntity<Element> getBook(@PathVariable Integer Id) {
        Carte carte = BooksRepository.getOne(Id);
        return new ResponseEntity<>(carte, HttpStatus.OK);
    }

    @PostMapping
    public String newBook() {
        Carte carte = createCarte();
        carte = BooksRepository.save(carte);
        allBooksSubject.add(carte);
        return "Book saved [" + carte.getId() + "] " + carte.getTitlu();
    }

}
