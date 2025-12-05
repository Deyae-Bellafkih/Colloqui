public class Main {

    public static void main(String[] args) {

        RegistroColloqui prenotazioni = new RegistroColloqui();
        Colloquio c1 = new Colloquio("Pamela Conti", "Ilario Suardi", "4IE", 1);
        Colloquio c2 = new Colloquio("Genni Capelli", "Federico Mazzoleni", "4IE", 2);
        Colloquio c3 = new Colloquio("Luca Bianchi", "Mauro Rossi", "4IE", 3);

        prenotazioni.prenotaColloquio(c1);
        prenotazioni.prenotaColloquio(c2);
        prenotazioni.prenotaColloquio(c3);

        System.out.println("Slot 1 occupato: " + prenotazioni.isSlotPrenotato(c1.getSlot()) + " da " + c1.getNomeGenitore());
        System.out.println("Slot 2 occupato: " + prenotazioni.isSlotPrenotato(c2.getSlot())+ " da " + c2.getNomeGenitore());
        System.out.println("Slot 3 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot())+ " da " + c3.getNomeGenitore());

        prenotazioni.cancellaPrenotazione("Genni Capelli", "Federico Mazzoleni");

        System.out.println("Dopo la rimozione:");
        System.out.println("Slot 1 occupato: " + prenotazioni.isSlotPrenotato(c1.getSlot()));
        System.out.println("Slot 2 occupato: " + prenotazioni.isSlotPrenotato(c2.getSlot()));
        System.out.println("Slot 3 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot()));
    }
}
