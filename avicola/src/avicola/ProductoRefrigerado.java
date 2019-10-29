package avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
protected int codigo;
protected LocalDate fechaEnvasado;
protected String granjaOrigen;
protected float temperaturaRecomendada;
public ProductoRefrigerado(LocalDate fechaVencimiento, int numLote, String nombre, int c, LocalDate f, String g, float t) {
	super(fechaVencimiento, numLote, nombre);
	codigo = c;
	fechaEnvasado = f;
	granjaOrigen = g;
	temperaturaRecomendada = t;
}
@Override
public String toString() {
	return "ProductoRefrigerado [codigo=" + codigo + ", fechaEnvasado="
			+ fechaEnvasado + ", granjaOrigen=" + granjaOrigen
			+ ", temperaturaRecomendada=" + temperaturaRecomendada
			+ ", fechaVencimiento=" + fechaVencimiento + ", numLote=" + numLote
			+ ", nombre=" + nombre + "]";
}
public String imprimirProducto(Producto p) {
	// TODO Auto-generated method stub
	return super.imprimirProducto(p);
}



}
