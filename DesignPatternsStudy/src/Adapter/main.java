package Adapter;

public class main {

	public static void main(String[] args) {
		
		PdfAdapter pdfAdapter = new ITextPdfAdapter();
		SalesReportGenerator salesReportGenerator = new SalesReportGenerator(pdfAdapter);
		salesReportGenerator.generator();
	}

}
