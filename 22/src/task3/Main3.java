package task3;

public class Main3 {
    public static void main(String[] args) {
        CreateTextDocument createTextDocument = new CreateTextDocument();
        IDocument idocument = createTextDocument.CreateNew();
        idocument.Open();
        idocument.Exit();
        idocument.Save();
        idocument.New();
    }
}
