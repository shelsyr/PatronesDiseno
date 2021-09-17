package products.cdt.empresarios;

import java.util.HashMap;
import products.cdt.PerfilesCDT;

public class CDTBuilderEmpresarios extends PerfilesCDT{

	private CDTEmpresarios cdt;
	
	 public CDTBuilderEmpresarios(){
         
     }  
     
     private CDTBuilderEmpresarios(CDTBuilderEmpresarios s){
         super(s);
         this.baseMonto = s.baseMonto;
         this.baseTiempo = s.baseTiempo;
         this.intereses = s.intereses;
         this.nivelDeRiesgo = s.nivelDeRiesgo;
     }

	public void reset() {
		cdt = new CDTEmpresarios();
	}
	
	private HashMap<String, String> datosPersonales = new HashMap<String, String>();
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
	
	public CDTEmpresarios getProduct() {
		return this.cdt;
	}
	
	@Override
    public PerfilesCDT clone() {
        return new CDTBuilderEmpresarios(this);
    }
}
