package pool;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ObjectPool {

    protected Set<Conection> inUse = new HashSet<Conection>();
    protected Set<Conection> isAvailable = new HashSet<Conection>();
    protected static final int POOL_SIZE = 3;

    public synchronized Conection checkOut() {
        if (inUse.size() < POOL_SIZE) {
            if (isAvailable.isEmpty() == true) {
                isAvailable.add(new Conection());
            }
            Optional<Conection> first = isAvailable.stream().findFirst();
            if (first.isPresent()) {
                inUse.add(first.get());
                isAvailable.remove(first.get());
                return first.get();
            }
        }
        return null;
    }


    public synchronized void checkIn(Conection conection) {
        inUse.remove(conection);
        isAvailable.add(conection);
    }



}
