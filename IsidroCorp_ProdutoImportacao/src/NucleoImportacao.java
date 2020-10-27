
public class NucleoImportacao implements InterfaceSAP, InterfaceOracle, InterfaceMicrosoft{
	
	public void importarInvoice(String conteudoDaInvoice) {
		System.out.println("Importando conteudo da Invoice");
		System.out.println("Nova legislação - vigencia 11/2020");
		System.out.println("..... "+conteudoDaInvoice+ "......");
		System.out.println("... DONE");
	}

	@Override
	public void getInvoiceDataAndImport(String invoice) {
		importarInvoice(invoice);
		
	}

	@Override
	public void extractInvoiceInformation(String invoice) {
		importarInvoice(invoice);
		
	}

	@Override
	public void importInvoiceDATA(String xml) {
		importarInvoice(xml);
		
	}

}
