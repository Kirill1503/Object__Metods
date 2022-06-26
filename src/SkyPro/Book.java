package SkyPro;
import java.util.Objects;
    public class Book {
        private Author author;
        private String title;
        private int yearPublication;

        public Book(String title, int yearPublication, Author author) {
            this.title = title;
            this.yearPublication = yearPublication;
            this.author = author;
        }
        public String getTitle() {
            return this.title;
        }
        public int getYearPublication() {
            return this.yearPublication;
        }
        public void setYearPublication(int yearPublication) {
            this.yearPublication = yearPublication;
        }
        public String toString() {
            return title + ": " + yearPublication + author;
        }
        public boolean equals (Object other) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
            Book book = (Book) other;
            boolean i;
            i = title.equals(book.title) && yearPublication == book.yearPublication && author.equals(book.author);
            return i;
        }
        public int hashCode() {
            return Objects.hash(title);
        }
    }