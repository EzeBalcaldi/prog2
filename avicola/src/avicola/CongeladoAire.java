package avicola;

import java.time.LocalDate;

public class CongeladoAire extends ProductoCongelado{
protected float porcentajeNitrogeno;
protected float porcentajeOxigeno;
protected float porcentajeDioxido;
protected float porcentajeAgua;
public CongeladoAire(LocalDate fechaVencimiento, int numLote, String nombre, int c, LocalDate f, String g, float t, float porcentajeNitrogeno, float porcentajeOxigeno, float porcentajeDioxido, float porcentajeAgua) {
	super(fechaVencimiento, numLote, nombre, c, f, g, t);
	this.porcentajeNitrogeno = porcentajeNitrogeno;
	this.porcentajeOxigeno = porcentajeOxigeno;
	this.porcentajeDioxido = porcentajeDioxido;
	this.porcentajeAgua = porcentajeAgua;
}
@Override
public String toString() {
	return "CongeladoAire [porcentajeNitrogeno=" + porcentajeNitrogeno
			+ ", porcentajeOxigeno=" + porcentajeOxigeno
			+ ", porcentajeDioxido=" + porcentajeDioxido + ", porcentajeAgua="
			+ porcentajeAgua + ", codigo=" + codigo + ", fechaEnvasado="
			+ fechaEnvasado + ", granjaOrigen=" + granjaOrigen
			+ ", temperaturaRecomendada=" + temperaturaRecomendada
			+ ", fechaVencimiento=" + fechaVencimiento + ", numLote=" + numLote
			+ ", nombre=" + nombre + "]";
}





}
