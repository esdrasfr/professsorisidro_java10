
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public String exibirHoraUniversal() {
		return hora + ":" + minu + ":" + segu;
	}
	
	public String exibirHoraPadrao() {
		String strHora;
		if (hora == 0) {
			strHora = 12 + ":" + minu + ":" + segu +" AM";
		}
		else if (hora == 12) {
			strHora = 12 + ":" + minu + ":" + segu + " PM";
		}
		else if (hora >= 1 && hora <= 11) {
			strHora = hora + ":" + minu + ":" + segu +" AM";
		}
		else {
			strHora = (hora-12) + ":" + minu + ":" + segu + " PM";
		}
		return strHora;
	}
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinu() {
		return minu;
	}
	public void setMinu(int minu) {
		this.minu = minu;
	}
	public int getSegu() {
		return segu;
	}
	public void setSegu(int segu) {
		this.segu = segu;
	}
	
}
