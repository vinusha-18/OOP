package interfaces;
interface Printable {
    void printContent();
}

class PDFDocument implements Printable {
    public void printContent() {
        System.out.println("Printing PDF document");
    }
}

class WordDocument implements Printable {
    public void printContent() {
        System.out.println("Printing Word document");
    }
}

public class Printing_application {
	public static void main(String[] args) {
        Printable[] docs = { new PDFDocument(), new WordDocument() };

        for (Printable d : docs) {
            d.printContent();
        }
    }
}
