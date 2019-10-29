package tp5ej1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacia f = new Farmacia("farmacia1");
		ObraSocial o = new ObraSocial(0.5, "osde");
		Cliente c = new Cliente(o);
		Medicamento m = new Medicamento("refrianex", 100);
		m.addSintoma("dolor de cabeza");
		m.addSintoma("asd");
		c.addSintoma("asd");
		c.addSintoma("dolor de cabeza");
		System.out.println(c.puedeUsar(m));
		//System.out.println(f.calcularPrecio(m, c));
		//System.out.println(f.puedoVender(m, c));
		
	}

}
