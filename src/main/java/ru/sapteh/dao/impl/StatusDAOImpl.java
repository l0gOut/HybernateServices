package ru.sapteh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.StatusDAO;
import ru.sapteh.models.Statuses;

public class StatusDAOImpl implements StatusDAO<Statuses> {

    private final SessionFactory factory;

    public StatusDAOImpl(SessionFactory factory){
        this.factory = factory;
    }

    @Override
    public void create(Statuses statuses) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(statuses);
            session.getTransaction().commit();
        }
    }
}
