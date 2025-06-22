package Week1.DesignPatternAndPrinciple.Excercise2;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}