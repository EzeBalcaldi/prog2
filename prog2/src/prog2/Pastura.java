package prog2;

import java.util.Vector;

public class Pastura extends Cereal {
	private int superficieMinima = 50;
	public Pastura(Vector minerales, String nombre, boolean cosechaFina) {
		super(minerales, nombre, cosechaFina);
		// TODO Auto-generated constructor stub
	}
	public int getSuperficieMinima() {
		return superficieMinima;
	}
	public boolean acepta(Lote l){
		return super.acepta(l) && this.superficieMinima > l.superficie;
	}
}
