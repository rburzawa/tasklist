package pool;

public class Conection {

    private int id;
    private static int counter = 1;

    public Conection() {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conection{" +
                "id=" + id +
                '}';
    }
}
