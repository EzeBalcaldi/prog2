package avicola;

import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoCongelado {
protected String metodo;
protected float segundos;
public CongeladoNitrogeno(LocalDate fechaVencimiento, int numLote, String nombre, int c, LocalDate f, String g, float t, String metodo, float segundos) {
	super(fechaVencimiento, numLote, nombre, c, f, g, t);
	this.metodo = metodo;
	this.segundos = segundos;
}
@Override
public String toString() {
	return "CongeladoNitrogeno [metodo=" + metodo + ", segundos=" + segundos
			+ ", codigo=" + codigo + ", fechaEnvasado=" + fechaEnvasado
			+ ", granjaOrigen=" + granjaOrigen + ", temperaturaRecomendada="
			+ temperaturaRecomendada + ", fechaVencimiento=" + fechaVencimiento
			+ ", numLote=" + numLote + ", nombre=" + nombre + "]";
}


}
