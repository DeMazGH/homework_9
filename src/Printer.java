public class Printer {

    private Printer() {
    }

    public static void printBookProperties(Book book) {
        System.out.println("Свойства книги " + book.getName());
        System.out.println(".getName() = " + book.getName());
        System.out.println(".getAuthor() = " + book.getAuthor());
        System.out.println(".getPublicationYear() = " + book.getPublicationYear());
        System.out.println();
    }

    public static void printAuthorProperties(Author author) {
        System.out.println("Данные автора " + author.getFirstName() + " " + author.getLastName());
        System.out.println(".getFirstName() = " + author.getFirstName());
        System.out.println(".getLastName() = " + author.getLastName());
        System.out.println();
    }
}
