package prog2;

import java.util.Vector;

public class Lote {
protected String nombre;
protected Vector minerales;
protected int superficie;
public Lote(String nombre, Vector cereales, int superficie) {
	this.nombre = nombre;
	this.minerales = cereales;
	this.superficie = superficie;
}
public boolean tieneMineral(String mineral){
	if(minerales.contains((String)mineral)){
		return true;
	}
return false;
}
}
