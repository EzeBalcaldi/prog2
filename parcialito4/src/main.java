
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Continente c= new Continente("xd");
		Ciudad c1 = new Ciudad("b", " x2", 15000, 10000, 100);
		Ciudad c2 = new Ciudad("a", " x2", 15000, 10000, 100);
		Ciudad c3 = new Ciudad("d", " x2", 15000, 10000, 100);
		Ciudad c4 = new Ciudad("c", " x2", 15000, 10000, 100);
		Ciudad c5 = new Ciudad("e", " x2", 15000, 10000, 100);

	
		
		c.add(c1);
		c.add(c2);
		c.add(c3);	c.add(c4);	c.add(c5);
		System.out.println(c.cantidadHabitantes());
		c.ciudadesDeficit();

		
	}

}
