package FactoryPatternExample;
public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordFactory();
        Document doc1 = factory.createDocument();
        doc1.open(); // Output: Opening Word Document

        factory = new PdfFactory();
        Document doc2 = factory.createDocument();
        doc2.open(); // Output: Opening PDF Document

        factory = new ExcelFactory();
        Document doc3 = factory.createDocument();
        doc3.open(); // Output: Opening Excel Document
    }
}