package prog2;

import java.util.Vector;

public class Cereal {
	protected Vector minerales;
	protected String nombre;
	protected boolean cosechaFina;
	public Cereal(Vector minerales, String nombre, boolean cosechaFina) {
		this.minerales = minerales;
		this.nombre = nombre;
		this.cosechaFina = cosechaFina;
	}

	public boolean acepta(Lote l){
		for(int i = 0; i< this.minerales.size(); i++){
			if(l.tieneMineral((String)minerales.get(i))){
				return true;
			}
		}
		return false;
	}

}
