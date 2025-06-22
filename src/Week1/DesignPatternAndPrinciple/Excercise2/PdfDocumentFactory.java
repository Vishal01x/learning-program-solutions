package Week1.DesignPatternAndPrinciple.Excercise2;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
