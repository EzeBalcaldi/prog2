
public class ComparadorNombre extends CompadorEmpresa {

	public ComparadorNombre(CompadorEmpresa s) {
		super(s);
	}
	public int comparar(Empresa e, Empresa e1) {
		return e.nombre.compareTo(e1.nombre);
	}

}
