package ru.sapteh;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.ServicesDAO;
import ru.sapteh.dao.impl.ServicesDAOImpl;
import ru.sapteh.models.Services;
import ru.sapteh.models.Statuses;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        ServicesDAO<Services, Integer> servicesDAO = new ServicesDAOImpl(factory);

        Services servicesRead = servicesDAO.read(2);

        Services services = new Services(5,"Алексей", "ООО", servicesRead.getIdStatus(),"10/10/2001");


//        servicesDAO.create(services);
//
//        servicesDAO.update(services);
//
//        servicesDAO.delete(services);

    }

}
