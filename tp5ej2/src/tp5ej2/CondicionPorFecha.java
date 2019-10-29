package tp5ej2;

import java.time.LocalDate;

public class CondicionPorFecha extends Condicion {
	protected LocalDate maximo;
	protected LocalDate minimo;

	public boolean seCumple(Voto v) {
//		return (v.fecha <= minimo && v.fecha >= maximo);
		return false;
	}

}
