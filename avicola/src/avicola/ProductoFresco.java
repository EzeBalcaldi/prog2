package avicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
protected LocalDate fechaEnvasado;
protected String granjaOrigen;
public ProductoFresco(LocalDate fechaVencimiento, int numLote, String nombre, LocalDate fechaEnvasado, String granjaOrigen) {
	super(fechaVencimiento, numLote, nombre);
	this.fechaEnvasado = fechaEnvasado;
	this.granjaOrigen = granjaOrigen;
}
@Override
public String toString() {
	return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", granjaOrigen="
			+ granjaOrigen + ", fechaVencimiento=" + fechaVencimiento
			+ ", numLote=" + numLote + ", nombre=" + nombre + "]";
}
public String imprimirProducto(Producto p) {
	// TODO Auto-generated method stub
	return super.imprimirProducto(p);
}

}
