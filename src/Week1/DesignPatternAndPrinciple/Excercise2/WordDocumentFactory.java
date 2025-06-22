package Week1.DesignPatternAndPrinciple.Excercise2;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
