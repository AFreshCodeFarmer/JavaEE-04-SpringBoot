package edu.bjtu.sse.djd.demo.service;

import edu.bjtu.sse.djd.demo.repository.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 董金达
 * @version 1.0
 * @name BaseService
 * @date 2020/5/20 23:18
 **/

public abstract class BaseService<E, PK, R extends AbstractRepository<E, PK>> extends AbstractService<E, PK> {

    @Autowired
    protected R repository;

    @Override
    public AbstractRepository<E, PK> getRepository() {
        return repository;
    }
}
