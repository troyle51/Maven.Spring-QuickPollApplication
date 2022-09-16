package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public class VoteRepository implements CrudRepository<Vote, Long> {
    @Override
    public <S extends Vote> S save(S s) {
        return null;
    }

    @Override
    public <S extends Vote> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Vote findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Vote> findAll() {
        return null;
    }

    @Override
    public Iterable<Vote> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Vote vote) {

    }

    @Override
    public void delete(Iterable<? extends Vote> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
