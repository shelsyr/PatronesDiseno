package products.tarjetas.tarjetaCredito;

import java.util.HashMap;

public class TarjetaCredito {
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
