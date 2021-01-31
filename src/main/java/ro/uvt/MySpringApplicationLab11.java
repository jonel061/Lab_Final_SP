package ro.uvt;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ro.uvt.controllers.BooksController;
import ro.uvt.models.Carte;
import ro.uvt.models.Section;
import ro.uvt.spring.ClientComponent;
import ro.uvt.spring.SingletonComponent;
import ro.uvt.spring.TransientComponent;

//@EnableJpaRepositories(basePackages="ro.uvt", entityManagerFactoryRef="emf")
@SpringBootApplication
public class MySpringApplicationLab11 {
    public static void main(String[] args) {
        SpringApplication.run(MySpringApplicationLab11.class, args);
    }
}