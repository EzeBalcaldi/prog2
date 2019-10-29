package avicola;

import java.time.LocalDate;

public class Producto {
protected LocalDate fechaVencimiento;
protected int numLote;
protected String nombre;
public Producto(LocalDate fechaVencimiento, int numLote, String nombre) {
	this.fechaVencimiento = fechaVencimiento;
	this.numLote = numLote;
	this.nombre = nombre;
}
public String imprimirProducto(Producto p){
	return p.toString();
}

}
