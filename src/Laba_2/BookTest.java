package Laba_2;

class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Fight club","Chuck Palahniuk",1996);

        String author = book.get_author();
        String name = book.get_name();
        int year = book.get_year();

        System.out.println("\tAuthor: " + author);
        System.out.println("\tBook: " + name);
        System.out.println("\tRelease date: " + year + "\n");

        book.change_author("Friedrich Nietzsche");
        book.change_name("Beyond good and evil");
        book.change_year(1886);

        author = book.get_author();
        name = book.get_name();
        year = book.get_year();

        System.out.println("\tAuthor: " + author);
        System.out.println("\tBook: " + name);
        System.out.println("\tRelease date: " + year);
    }
}
