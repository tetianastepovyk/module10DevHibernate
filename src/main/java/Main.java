import service.ClientCrudService;
import service.PlanetCrudService;
import service.HibernateUtil;
import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        final String url = "jdbc:h2:./module10DevHibernate";

        Flyway.configure()
                .dataSource(url, null, null)
                .load()
                .migrate();


        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();

        clientCrudService.create("Bobo Lions");
        System.out.println(clientCrudService.get(11));
        clientCrudService.update(2, "UpdatedName Client");
        clientCrudService.delete(6L);


        planetCrudService.create("MERC", "Mercury");
        System.out.println(planetCrudService.get("MERC"));
        planetCrudService.update("MARS", "UpdatedPlanet");
        planetCrudService.delete("JUP");

        HibernateUtil.getInstance().close();
    }
}
