package ro.uvt.services;

import lombok.SneakyThrows;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.models.Carte;

import java.io.IOException;


public class SseObserver implements Observer {

    private final ResponseBodyEmitter emitter;

    @Override

    public void update(Carte carte) {

        try {
            emitter.send(carte, MediaType.APPLICATION_JSON);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  SseObserver(ResponseBodyEmitter emitter ){
        this.emitter= emitter;


    }


}


