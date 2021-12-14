package com.bank.yanki.application;

import com.bank.yanki.domain.Yanki;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiOperations {

    public Flux<Yanki> findAll();
    public Mono<Yanki> findById(String id);
    public Mono<Yanki> save(Yanki yanki);
    public Mono<Yanki> update(String id, Yanki yanki);
    public Mono<Void> delete(String id);

}
