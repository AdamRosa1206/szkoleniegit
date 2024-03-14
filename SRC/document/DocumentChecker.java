package document;

public class DocumentChecker {
    public static void main(String[] args) {
        // Polimorfizm
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();

    }
}
