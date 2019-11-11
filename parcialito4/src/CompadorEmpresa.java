import java.util.Comparator;


public abstract class CompadorEmpresa implements Comparator<Empresa> {
	protected CompadorEmpresa siguiente;
	public CompadorEmpresa(CompadorEmpresa s){
		siguiente = s;
	}
	public  abstract int comparar(Empresa e, Empresa e1);
	public int compare(Empresa e, Empresa e1){
		int resultado = comparar(e, e1);
		if(resultado == 0 && siguiente !=null){
			resultado = siguiente.comparar(e, e1);
		}
		return resultado;

	}

}
