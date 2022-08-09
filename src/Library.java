public class Library {

    private final Book[] allBooks;

    public Library(int arraySize) {
        this.allBooks = new Book[arraySize];
    }

    public void addBook(Book newBook) {
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
                System.out.println(book.getAuthor() + ": " + book.getName() + ": " + book.getPublicationYear());
            } else {
                break;
            }
        }
    }

    public void printBookInfo(String bookTitle) {
        for (Book book : allBooks) {
            if (book == null) {
                System.out.println("Book not found.");
                break;
            } else if (bookTitle.equalsIgnoreCase(book.getName())) {
                System.out.println(book.getName() + " by " + book.getAuthor() +
                        " published was " + book.getPublicationYear());
                break;
            }
        }
    }

    public void changePublicationYear(String bookTitle, int newPublicationYear) {
        for (Book allBook : allBooks) {
            if (allBook == null) {
                break;
            } else if (bookTitle.equalsIgnoreCase(allBook.getName())) {
                allBook.setPublicationYear(newPublicationYear);
                break;
            }
        }
    }
}
