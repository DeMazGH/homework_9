public class Main {
    public static void main(String[] args) {
        Book muMu = new Book("Mu-Mu", "Ivan Turgenev", 2000);
        Author turgenev = new Author("Ivan", "Turgenev");

        System.out.println("turgenev.getFirstName() = " + turgenev.getFirstName());
        System.out.println("turgenev.getLastName() = " + turgenev.getLastName());

        System.out.println("muMu.getName() = " + muMu.getName());
        System.out.println("muMu.getAuthor() = " + muMu.getAuthor());
        System.out.println("muMu.getPublicationYear() = " + muMu.getPublicationYear());
        muMu.setPublicationYear(2022);
        System.out.println("muMu.getPublicationYear() = " + muMu.getPublicationYear());
    }

}