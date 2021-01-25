package ru.sapteh.dao.impl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.ServicesDAO;
import ru.sapteh.models.Services;

public class ServicesDAOImpl implements ServicesDAO<Services, Integer> {

    private final SessionFactory factory;

    public ServicesDAOImpl(SessionFactory factory){
        this.factory = factory;
    }

    @Override
    public void create(Services services) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(services);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Services services) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(services);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Services services) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(services);
            session.getTransaction().commit();
        }
    }

    @Override
    public Services read(Integer id) {
        try(Session session = factory.openSession()){
            final Services result = session.get(Services.class, id);
            if(result != null){
                Hibernate.initialize(result.getIdStatus());
            }
            return result;
        }
    }
}
