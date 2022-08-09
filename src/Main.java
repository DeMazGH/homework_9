public class Main {
    public static void main(String[] args) {
        Book muMu = new Book("Mu-Mu", "Ivan Turgenev", 2000);
        Book dogHeart = new Book("Dog's heart", "Mikhail Bulgakov", 2011);
        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author turgenev = new Author("Ivan", "Turgenev");

        Printer.printBookProperties(muMu);

        muMu.setPublicationYear(2022);
        System.out.println("muMu.getPublicationYear() = " + muMu.getPublicationYear());
        System.out.println();

        Printer.printBookProperties(dogHeart);

        Printer.printAuthorProperties(turgenev);

        Printer.printAuthorProperties(bulgakov);
    }

}