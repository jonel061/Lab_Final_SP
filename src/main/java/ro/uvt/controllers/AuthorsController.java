/*package ro.uvt.controllers;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.models.Autor;
import ro.uvt.models.Carte;
import ro.uvt.models.Element;
import ro.uvt.models.Element;
import ro.uvt.persistence.AuthorsRepository;

@RestController
@RequestMapping("/Author")
public class AuthorsController {
    private final JpaRepository<Autor, Integer> authorsRepository;

    @Autowired
    public AuthorsController(JpaRepository<Autor, Integer> authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    @PostMapping
    public int saveAutorToDB() {
        Autor autor = new Autor();
        Autor autor  = AuthorsRepository.save(autor);
        return autor.getIdAutor();
    }

    @GetMapping
    public String getAll() {
        return "string2";
    }


    @SneakyThrows
    @GetMapping("/{id}")
    public ResponseEntity<Element> getAuthor(@PathVariable Integer id) {
        Autor autor = AuthorsRepository.getOne(id);
        return new ResponseEntity<>(autor , HttpStatus.OK);
   }

}

*/
