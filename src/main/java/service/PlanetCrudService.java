package service;

import entity.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetCrudService {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void createPlanet(String id, String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        session.persist(planet);
        transaction.commit();
        session.close();
    }

    public Planet getPlanetById(String id) {
        Session session = sessionFactory.openSession();
        Planet planet = session.get(Planet.class, id);
        session.close();
        return planet;
    }

    public void updatePlanet(String id, String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Planet planet = session.get(Planet.class, id);
        planet.setName(name);
        session.persist(planet);
        transaction.commit();
        session.close();
    }

    public void deletePlanet(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Planet planet = session.get(Planet.class, id);
        session.remove(planet);
        transaction.commit();
        session.close();
    }

}
