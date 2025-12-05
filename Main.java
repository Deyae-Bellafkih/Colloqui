public class Main {

    public static void main(String[] args) {

        RegistroColloqui prenotazioni = new RegistroColloqui();
        Colloquio c1 = new Colloquio("Leonardo Belotti", "Marco Belotti", "4IE", 1);
        Colloquio c2 = new Colloquio("Gianni Viscardi", "Tommaso Viscardi", "4IE", 2);
        Colloquio c3 = new Colloquio("Luca Bianchi", "Mauro Bianchi", "4IE", 3);
        Colloquio c4 = new Colloquio("Teresa Belotti", "Marco Carminati", "4IE", 4);


        prenotazioni.prenotaColloquio(c1);
        prenotazioni.prenotaColloquio(c2);
        prenotazioni.prenotaColloquio(c3);
        prenotazioni.prenotaColloquio(c4);

        prenotazioni.cancellaPrenotazione("Gianni Viscardi", "Tommaso Viscardi");

        System.out.println("Slot 1 occupato: " + prenotazioni.isSlotPrenotato(c1.getSlot()) + " da " + c1.getNomeGenitore());
        System.out.println("Slot 2 occupato: " + prenotazioni.isSlotPrenotato(c2.getSlot()) + " da " + c2.getNomeGenitore());
        System.out.println("Slot 3 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot()) + " da " + c3.getNomeGenitore());
        System.out.println("Slot 4 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot()) + " da " + c4.getNomeGenitore());




        System.out.println("Dopo la rimozione:");
        System.out.println("Slot 1 occupato: " + prenotazioni.isSlotPrenotato(c1.getSlot()));
        System.out.println("Slot 2 occupato: " + prenotazioni.isSlotPrenotato(c2.getSlot()));
        System.out.println("Slot 3 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot()));
        System.out.println("Slot 4 occupato: " + prenotazioni.isSlotPrenotato(c4.getSlot()));


        int slotLibero = prenotazioni.proponiSlotLibero();
        if (slotLibero != -1) {
            System.out.println("Slot libero disponibile: " + slotLibero);
        } else {
            System.out.println("Nessuno slot libero disponibile.");
        }
    }
}
