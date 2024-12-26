package Adapter;

public class ITextPdfAdapter implements PdfAdapter {

	@Override
	public void gererated(String fileName, String content) {
		// Lógica sobre criar um PDF usando a biblioteca IText.
		System.out.println("PDF criado com a biblioteca IText");
	}
}
