package ro.uvt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

   // @GeneratedValue(strategy = GenerationType.AUTO)

    private String nume;

    @Id
    private int id;

    public Autor(String nume) {
        this.nume=nume;
    }

   public int getIdAutor() {
        return id;
    }

    public Autor() {}

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
