package Week1.DesignPatternAndPrinciple.Excercise2;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
        System.out.println("Processed: " + doc + "\n");
    }
}