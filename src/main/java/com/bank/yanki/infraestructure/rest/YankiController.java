package com.bank.yanki.infraestructure.rest;

import com.bank.yanki.application.YankiOperations;
import com.bank.yanki.domain.Yanki;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/yanki")
@RequiredArgsConstructor
public class YankiController {

    private final YankiOperations yankiOperations;

    @GetMapping
    public Flux<Yanki> get() {
        return yankiOperations.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Yanki> getId(@PathVariable String id) {
        return yankiOperations.findById(id);
    }

    @PostMapping("/add")
    public Mono<Yanki> post(@RequestBody Yanki yanki) {
        return yankiOperations.save(yanki);
    }

    @PutMapping("/{id}")
    public Mono<Yanki> put(@PathVariable String id, @RequestBody Yanki yanki) {
        return yankiOperations.update(id, yanki);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return yankiOperations.delete(id);
    }

}
