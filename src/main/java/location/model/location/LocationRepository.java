package location.model.location;

import location.model.Location;

import java.util.HashMap;
import java.util.Map;

public class LocationRepository {

    //Instancja Singletona
    private static LocationRepository instance = null;

    //Zmienne Singletona
    public Map<Integer, Location> locations;

    //Singleton musi mieć prywatny konstruktor
    private LocationRepository() {
        locations = new HashMap<>();
        locations.put(1, new Location(1, "Lodz", "94-058", "Batalionow", "2"));
        locations.put(2, new Location(2, "Lodz", "90-550", "Rudzka", "4"));
        locations.put(3, new Location(3, "Lodz", "91-232", "Brzeska", "8"));
        locations.put(4, new Location(4, "Lodz", "94-002", "Mickiewicza", "18"));
    }


    //Pobranie oraz inicjalizacja instancji Singletona
    //Klient (lib sama klasa) nie może utworzyć obiektu poprzez new
    public static LocationRepository getInstance() {
        if (instance == null) {
            synchronized (LocationRepository.class) {
                if (instance == null) {
                    instance = new LocationRepository();
                }
            }
        }
        return instance;
    }

    public void addLocation(Location location) {
        locations.put(location.getId(), location);
    }

    public void deleteLocation(Location location) {
        locations.remove(location.getId());
    }

    public Location findbyId(int id) {
        return locations.get(id);
    }

    /*public LocationRepository(){
        locations.put(1, new Location(1, "Lodz", "94-058", "Batalionow", "2"));
        locations.put(2, new Location(2, "Lodz", "90-550", "Rudzka", "4"));
        locations.put(3, new Location(3, "Lodz", "91-232", "Brzeska", "8"));
        locations.put(4, new Location(4, "Lodz", "94-002", "Mickiewicza", "18"));
    }*/
}
