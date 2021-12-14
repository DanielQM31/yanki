package com.bank.yanki.infraestructure.repository;

import com.bank.yanki.application.model.YankiRepository;
import com.bank.yanki.domain.Yanki;
import com.bank.yanki.infraestructure.model.dao.YankiDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class YankiCrudRepository implements YankiRepository {

    @Autowired
    IYankiCrudRepository repository;

    @Override
    public Flux<Yanki> findAll() {
        return repository.findAll()
                .map(this::mapYankiDaoToYanki);
    }

    @Override
    public Mono<Yanki> findById(String id) {
        return repository.findById(id)
                .map(this::mapYankiDaoToYanki);
    }

    @Override
    public Mono<Yanki> save(Yanki yanki) {
        return repository.save(mapYankiToYankiDao(yanki))
                .map(this::mapYankiDaoToYanki);
    }

    @Override
    public Mono<Yanki> update(String id, Yanki yanki) {
        return repository.save(mapYankiToYankiDao(yanki))
                .map(this::mapYankiDaoToYanki);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    private Yanki mapYankiDaoToYanki(YankiDao yankiDao){
        Yanki yanki = new Yanki();
        BeanUtils.copyProperties(yankiDao, yanki);
        return yanki;
    }

    private YankiDao mapYankiToYankiDao(Yanki yanki){
        YankiDao yankiDao = new YankiDao();
        BeanUtils.copyProperties(yanki, yankiDao);
        return yankiDao;
    }


}
