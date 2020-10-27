
public class ERPOracleMain {
	public static void main(String[] args) {
		InterfaceOracle iOracle;
		
		iOracle = new NucleoImportacao();
		
		iOracle.extractInvoiceInformation("INVOICE FROM ORACLE US$ 1200.00");
	}

}
