package pro.sky.hw1;

public class Book {

    private String name;
    private int year;
    private Author author;

    private static int counter;

    public Book() {
        counter++;
    }

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }


    void test() {
        String name = "sdf";
        System.out.println(author);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCreatedBooks() {
        return counter;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }
}
