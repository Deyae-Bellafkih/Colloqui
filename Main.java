public class Main {

    public static void main(String[] args) {

        RegistroColloqui prenotazioni = new RegistroColloqui();
        Colloquio c1 = new Colloquio("Pamela Conti", "Ilario Suardi", "4IE", 1);
        Colloquio c2 = new Colloquio("Genni Capelli", "Federico Mazzoleni", "4IE", 2);
        Colloquio c3 = new Colloquio("Luca Bianchi", "Mario Rossi", "4IE", 3);


        prenotazioni.prenotaColloquio(c1);
        prenotazioni.prenotaColloquio(c2);
        prenotazioni.prenotaColloquio(c3);

        System.out.println("Slot 1 occupato: " + prenotazioni.isSlotPrenotato(c1.getSlot()));
        System.out.println("Slot 2 occupato: " + prenotazioni.isSlotPrenotato(c2.getSlot()));
        System.out.println("Slot 3 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot()));

        prenotazioni.cancellaPrenotazione("Genni Capelli", "Federico Mazzoleni");

        System.out.println("Dopo la cancellazione:");
        System.out.println("Slot 1 occupato: " + prenotazioni.isSlotPrenotato(c1.getSlot()));
        System.out.println("Slot 2 occupato: " + prenotazioni.isSlotPrenotato(c2.getSlot()));
        System.out.println("Slot 3 occupato: " + prenotazioni.isSlotPrenotato(c3.getSlot()));










    }
}
