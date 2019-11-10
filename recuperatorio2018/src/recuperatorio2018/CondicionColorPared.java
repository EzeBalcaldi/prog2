package recuperatorio2018;

public class CondicionColorPared extends Condicion{
	private String color;

	public CondicionColorPared(String color) {
		this.color = color;
	}

	public boolean seCumple(SeguroSimple s) {
		return color.equals(s.datos.get(color));
	}
	

}
