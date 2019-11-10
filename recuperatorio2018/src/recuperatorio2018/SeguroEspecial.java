package recuperatorio2018;

import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroEspecial extends SistemaSeguros {
	protected LocalDate inicio;
	protected LocalDate fin;
	protected SistemaSeguros seguro;
	protected double recargo;
	public SeguroEspecial( LocalDate inicio, LocalDate fin, double r, SistemaSeguros s) {
		this.inicio = inicio;
		this.fin = fin;
		this.recargo = r;
		this.seguro = s;
	}
	public ArrayList<SistemaSeguros> getSeguros(Condicion c) {
		ArrayList<SistemaSeguros> aux = new ArrayList<SistemaSeguros>();
		if(isActivo()){
			aux.addAll(seguro.getSeguros(c));
		}
		return aux;
	}
	public double getPrecio() {
		double total = ((this.recargo*seguro.precio)/100);
		return seguro.precio +total ;
	}
	private boolean isActivo(){
		return (inicio.isBefore(LocalDate.now())&& (fin.isAfter(LocalDate.now())));
	}
}
