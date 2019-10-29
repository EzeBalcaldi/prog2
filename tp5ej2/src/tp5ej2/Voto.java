package tp5ej2;

import java.time.LocalDate;

public class Voto {
protected LocalDate fecha;
protected Candidato candidato;
public Voto(LocalDate fecha, Candidato candidato) {
	this.fecha = fecha;
	this.candidato = candidato;
}

}
