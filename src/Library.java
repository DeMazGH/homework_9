public class Library {

    private final Book[] allBooks;

    public Library(int arraySize) {
        this.allBooks = new Book[arraySize];
    }

    public void addBook(Book newBook) {
        if (allBooks[allBooks.length - 1] != null) {
            throw new RuntimeException("Библиотека переполнена");
        }
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = newBook;
                break;
            }
        }
    }

    public void printCharactersOfAllBooks() {
        for (Book book : allBooks) {
            if (book != null) {
                System.out.println(book.getAuthor() + ": " + book.getTitle() + ": " + book.getPublicationYear());
            }
        }
    }

    public void printBookInfo(String bookTitle) {
        for (Book book : allBooks) {
            if (bookTitle.equalsIgnoreCase(book.getTitle())) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() +
                        " published was " + book.getPublicationYear());
                break;
            }
        }
    }

    public void changePublicationYear(String bookTitle, int newPublicationYear) {
        for (Book allBook : allBooks) {
            if (allBook == null) {
                break;
            } else if (bookTitle.equalsIgnoreCase(allBook.getTitle())) {
                allBook.setPublicationYear(newPublicationYear);
                break;
            }
        }
    }
}
