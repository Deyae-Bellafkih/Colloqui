public class Colloquio {

    private String nomeGenitore;
    private String nomeFiglio;
    private String classe;
    private int slot;

    public Colloquio (String nomeGenitore,String nomeFiglio, String classe, int slot) {
        this.nomeGenitore = nomeGenitore;
        this.nomeFiglio = nomeFiglio;
        this.classe = classe;
        this.slot = slot;
    }

    public String getNomeGenitore() {
        return nomeGenitore;
    }

    public String getNomeFiglio() {
        return nomeFiglio;
    }

    public int getSlot() {
        return slot;
    }



}
