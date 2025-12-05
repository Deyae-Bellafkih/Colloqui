public class RegistroColloqui {

    private Colloquio[] prenotazioni;

    public RegistroColloqui() {
        prenotazioni = new Colloquio[4];
    }

    public boolean prenotaColloquio(Colloquio c) {
        for (int i = 0; i < prenotazioni.length; i++) {
            if (prenotazioni[i] == null) {
                prenotazioni[i] = c;
                return true;
            }
        }
        return false;
    }

    public boolean cancellaPrenotazione(String nomeGenitore, String nomeFiglio) {
        for (int i = 0; i < prenotazioni.length; i++) {
            if (prenotazioni[i] != null && prenotazioni[i].getNomeGenitore().equals(nomeGenitore) && prenotazioni[i].getNomeFiglio().equals(nomeFiglio)) {
                prenotazioni[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean isSlotPrenotato(int slot) {
        for (int i = 0; i < prenotazioni.length; i++) {
            if (prenotazioni[i] != null && prenotazioni[i].getSlot() == slot) {
                return true;
            }
        }
        return false;
    }

    public int proponiSlotLibero() {
        for (int i = 1; i <= 4; i++) {
            if (!isSlotPrenotato(i)) {
                return i;
            }
        }
        return -1;
    }
}