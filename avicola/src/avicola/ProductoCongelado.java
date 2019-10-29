package avicola;

import java.time.LocalDate;

public class ProductoCongelado extends ProductoRefrigerado{

	public ProductoCongelado(LocalDate fechaVencimiento, int numLote, String nombre, int c, LocalDate f, String g, float t) {
		super(fechaVencimiento, numLote, nombre, c, f, g, t);
	}
	@Override
	public String imprimirProducto(Producto p) {
		// TODO Auto-generated method stub
		return super.imprimirProducto(p);
	}
	




}
