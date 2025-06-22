package Java_FSA;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] book = {
                new Book(101, "Harry Potter", "J K Rowling"),
                new Book(102, "Ignited Minds", "APJ Abdul Kalam"),
                new Book(103, "Too good to be true", "Prajakta Koli"),
                new Book(104, "How to win friends and influence people", "Carnige Dale"),
                new Book(105, "The power of the subconsious Mind", "Unknown")
        } ;
        //Linear Search
        System.out.println("Linear Search Alogrithm to find the Book 'Ignited Minds' ");
        System.out.println(linearSearch(book, "Ignited Minds")!=null? linearSearch(book, "Ignited Minds"): "Book not Found");

        Arrays.sort(book);

        //Binary Search
        System.out.println("Binary Search Alogrithm to find the Book 'Ignited Minds' ");
        System.out.println(binarySearch(book, "Ignited Minds")!=null? binarySearch(book, "Ignited Minds"): "Book not Found");
    }


    public static Book linearSearch(Book[] book, String title){
        for(int i=0; i<book.length; i++){
            if(book[i].title.equalsIgnoreCase(title)){
                return book[i];
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] book, String title){
        int left = 0;
        int right = book.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            int cmp = title.compareToIgnoreCase(book[mid].title);
            if(cmp==0) return book[mid];
            else if(cmp<0) right = mid-1;
            else left = mid+1;
        }
        return null;
    }
}
