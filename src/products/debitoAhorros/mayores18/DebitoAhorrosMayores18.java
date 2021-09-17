package products.debitoAhorros.mayores18;

import java.util.HashMap;

public class DebitoAhorrosMayores18 {
	private HashMap<String, String> datosCuenta = new HashMap<String, String>();
	public double impuestos = 0.004;
	public double intereses = 0.0002;
	public double cuotaDeManejo = 2;
	public double limite = 200000;
	
	public void imprimirDatos() {
		
		System.out.println(datosCuenta);
	}

	public HashMap<String, String> getDatosCuenta() {
		return datosCuenta;
	}

	public void setDatosCuenta(HashMap<String, String> datosCuenta) {
		this.datosCuenta = datosCuenta;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
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
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
