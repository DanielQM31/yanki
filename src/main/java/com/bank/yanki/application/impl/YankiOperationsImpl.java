package com.bank.yanki.application.impl;

import com.bank.yanki.application.YankiOperations;
import com.bank.yanki.application.model.YankiRepository;
import com.bank.yanki.domain.Yanki;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class YankiOperationsImpl implements YankiOperations {

    private final YankiRepository repository;

    @Override
    public Flux<Yanki> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Yanki> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Yanki> save(Yanki yanki) {
        return repository.save(yanki);
    }

    @Override
    public Mono<Yanki> update(String id, Yanki yanki) {
        return repository.update(id, yanki);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
