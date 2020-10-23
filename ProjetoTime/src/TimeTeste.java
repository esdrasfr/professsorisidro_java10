
public class TimeTeste {
	public static void main(String[] args) {
		
		Time t = new Time();
		
		t.setHora(22);
		t.setMinu(20);
		t.setSegu(35);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}

}
