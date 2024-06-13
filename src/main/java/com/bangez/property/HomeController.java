package com.bangez.property;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@RestController
public class HomeController {
    @GetMapping("/")
    public Flux<Object> home() {
        return Flux.concat(Flux.just("안녕", "Hello World"), Mono.just(LocalDate.now()));
    }
}
