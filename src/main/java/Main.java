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

        clientCrudService.createClient("Bobo Lions");
        System.out.println(clientCrudService.getClientById(11));
        clientCrudService.updateClient(2, "UpdatedName Client");
        clientCrudService.deleteClientById(6L);


        planetCrudService.createPlanet("MERC", "Mercury");
        System.out.println(planetCrudService.getPlanetById("MERC"));
        planetCrudService.updatePlanet("MARS", "UpdatedPlanet");
        planetCrudService.deletePlanet("JUP");

        HibernateUtil.getInstance().close();
    }
}
