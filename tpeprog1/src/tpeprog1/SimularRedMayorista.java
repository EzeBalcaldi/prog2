package tpeprog1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SimularRedMayorista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcion;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println ("Ingrese string para iniciar primera parte: ");
		opcion = entrada.readLine();
		//INICIO PRIMERA PARTE////////////////////////////////////////////////
		
		Central central = new Central();
		central.inicializarCentral();
		Sucursal sucursal0 = new Sucursal();
		Sucursal sucursal1 = new Sucursal();
		Sucursal sucursal2 = new Sucursal();
		central.agregarSucursal(sucursal0);
		central.agregarSucursal(sucursal1);
		central.agregarSucursal(sucursal2);
		central.imprimirEstado();
		System.out.println ("Ingrese string para iniciar segunda parte: ");
		opcion = entrada.readLine();
		//INICIO SEGUNDA PARTE////////////////////////////////////////////////
		central.setCantidad(0, 50);
		central.setMaximo(0, 100);
		central.setMinimo(0, 20);
		central.setCantidad(1, 60);
		central.setMaximo(1, 90);
		central.setMinimo(1, 30);
		central.setCantidad(2, 150);
		central.setMaximo(2, 200);
		central.setMinimo(2, 30);
		sucursal0.setCantidad(0, 5);
		sucursal0.setMaximo(0, 10);
		sucursal0.setMinimo(0, 2);
		sucursal0.setCantidad(1, 6);
		sucursal0.setMaximo(1, 9);
		sucursal0.setMinimo(1, 3);
		sucursal0.setCantidad(2, 12);
		sucursal0.setMaximo(2, 20);
		sucursal0.setMinimo(2, 3);
		sucursal1.setCantidad(0, 5);
		sucursal1.setMaximo(0, 10);
		sucursal1.setMinimo(0, 2);
		sucursal1.setCantidad(1, 6);
		sucursal1.setMaximo(1, 9);
		sucursal1.setMinimo(1, 3);
		sucursal1.setCantidad(2, 12);
		sucursal1.setMaximo(2, 20);
		sucursal1.setMinimo(2, 3);
		sucursal2.setCantidad(1, 5);
		sucursal2.setMaximo(1, 12);
		sucursal2.setMinimo(1, 3);
		sucursal2.setCantidad(2, 18);
		sucursal2.setMaximo(2, 20);
		sucursal2.setMinimo(2, 3);
		central.imprimirEstado();
		System.out.println ("Ingrese string para iniciar tercera parte: ");
		opcion = entrada.readLine();
		sucursal0.venderProducto(0, 4);
		sucursal0.venderProducto(1, 2);
		sucursal1.venderProducto(0, 1);
		sucursal2.venderProducto(1, 5);
		sucursal2.venderProducto(2, 15);
		central.imprimirEstado();
		System.out.println ("Ingrese string para iniciar cuarta parte: ");
		opcion = entrada.readLine();
		central.productosFaltantes();
		central.imprimirEstado();
		System.out.println ("Ingrese string para iniciar quinta parte: ");
		opcion = entrada.readLine();
		central.completarProductos();
		System.out.println ("Ingrese string para iniciar sexta parte: ");
		opcion = entrada.readLine();
		central.adquirirProductos();
		System.out.println ("Ingrese string para salir: ");
		opcion = entrada.readLine();
		}
		catch (Exception exc){
			System.out.println(exc);
			}
}
}