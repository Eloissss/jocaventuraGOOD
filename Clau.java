public class Clau extends Item {
    private String idPany;

    public Clau(String idPany) {
        super("calu", "Una Clau", true);
        this.idPany = idPany;
    }

    public String getidPany() {
        return idPany;
    }
}
