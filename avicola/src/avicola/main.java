package avicola;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CongeladoAire ca = new CongeladoAire(LocalDate.now(), 0, "congelado aire", 55, LocalDate.now(), "granja el caldito feliz", 39, 1, 5, 3, 3);
	System.out.println(ca.imprimirProducto(ca));
	}

}
