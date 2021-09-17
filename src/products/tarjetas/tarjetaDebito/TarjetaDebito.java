package products.tarjetas.tarjetaDebito;

import java.util.HashMap;

public class TarjetaDebito {
private HashMap<String, String> datosTarjeta = new HashMap<String, String>();
	
	public void imprimirDatos() {
		
		System.out.println(datosTarjeta);
	}
	
	public HashMap<String, String> getDatosTarjeta() {
		return datosTarjeta;
	}

	public void setDatosTarjeta(HashMap<String, String> datosTarjeta) {
		this.datosTarjeta = datosTarjeta;
	}
}
