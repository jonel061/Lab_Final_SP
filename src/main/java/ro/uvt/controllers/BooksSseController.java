package ro.uvt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.models.AllBooksSubject;
import ro.uvt.services.SseObserver;


public class BooksSseController {
    private final AllBooksSubject allBooksSubject;

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }
    @Autowired
    public   BooksSseController(AllBooksSubject allBooksSubject){
        this.allBooksSubject= allBooksSubject;


    }
}
