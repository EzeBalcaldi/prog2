package recuperatorio2018;

public class CondicionPoliza extends Condicion {
	private String poliza;
	
	public CondicionPoliza(String poliza) {
		this.poliza = poliza;
	}

	public boolean seCumple(SeguroSimple s) {
		return poliza.equals(s.datos.get(poliza));
	}

}
