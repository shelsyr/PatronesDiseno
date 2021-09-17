package products.credito.pensionados;

import java.util.HashMap;

public class CreditoPensionados {
	private HashMap<String, String> datosCuenta = new HashMap<String, String>();
	public double intereses = 0.02;
	public double cuotaDeManejo = 6000;
	public double cupo = 6000000; 
	public double cuotas = 1;
	
	public void imprimirDatos() {
		
		System.out.println(datosCuenta);
	}

	public HashMap<String, String> getDatosCuenta() {
		return datosCuenta;
	}

	public void setDatosCuenta(HashMap<String, String> datosCuenta) {
		this.datosCuenta = datosCuenta;
	}

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	public double getCuotaDeManejo() {
		return cuotaDeManejo;
	}

	public void setCuotaDeManejo(double cuotaDeManejo) {
		this.cuotaDeManejo = cuotaDeManejo;
	}

	public double getCupo() {
		return cupo;
	}

	public void setCupo(double cupo) {
		this.cupo = cupo;
	}

	public double getCuotas() {
		return cuotas;
	}

	public void setCuotas(double cuotas) {
		this.cuotas = cuotas;
	}
	
	
}
