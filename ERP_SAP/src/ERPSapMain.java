
public class ERPSapMain {
	public static void main(String[] args) {
		InterfaceSAP iSAP;
		
		iSAP = new NucleoImportacao();
		
		iSAP.importInvoiceDATA("INVOICE TOTAL US$ 1000.00");
	}

}
