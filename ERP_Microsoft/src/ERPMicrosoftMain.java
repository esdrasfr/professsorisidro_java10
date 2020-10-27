
public class ERPMicrosoftMain {
	public static void main(String[] args) {
		
		InterfaceMicrosoft iMs;
		
		iMs = new NucleoImportacao();
		
		iMs.getInvoiceDataAndImport("NEW INVOICE TO MICROSOFT US$ 1350.00");
	}

}
