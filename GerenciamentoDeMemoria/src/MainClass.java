
public class MainClass {
	public static void main(String[] args) {
		
		
		/*Produto p1;
		
		p1 = new Produto();
		p1.setId(1);
		p1.setDescricao("computador");
		p1.setPreco(1000.0);
		
		
		System.out.println("Produto 1 = "+p1.getId()+"/"+p1.getDescricao()+"/"+p1.getPreco());
		
		Produto p2 = p1;
		
		p2.setPreco(2000.0);
		
		System.out.println("Produto 2 = "+p2.getId()+"/"+p2.getDescricao()+"/"+p2.getPreco());
		System.out.println("Produto 1 = "+p1.getId()+"/"+p1.getDescricao()+"/"+p1.getPreco());
		
		p1 = new Produto();
		p1.setId(2);
		p1.setDescricao("mouse");
		p1.setPreco(30);
		
		System.out.println("Produto 1 = "+p1.getId()+"/"+p1.getDescricao()+"/"+p1.getPreco());
		System.out.println("Produto 2 = "+p2.getId()+"/"+p2.getDescricao()+"/"+p2.getPreco());
		
		p2 = new Produto();
		p2.setId(3);
		p2.setDescricao("teclado");
		p2.setPreco(100);
		
		System.out.println("Produto 1 = "+p1.getId()+"/"+p1.getDescricao()+"/"+p1.getPreco());
		System.out.println("Produto 2 = "+p2.getId()+"/"+p2.getDescricao()+"/"+p2.getPreco());
		*/
		
		
		Produto p = null;
		for (int i=1; i<100; i++) {
			p = new Produto();
			p.setId(i);
			p.setDescricao("produto "+i);
			p.setPreco(i * 10);
		}
		
		//System.gc();  // "força" a chamada do Garbage Collector
		System.out.println("Sobrou o produto "+p.getId());
		System.out.println("Fim do programa!!");
	}

}
