public class Main {
    public static void main(String[] args) {
        Book mumu = new Book("Mumu", "Ivan Turgenev", 2000);
        Book dogHeart = new Book("Dog's heart", "Mikhail Bulgakov", 2011);
        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author turgenev = new Author("Ivan", "Turgenev");

        //Условия заданий повышенной сложности - https://skypro.slack.com/archives/C02R4PPHQGM/p1659523312899989

        Library library = new Library(10);

        library.addBook(mumu);
        library.addBook(dogHeart);

        library.printCharactersOfAllBooks();
        library.printBookInfo("Mumu");

        library.changePublicationYear("mumu", 2007);
        library.printBookInfo("Mumu");

        //Проверка свойств объектов, геттеров и сеттеров
        System.out.println();
        Printer.printBookProperties(mumu);

        mumu.setPublicationYear(2022);
        System.out.println("mumu.getPublicationYear() = " + mumu.getPublicationYear());
        System.out.println();

        Printer.printBookProperties(dogHeart);
        Printer.printAuthorProperties(turgenev);
        Printer.printAuthorProperties(bulgakov);
    }


}