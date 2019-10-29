package avicola;

import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado{
protected float salinidad;

public CongeladoAgua(LocalDate fechaVencimiento, int numLote, String nombre,
		int c, LocalDate f, String g, float t, float salinidad) {
	super(fechaVencimiento, numLote, nombre, c, f, g, t);
	this.salinidad = salinidad;
}

@Override
public String toString() {
	return "CongeladoAgua [salinidad=" + salinidad + ", codigo=" + codigo
			+ ", fechaEnvasado=" + fechaEnvasado + ", granjaOrigen="
			+ granjaOrigen + ", temperaturaRecomendada="
			+ temperaturaRecomendada + ", fechaVencimiento=" + fechaVencimiento
			+ ", numLote=" + numLote + ", nombre=" + nombre + "]";
}





}
