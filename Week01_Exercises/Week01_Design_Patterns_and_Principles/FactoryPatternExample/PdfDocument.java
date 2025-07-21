package FactoryPatternExample;

class PdfDocument implements Document{
    public void open(){
        System.out.println("Pdf Document");
    }
}