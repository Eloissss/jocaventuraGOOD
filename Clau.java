public class Clau extends Item {
    private String idPany;

    public Clau(String id) {
        super("calu",  "Una Clau", true);
        this.idPany = id;
    }

    public String getidPany() {
        return idPany;
    }
}
