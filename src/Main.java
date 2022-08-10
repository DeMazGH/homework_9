public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author turgenev = new Author("Ivan", "Turgenev");
        Book mumu = new Book("Mumu", turgenev, 2000);
        Book dogHeart = new Book("Dog's heart", bulgakov, 2011);

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
        System.out.println(mumu);

        mumu.setPublicationYear(2022);
        System.out.println("mumu.getPublicationYear() = " + mumu.getPublicationYear());
        System.out.println();

        System.out.println(dogHeart);
        System.out.println(turgenev);
        System.out.println(bulgakov);
    }


}