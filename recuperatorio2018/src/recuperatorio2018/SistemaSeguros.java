package recuperatorio2018;

import java.util.ArrayList;

public abstract class SistemaSeguros {
	protected double precio;
	public abstract ArrayList<SistemaSeguros> getSeguros(Condicion c);
	public abstract double getPrecio();

}
