package Adapter;

public class SalesReportGenerator {

	public SalesReportGenerator(PdfAdapter pdfAdapter) {
		super();
		this.pdfAdapter = pdfAdapter;
	}

	public PdfAdapter pdfAdapter;

	public void generator() {
		this.pdfAdapter.gererated("fileName", "Content");
	}

}
