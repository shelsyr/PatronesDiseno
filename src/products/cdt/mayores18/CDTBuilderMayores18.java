package products.cdt.mayores18;

import java.util.HashMap;

import products.cdt.*;
import products.cdt.empresarios.CDTBuilderEmpresarios;

public class CDTBuilderMayores18 extends PerfilesCDT{
	private HashMap<String, String> datosPersonales = new HashMap<String, String>();
	private CDTmayores18 cdt;

	public CDTBuilderMayores18(){
		
		
	}
    
    private CDTBuilderMayores18(CDTBuilderMayores18 s){
        super(s);
        this.baseMonto = s.baseMonto;
        this.baseTiempo = s.baseTiempo;
        this.intereses = s.intereses;
        this.nivelDeRiesgo = s.nivelDeRiesgo;
    }
	
	public void reset() {
		cdt = new CDTmayores18();
	}
	

	public void putDatosPersonalesTitular(String nombre, String id, String fechaNacimiento) {
		datosPersonales.put("nombre", nombre);
		datosPersonales.put("id", id);
		datosPersonales.put("fechaN", fechaNacimiento);
		cdt.setDatosPersonales(datosPersonales);
		
	}

	public void retirar() {
		
		System.out.println("Se ha retirado el dinero!");
		
	}

	public void consultar() {
		System.out.println("Se ha hecho la consulta con exito");
		
	}

	public void putBaseMonto(double monto) {
		cdt.setBaseMonto(monto);
		
	}

	public void putBaseTiempo(double tiempo) {
		cdt.setBaseTiempo(tiempo);
		
	}
	
	public void putIntereses(double interes) {
		cdt.setIntereses(interes);
		
	}
	
	public void putNivelRiesgo(double nivelR) {
		cdt.setNivelDeRiesgo(nivelR);
		
	}
	
	public CDTmayores18 getProduct() {
		return this.cdt;
	}

	
	public PerfilesCDT clone() {
		return new CDTBuilderMayores18(this);
	}
	
}
