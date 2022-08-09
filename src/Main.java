public class Main {
    public static void main(String[] args) {
        Book muMu = new Book("Mu-Mu", "Ivan Turgenev", 2000);
        Book dogHeart = new Book("Dog's heart", "Mikhail Bulgakov", 2011);
        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author turgenev = new Author("Ivan", "Turgenev");

        //Условия заданий повышенной сложности - https://skypro.slack.com/archives/C02R4PPHQGM/p1659523312899989

        Library library = new Library(10);

        library.addBook(muMu);
        library.addBook(dogHeart);

        library.printCharactersOfAllBooks();
        library.printBookInfo("Mu-mu");

        library.changePublicationYear("mu-mu", 2007);
        library.printBookInfo("Mu-mu");

        //Проверка свойств объектов, геттеров и сеттеров
        System.out.println();
        Printer.printBookProperties(muMu);

        muMu.setPublicationYear(2022);
        System.out.println("muMu.getPublicationYear() = " + muMu.getPublicationYear());
        System.out.println();

        Printer.printBookProperties(dogHeart);
        Printer.printAuthorProperties(turgenev);
        Printer.printAuthorProperties(bulgakov);
    }


}