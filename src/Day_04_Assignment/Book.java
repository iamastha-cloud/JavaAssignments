package Day_04_Assignment;

public class Book {

        String title;
        String author;
        int pages;

        public Book(String t, String a, int p) {
            title = t;
            author = a;
            pages = p;
        }
        public void getSummary() {
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages : " + pages);
        }

        public static void main(String[] args) {
            Book book1 = new Book("Titli", "Manav Kaul", 208);
            Book book2 = new Book("Buy Yourself The Damn Flowers", "Tam Kaur", 320);

            book1.getSummary();
            book2.getSummary();
        }
    }


