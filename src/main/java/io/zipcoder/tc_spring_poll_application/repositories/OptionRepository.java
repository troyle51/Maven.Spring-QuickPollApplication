package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public class OptionRepository implements CrudRepository<Poll, Long> {
    @Override
    public <S extends Poll> S save(S s) {
        return null;
    }

    @Override
    public <S extends Poll> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Poll findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Poll> findAll() {
        return null;
    }

    @Override
    public Iterable<Poll> findAll(Iterable<Long> iterable) {
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
    public void delete(Poll poll) {

    }

    @Override
    public void delete(Iterable<? extends Poll> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
