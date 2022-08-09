public class Main {
    public static void main(String[] args) {
        Book muMu = new Book("Mu-Mu", "Ivan Turgenev", 2000);
        Book dogHeart = new Book("Dog's heart", "Mikhail Bulgakov", 2011);
        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author turgenev = new Author("Ivan", "Turgenev");

        Book[] allBooks = new Book[10];
        addBook(muMu, allBooks);
        addBook(dogHeart, allBooks);

        printCharactersOfAllBooks(allBooks);

//        String aaa = bulgakov.getFirstName() + " " +  bulgakov.getLastName();
//        System.out.println(aaa);

//        Printer.printBookProperties(muMu);
//
//        muMu.setPublicationYear(2022);
//        System.out.println("muMu.getPublicationYear() = " + muMu.getPublicationYear());
//        System.out.println();
//
//        Printer.printBookProperties(dogHeart);
//
//        Printer.printAuthorProperties(turgenev);
//
//        Printer.printAuthorProperties(bulgakov);
    }

    public static void addBook(Book newBook, Book[] allBooks) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = newBook;
                break;
            }
        }
    }

    public static void printCharactersOfAllBooks(Book[] allBooks) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] != null) {
                System.out.println(allBooks[i].getAuthor() + ": " + allBooks[i].getName() + ": " + allBooks[i].getPublicationYear());
            } else {
                break;
            }
        }
    }

}