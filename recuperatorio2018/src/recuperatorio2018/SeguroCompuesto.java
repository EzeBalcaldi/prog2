package recuperatorio2018;

import java.util.ArrayList;

public class SeguroCompuesto extends SistemaSeguros{
protected ArrayList<SeguroSimple> seguros;
protected double descuento;
public SeguroCompuesto(double p, double d) {
	this.precio = p;
	this.descuento = d;
	this.seguros = new ArrayList<SeguroSimple>();
}
public void add(SeguroSimple s){
	seguros.add(s);
}
public ArrayList<SistemaSeguros> getSeguros(Condicion c) {
	ArrayList<SistemaSeguros> aux = new ArrayList<SistemaSeguros>();
	for(SistemaSeguros s: seguros){
		aux.addAll(s.getSeguros(c));
	}
	return aux;
	
}
@Override
public double getPrecio() {
	double suma = 0;
	for(SeguroSimple s: seguros){
		suma = suma +s.getPrecio();
	}
	return suma * descuento;
}
}
