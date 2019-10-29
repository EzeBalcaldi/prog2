package tp5ej2;

public class CondicionCandidato extends Condicion{
	private Candidato c;
	public boolean seCumple(Voto v) {
		return c.equals(v.candidato);
	}

}
