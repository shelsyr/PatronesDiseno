package products.cdt.empresarios;

import java.util.HashMap;

public class CDTEmpresarios {
	private HashMap<String, String> datosPersonales = new HashMap<String, String>();
	public double baseMonto = 3000000;
	public double baseTiempo = 5;
	public double intereses = 0.03;
	public double nivelDeRiesgo = 0.0009;
	
	public void imprimirDatosCDT() {
		System.out.println(datosPersonales);
		System.out.println(baseMonto);
		System.out.println(baseTiempo);
		System.out.println(intereses);
		System.out.println(nivelDeRiesgo);
	}
	
	public void imprimirDatosPersonales() {
		
		System.out.println(datosPersonales);
	}

	public HashMap<String, String> getDatosPersonales() {
		return datosPersonales;
	}

	public void setDatosPersonales(HashMap<String, String> datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	public double getBaseMonto() {
		return baseMonto;
	}

	public void setBaseMonto(double baseMonto) {
		this.baseMonto = baseMonto;
	}

	public double getBaseTiempo() {
		return baseTiempo;
	}

	public void setBaseTiempo(double baseTiempo) {
		this.baseTiempo = baseTiempo;
	}

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	public double getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(double nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	
}
