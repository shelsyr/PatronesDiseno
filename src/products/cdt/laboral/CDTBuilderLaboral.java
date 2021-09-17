package products.cdt.laboral;
import java.util.HashMap;

import products.cdt.IBuilderCDT;
import products.cdt.PerfilesCDT;
import products.cdt.empresarios.CDTBuilderEmpresarios;

public class CDTBuilderLaboral extends PerfilesCDT{
	
	private HashMap<String, String> datosPersonales = new HashMap<String, String>();
	private CDTLaboral cdt;
	
	public CDTBuilderLaboral(){
        
    }  
    
    private CDTBuilderLaboral(CDTBuilderLaboral s){
        super(s);
        this.baseMonto = s.baseMonto;
        this.baseTiempo = s.baseTiempo;
        this.intereses = s.intereses;
        this.nivelDeRiesgo = s.nivelDeRiesgo;
    }
	
	public void reset() {
		cdt = new CDTLaboral();
	}

	@Override
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
	
	public CDTLaboral getProduct() {
		return this.cdt;
	}
	
	@Override
    public PerfilesCDT clone() {
        return new CDTBuilderLaboral(this);
    }
}
