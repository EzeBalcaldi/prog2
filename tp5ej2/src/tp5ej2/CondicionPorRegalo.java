package tp5ej2;

public class CondicionPorRegalo extends CondicionNavidad{
	private String regalo;

	public CondicionPorRegalo(String regalo) {
		this.regalo = regalo;
	}

	public boolean seCumple(Carta c) {
		return c.regalos.contains(regalo);
	}

}
