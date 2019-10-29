import java.util.Comparator;


public class ComparatorNombre implements Comparator<Ciudad> {

	public int compare(Ciudad o1, Ciudad o2) {
		return o1.nombre.compareTo(o2.nombre);
	}
}
