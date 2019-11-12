package recuperatorio2018;

public class CondicionAtributoDinamico extends Condicion{
	private Object valor;
	private String clave;
	public CondicionAtributoDinamico(String clave, Object valor){
		this.valor = valor;
		this.clave = clave;
	}

	public boolean seCumple(SeguroSimple s) {
		return s.datos.get(clave).equals(this.valor);
	}

}
