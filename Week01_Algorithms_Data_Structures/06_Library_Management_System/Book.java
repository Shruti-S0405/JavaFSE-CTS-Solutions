package Java_FSA;
public class Book implements Comparable{
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int compareTo(Object o){
        Book p = null;
        if(o instanceof Book) p = (Book)o;
        if(p==null) return 0;
        return this.title.compareTo(p.title);
    }

    @Override
    public String toString(){
        return "{ Book id: "+bookId+ " , Book title: "+title+" , author: " +author+ " }";
    }
}
