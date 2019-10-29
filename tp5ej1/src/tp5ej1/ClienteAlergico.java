package tp5ej1;

import java.util.Vector;

public class ClienteAlergico extends Cliente{
	private Vector <String> alergias;

	public ClienteAlergico( ObraSocial os) {
		super(os);
		alergias = new Vector();
	}
	public void addAlergia(String a){
		alergias.add(a);
	}
	public void addSintoma(String a){
		super.addSintoma(a);
	}
	public String getAlergia(int index){
		return alergias.elementAt(index);
	}
	public boolean puedeUsar(Medicamento m){
		for(int i = 0; i< this.alergias.size(); i++){
			if(m.tieneSintoma((String)alergias.get(i))){
				return false;
			}
		}
		return true;
	}
	

}
