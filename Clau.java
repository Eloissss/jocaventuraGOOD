public class Clau extends Item {
    private String idPany;

    public Clau(String id) {
        super("clau",  "Una Clau", true);
        this.idPany = id;
    }

    public String getidPany() {
        return idPany;
    }
}
