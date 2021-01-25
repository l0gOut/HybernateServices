package ru.sapteh.dao;

public interface ServicesDAO <Entity, Key> {

    void create (Entity o);
    void update (Entity o);
    void delete (Entity o);
    Entity read(Key key);

}
