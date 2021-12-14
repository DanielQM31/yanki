package com.bank.yanki.infraestructure.repository;

import com.bank.yanki.infraestructure.model.dao.YankiDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IYankiCrudRepository extends ReactiveCrudRepository<YankiDao, String> {
}
